import java.text.DecimalFormat;
public class CollectionGetter implements Runnable{
    private String stock;
    private int startTime;
    private double price;
    private priceObservable collectionShop;
    public CollectionGetter(priceObservable collectionShop,int newStartTime, String newStock, double newPrice){
        this.collectionShop = collectionShop;
        startTime=newStartTime;
        stock = newStock;
        price = newPrice;
    }
    public void run(){
        for(int i = 1; i <= 20; i++){
            try{
                Thread.sleep(5000);
            }
            catch(InterruptedException e)
            {}
            double randNum = (Math.random() *10) - 3;


            DecimalFormat decimal = new DecimalFormat("##.##");

            price = price + randNum;

            if(stock == "Game") ((CollectionShop) collectionShop).setGamePrice(price);
            if(stock == "Book") ((CollectionShop) collectionShop).setBookPrice(price);
            if(stock == "Art") ((CollectionShop) collectionShop).setArt(price);

            System.out.println(stock + ": " + decimal.format((price + randNum)) +
                    " " + decimal.format(randNum));

            System.out.println();

        }
    }


}
