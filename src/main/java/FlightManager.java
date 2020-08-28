public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public Flight getFlight() {
        return flight;
    }

    public float calculateMaxIndividualBagWeight() {
        float maxStorageWeight = flight.getAssignedPlane().getType().getWeight() / 2;
        return maxStorageWeight / flight.getAssignedPlane().getType().getSeats();
    }
}
