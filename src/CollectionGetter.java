import java.text.DecimalFormat;
public class CollectionGetter implements Runnable{
    private String stock;
    private double price;
    private priceObservable collectionShop;
    public CollectionGetter(priceObservable collectionShop, String newStock, double newPrice){
        this.collectionShop = collectionShop;
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
            double randNum = (Math.random() * (.06)) - .03;

            // Formats decimals to 2 places

            DecimalFormat df = new DecimalFormat("#.##");

            // Change the price and then convert it back into a double

            price = Double.valueOf(df.format((price + randNum)));
            if(stock == "Game") ((CollectionShop) collectionShop).setGamePrice(price);
            if(stock == "Book") ((CollectionShop) collectionShop).setBookPrice(price);
            if(stock == "Art") ((CollectionShop) collectionShop).setArt(price);
            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));

            System.out.println();

        }
    }


}
