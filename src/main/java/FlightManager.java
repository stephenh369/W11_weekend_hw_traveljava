public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public float calculateMaxIndividualBagWeight() {
        float maxBagWeight = flight.getAssignedPlane().getType().getWeight() / 2;
        return maxBagWeight / flight.getAssignedPlane().getType().getSeats();
    }

    public double calculateBagWeightBooked() {
        double total = 0.00;
        for (Passenger i : flight.getPassengers()) {
            total += i.getBagWeight();
        }
        return total;
    }
}
