public class CollectionObserver implements Observer{
    private double gamePrice;
    private double bookPrice;
    private double artPrice;

    private static int observerIDTracker = 0;

    private int observerID;

    public CollectionObserver(priceObservable CollectionShop){
        this.observerID = ++observerIDTracker;


        System.out.println("Client with ID " + this.observerID);
        CollectionShop.register(this);
    }
    public void printThePrices(){

        System.out.println("Client with ID " + observerID + "\nGame: " + gamePrice + "\nBook: " +
                bookPrice + "\nArt: " + artPrice + "\n");

    }

    @Override
    public void update(double gamePrice, double bookPrice, double artPrice) {
        this.gamePrice = gamePrice;
        this.bookPrice = bookPrice;
        this.artPrice = artPrice;

        printThePrices();
    }
}

