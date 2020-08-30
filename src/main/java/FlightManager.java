import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private ArrayList<Integer> availableSeats;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.availableSeats = new ArrayList<>();
        for (int i = 1; i <= flight.seatsAvailable(); i++) {
            this.availableSeats.add(i);
        }
    }

    public Flight getFlight() {
        return flight;
    }

    public double calculateMaxIndividualBagWeight() {
        double maxBagWeight = flight.getAssignedPlane().getType().getWeight() / 2;
        return maxBagWeight / flight.getAssignedPlane().getType().getSeats();
    }

    public double calculateBagWeightBooked() {
        double total = 0.00;
        for (Passenger i : flight.getPassengers()) {
            total += i.getBagWeight();
        }
        return total;
    }

    public double calculateBagWeightAvailable() {
        double maxBagWeight = flight.getAssignedPlane().getType().getWeight() / 2.00;
        return  maxBagWeight - calculateBagWeightBooked();
    }

    public void bookPassenger(Passenger passenger) {
        getFlight().addPassenger(passenger);
        passenger.setFlight(flight);
        for (Integer seat : availableSeats) {
            if (flight.randomAvailableSeat() != seat) {
                passenger.setSeatNum();
            }
        }
    }

}
