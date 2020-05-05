class Truck extends Car {
    private int weight;

    public Truck(int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            double truckPrice = super.getSalePrice() - (super.getSalePrice() * 0.1);
            return truckPrice;
        } else {
            double truckPrice = super.getSalePrice() - (super.getSalePrice() * 0.2);
            return truckPrice;
        }
    }
}