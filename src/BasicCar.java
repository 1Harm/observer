public class BasicCar implements MyCar{

    private double price;

    @Override
    public String getVoucher() {
        return "The cost of ordinary book: ";
    }

    @Override
    public double getPrice(double price) {
        price=this.price;
        return price;
    }
}
