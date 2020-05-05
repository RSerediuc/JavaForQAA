class Ford extends Car {
    private int weight;
    private int manufacturerDiscount;

    public Ford(int manufacturerDiscount, int weight, int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);
        this.manufacturerDiscount = manufacturerDiscount;
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double fordPrice = super.getSalePrice() - manufacturerDiscount;
        return fordPrice;
    }
}
