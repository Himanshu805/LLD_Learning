package Patterns.Behavioural.Observer;


import java.util.ArrayList;
import java.util.List;

interface StockListener3 {

    public void updated(int stock);
}

class App3 implements StockListener3{
    @Override
    public void updated(int stock) {
        System.out.println("App : BurgerStock updated to "+stock);
    }

}

class Web3 implements StockListener3{
    @Override
    public void updated(int stock) {
        System.out.println("Web : BurgerStock updated to "+stock);
    }
}
class BurgerStock3{
    private int stock;

    List<StockListener3> stockListeners = new ArrayList<>();

    public void addStockListener(StockListener3 stockListener){
        stockListeners.add(stockListener);
    }

    void setStock(int stock){
        this.stock = stock;

        for(StockListener3 stockListener : stockListeners){
            stockListener.updated(stock);
        }

    }
}

public class Sol3 {
    public static void main(String[] args) {
        BurgerStock3 burgerStock = new BurgerStock3();
        burgerStock.addStockListener(new App3());
        burgerStock.addStockListener(new Web3());
        burgerStock.setStock(5);
        burgerStock.setStock(10);
        burgerStock.setStock(6);


    }
}


// Pros :
// - Follows Open/Closed Principle: New listeners can be added without modifying existing code.
// - Loose coupling: Listeners are added dynamically, allowing for greater flexibility and extensibility.
// - Easy to extend: New notification receivers can be added without changing the BurgerStock3 class.
// - Follows Dependency Inversion Principle: BurgerStock3 depends on the abstraction (stockListener1) rather than concrete implementations.


// Cons :
// Voilates Single Responsibility Principle: BurgerStock3 still manages both stock and listener management.
// - No built-in mechanism to remove listeners, which could lead to memory leaks if not managed properly.
