import java.util.ArrayList;

public class CollectionShop implements priceObservable{
    private ArrayList<Observer> observers;
    private double gamePrice;
    private double bookPrice;
    private double artPrice;

    public CollectionShop(){
        observers = new ArrayList<Observer>();

    }
    @Override
    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {


        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Client with ID  " + (observerIndex+1) + " was deleted");
        observers.remove(observerIndex);

    }
    public void notifyObserver() {
        for(Observer observer : observers){
            observer.update(gamePrice, bookPrice, artPrice);

        }

    }
    public void setGamePrice(double newGamePrice){
        this.gamePrice = newGamePrice;
        notifyObserver();
    }

    public void setBookPrice(double newBook){
        this.bookPrice = newBook;
        notifyObserver();
    }

    public void setArt(double newArt){
        this.artPrice = newArt;
        notifyObserver();
    }
}


