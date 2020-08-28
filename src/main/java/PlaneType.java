public enum PlaneType {
    BOEING747(450, 400),
    AIRBUSA350(300, 350),
    EMPTYPLANE(0, 0);

    private final int weight;
    private final int seats;

    PlaneType(int weight, int seats) {
        this.weight = weight;
        this.seats = seats;
    }

    public int getWeight() {
        return weight;
    }

    public int getSeats() {
        return seats;
    }
}
