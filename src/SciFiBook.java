public class SciFiBook  implements book{
    @Override
    public String getVoucher() {
        return "The cost of sci-fi book: 100";
    }

    @Override
    public double getPrice() {
        return 100;
    }
}
