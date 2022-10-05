public class Romance implements book{
    @Override
    public String getVoucher() {
        return "The cost of romance book: 80";
    }

    @Override
    public double getPrice() {
        return 80;
    }
}
