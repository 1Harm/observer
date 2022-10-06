import static java.lang.Math.round;

public class Main {
    public static void main(String[] args){
/*    CollectionShop collectionShop = new CollectionShop();

  //       Creating an Observer that will be sent updates from priceObserver

        CollectionObserver observer1 = new CollectionObserver(collectionShop);

        collectionShop.setGamePrice(212.00);
        collectionShop.setBookPrice(52.00);
        collectionShop.setArt(123.00);

        CollectionObserver observer2 = new CollectionObserver(collectionShop);

        collectionShop.setGamePrice(212.00);
        collectionShop.setBookPrice(52.00);
        collectionShop.setArt(123.00);

         //Delete one of the observers

        collectionShop.unregister(observer2);
        Runnable getGame = new CollectionGetter(collectionShop, 2,"Game", 212.00);
        Runnable getBook = new CollectionGetter(collectionShop,  2,"Book", 52.00);
        Runnable getArt = new CollectionGetter(collectionShop, 2,"Art", 123.00);


        new Thread(getGame).start();
        new Thread(getBook).start();
        new Thread(getArt).start();*/

        dressable histDress = new historicalDress(new basicOutfit());
        histDress.collecting();
        System.out.println();

        dressable valDress = new valueableDress(new basicOutfit());
        valDress.collecting();
        System.out.println();



        dressable historicalValuableDress = new historicalDress(new valueableDress(new basicOutfit()));
        historicalValuableDress.collecting();
        System.out.println();

        book romance = new Romance();
        romance=new signature(romance);
        romance=new additionalEdition(romance);
        System.out.println("List: "+romance.getVoucher());
        System.out.println("Price: "+round(romance.getPrice()));
        book sciFi=new SciFiBook();
        sciFi=new signature(sciFi);
        sciFi=new limitedCollection(sciFi);
        System.out.println("List: "+sciFi.getVoucher());
        System.out.println("Price: "+sciFi.getPrice());
        book ord=new ordinaryBook();
        ord=new limitedCollection(ord);
        System.out.println("List: "+ord.getVoucher());
        System.out.println("Price: "+ord.getPrice());
    }
}
