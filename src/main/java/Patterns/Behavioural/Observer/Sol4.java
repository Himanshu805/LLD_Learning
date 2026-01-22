package Patterns.Behavioural.Observer;

import java.util.ArrayList;
import java.util.List;

//The Observer Design Pattern is a behavioral pattern used to establish a "one-to-many" relationship between objects.
//When one object (the Subject)changes its state, all its dependents (Observers) are notified and updated automatically.

// Components of Observer Pattern:
// 1. Subject: The object that holds the state and notifies observers about changes.
// 2. Observer: The object that wants to be notified about changes in the subject's state.
// 3. ConcreteSubject: A concrete implementation of the subject that maintains a list of observers and notifies them.
// 4. ConcreteObserver: A concrete implementation of the observer that reacts to notifications from the subject.

// When to use Observer Pattern ?
// - When an object (subject) needs to notify multiple objects (observers) about changes in its state.




interface StockListener4 {
    void updateStock(int stock);
}

class WebListener4 implements StockListener4 {
    @Override
    public void updateStock(int stock) {
        System.out.println("Web : BurgerStock updated to "+stock);
    }
}

class AppListener4 implements StockListener4 {
    @Override
    public void updateStock(int stock) {
        System.out.println("App : BurgerStock updated to "+stock);
    }
}

interface Subject{
    public void updateSotck(int stock);
    public void addListener(StockListener4 listener);
    public void removeListener(StockListener4 listener);
}

class BurgerStock4 implements Subject{
    private int stock;
    List<StockListener4> listeners = new ArrayList<>();

    @Override
    public void addListener(StockListener4 listener) {
        listeners.add(listener);
    }

    @Override
    public void removeListener(StockListener4 listener) {
        listeners.remove(listener);
    }
    private void notifyListener() {
        for (StockListener4 listener : listeners) {
            listener.updateStock(stock);
        }
    }

    @Override
    public void updateSotck(int stock) {
        this.stock = stock;
        notifyListener();


    }
}


public class Sol4 {
    public static void main(String[] args) {
        BurgerStock4 burgerStock = new BurgerStock4();

        WebListener4 webListener = new WebListener4();
        burgerStock.addListener(webListener);
        burgerStock.addListener(new AppListener4());
        burgerStock.updateSotck(4);
        burgerStock.updateSotck(5);
        burgerStock.updateSotck(6);

        // can remove Observer during runtime
        burgerStock.removeListener(webListener);
        burgerStock.updateSotck(7);
    }
}
