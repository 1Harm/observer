public class Screen extends CarDecorator{
    public Screen(MyCar car){
        this.car=car;
    }

    @Override
    public String getVoucher() {
        return "Comfort +";
    }
    @Override
    public double getPrice(double price) {
        this.price=price;
        return price;
    }
}
