package Patterns.Behavioural.Observer;


class BurgerStock{
    private int stock;

    public void setStock(int stock){
        this.stock = stock;
        System.out.println("Website : Burger stock has been updated to " + stock);
        System.out.println("App : Burger stock has been updated to " + stock);

    }
}

public class Sol1 {
    public static void main(String[] args) {

        BurgerStock burgerStock = new BurgerStock();
        burgerStock.setStock(1);
        burgerStock.setStock(2);
        burgerStock.setStock(3);
        burgerStock.setStock(4);
    }
}


// Cons :
// Voilates the Single Responsibility Principle
// Voilates the Open/Closed Principle
// Tight coupling on the website and app (notification receivers)
// Selective notification not possible
// No easy way to add more notification receivers during runtime

// Pros :
// Simple implementation`
