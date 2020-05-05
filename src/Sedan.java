class Sedan extends Car {
    private int length;

    public Sedan(int length,int speed, double regularPrice, String color) {
        super(speed, regularPrice, color);

        this.length = length;
    }

    @Override
    public double getSalePrice() {
        if (length > 20) {
            double sedanPrice = super.getSalePrice() - (super.getSalePrice() * 0.05);
            return sedanPrice;
        } else {
            double sedanPrice = super.getSalePrice() - (super.getSalePrice() * 0.1);
            return sedanPrice;
        }
    }
}
