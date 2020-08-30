import java.util.ArrayList;

public class FlightManager {

    private Flight flight;
    private ArrayList<Integer> takenSeats;

    public FlightManager(Flight flight) {
        this.flight = flight;
        this.takenSeats = new ArrayList<>();
        for (Passenger i : flight.getPassengers()) {
            takenSeats.add(i.getSeatNum());
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
//        if (passenger.getBagWeight() < calculateMaxIndividualBagWeight()) {
            getFlight().addPassenger(passenger);
            passenger.setFlight(flight);
//            for (Integer seat : takenSeats) {
//                if (flight.randomAvailableSeat() != seat) {
                    passenger.setSeatNum();
//                }
//            }
//        }
    }

}
