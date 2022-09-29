public class Main {
    public static void main(String[] args){
        CollectionShop collectionShop = new CollectionShop();

        // Creating an Observer that will be sent updates from priceObserver

        CollectionObserver observer1 = new CollectionObserver(collectionShop);

        collectionShop.setGamePrice(250.00);
        collectionShop.setBookPrice(44.60);
        collectionShop.setArt(30.40);

        CollectionObserver observer2 = new CollectionObserver(collectionShop);

        collectionShop.setGamePrice(250.00);
        collectionShop.setBookPrice(44.60);
        collectionShop.setArt(30.40);

        // Delete one of the observers

        collectionShop.unregister(observer2);
        Runnable getGame = new CollectionGetter(collectionShop, 2,"Game", 212.00);
        Runnable getBook = new CollectionGetter(collectionShop,  2,"Book", 52.00);
        Runnable getArt = new CollectionGetter(collectionShop, 2,"Art", 123.00);


        new Thread(getGame).start();
        new Thread(getBook).start();
        new Thread(getArt).start();


    }
}
