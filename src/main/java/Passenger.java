public class Passenger {

    private String name;
    private int bagWeight;
    private Flight flight;

    public Passenger(String name, int bagWeight) {
        this.name = name;
        this.bagWeight = bagWeight;
    }

    public String getName() {
        return name;
    }

    public int getBagWeight() {
        return bagWeight;
    }


    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
