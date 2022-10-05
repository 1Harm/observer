public class signature extends bookDecorator{

    public signature(book iBook){
        this.iBook = iBook;
    }

    @Override
    public String getVoucher() {
        return iBook.getVoucher()+", signature of author (20.8)";
    }


    @Override
    public double getPrice() {
        return iBook.getPrice() + 20.8;
    }
}
