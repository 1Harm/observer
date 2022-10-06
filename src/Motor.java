public class Motor extends CarDecorator{
    public Motor(MyCar car){
        this.car=car;
    }

    @Override
    public String getVoucher() {
        return "Comfort ";
    }
    @Override
    public double getPrice(double price) {
        this.price=price;
        return price;
    }
}
