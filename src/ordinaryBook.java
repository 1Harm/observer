public class ordinaryBook  implements book{
    @Override
    public String getVoucher() {
        return "The cost of ordinary book: 50 ";
    }

    @Override
    public double getPrice() {
        return 50;
    }
}
