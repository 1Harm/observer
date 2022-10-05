public abstract class bookDecorator implements book{
    protected book iBook;
    @Override
    public String getVoucher() {
        return "Features:";
    }
}
