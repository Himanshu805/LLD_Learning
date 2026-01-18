package Patterns.Creational.FactoryAndAbstractFactory;


//The Factory Design Pattern:
// it is a creational design pattern that provides an interface for creating
//objects, but lets subclasses or a factory class decide which class to instantiate.
interface Burger3{
    public void prepare();
}

class VegBurger3 implements Burger3{
    @Override
    public void prepare() {
        System.out.println("VegBurger prepare");
    }
}

class CheeseBurger3 implements Burger3{
    @Override
    public void prepare() {
        System.out.println("CheeseBurger prepare");
    }
}


abstract class BurgerFactory {
    abstract Burger3 createBurger();

    public void orderBurger(){
        Burger3 burger = createBurger();

        burger.prepare();
        System.out.println("Burger ordered successfully");
    }

}

// Concrete factory classes
class VegBurgerFactory extends BurgerFactory{
    @Override
    public Burger3 createBurger() {
        return new VegBurger3();
    }
}

// Concrete factory classes
class CheeseBurgerFactory extends BurgerFactory{
    @Override
    public Burger3 createBurger() {
        return new CheeseBurger3();
    }
}


public class Sol3 {
    public static void main(String[] args) {

        BurgerFactory burgerFactory = new VegBurgerFactory();
        burgerFactory.orderBurger();
    }
}


// Pros :
// 1. Adheres to the Open/Closed Principle - new burger types can be added without modifying existing code.
// 2. Encapsulates the burger creation logic within factory classes, promoting single responsibility.
// 3. Client code is decoupled from the concrete burger implementations, relying on abstractions.
// 4. Cleaner interface for creating burgers, as the client only interacts with the factory and burger interfaces.
// 5. Easy to extend and maintain

// Cons :
// Client still needs to be aware of which factory to use for which burger type. -> Soln ->  Factory selector class
