package Patterns.Structure.Decorator;

// Abstract Component
abstract  class Burger{
    public abstract String description();
    public abstract double amount();


}
class VegBurger extends Burger{
    @Override
    public String description() {
        return "Veg Burger";
    }
    @Override
    public double amount() {
        return 0.5;
    }
}

class CheeseBurger extends Burger{
    @Override
    public String description() {
        return "Cheese Burger";
    }
    @Override
    public double amount() {
        return 1.5;
    }
}
// Extra topping
// Extra cheese, tomato, lettuce, onion, dip

class VegBurgerWithCheese extends VegBurger{
    Burger burger;
    VegBurgerWithCheese(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String description() {
        return burger.description()+ "Veg Cheese";
    }

    @Override
    public double amount() {
        return burger.amount() + 1.5;
    }

}
class VegBurgerWithTomato extends VegBurger{
    Burger burger;
    VegBurgerWithTomato(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String description() {
        return burger.description()+ "Veg Tomato";
    }
    @Override
    public double amount() {
        return burger.amount() + 1.5;
    }
}

class VegBurgerWithLettuceAndOnion extends VegBurger{
    Burger burger;

    VegBurgerWithLettuceAndOnion(Burger burger) {
        this.burger = burger;
    }
    @Override
    public String description() {
        return burger.description()+ "Veg Lettuce, Onion";
    }
    @Override
    public double amount() {
        return burger.amount() + 1.5 + 2.5;
    }
}


public class Sol1 {

}


//Problems:
//Class explosion :  We tried to use inheritance to add toppings to burgers. But it became a class explosion problem.
//Hard to maintain
//Inflexible combinations
// Not scalable for more toppings.