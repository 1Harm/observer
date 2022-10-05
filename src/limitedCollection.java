public class limitedCollection extends bookDecorator{
    public limitedCollection(book iBook){
        this.iBook = iBook;
    }
    @Override
    public double getPrice() {
        return iBook.getPrice() + 120;
    }
    @Override
    public String getVoucher() {
        return iBook.getVoucher()+", limited collection cost (120)";
    }



}
