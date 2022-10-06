public abstract class CarDecorator implements MyCar{
    protected MyCar car;
    protected double price;

    @Override
    public String getVoucher() {
        return "Features:";
    }
}
