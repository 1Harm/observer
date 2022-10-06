public class EngineCapacity extends CarDecorator {
    public EngineCapacity(MyCar car){
        this.car=car;
    }

    @Override
    public String getVoucher() {
        return "Sport Car";
    }
    @Override
    public double getPrice(double price) {
        this.price=price;
        return price;
    }
}
