package Patterns.Creational.FactoryAndAbstractFactory;

class VegBurger{
    public void prepare(){
        System.out.println("Preparing Veg Burger");
    }
}

class CheeseBur
{
    public void prepare(){
        System.out.println("Preparing Cheese Burger");
    }
}

public class Sol1 {
    public static void main(String[] args) {
        String burgerType = "Veg";
        if(burgerType.equals("Veg")){
            VegBurger vegBurger = new VegBurger();
            vegBurger.prepare();
        }
        else if(burgerType.equals("Cheese")){
            CheeseBur cheeseBur = new CheeseBur();
            cheeseBur.prepare();
        }
    }

}

// pros :
// Simple and straightforward Solution

// cons :
// Adding a new Burger type modifying the existing code, which voilet Open/CLoseed Principe
// Many if else statements can lead to code that is hard to maintain and extend.
// Client code is tightly coupled with the creation logic of Burger.

