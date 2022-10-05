public class additionalEdition extends bookDecorator{
    public additionalEdition(book iBook){
        this.iBook = iBook;
    }
    @Override
    public String getVoucher() {
        return iBook.getVoucher()+", Additional edition for this book (30.56)";
    }
    @Override
    public double getPrice() {
        return iBook.getPrice() + 30.56;
    }
}
