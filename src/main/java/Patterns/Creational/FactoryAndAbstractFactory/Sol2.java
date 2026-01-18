package Patterns.Creational.FactoryAndAbstractFactory;

enum BurgerType{
    VEG,CHEESE

}

interface Burger1{
    public void prepare();
}
class VegBurger1  implements Burger1{

    @Override
    public void prepare(){
        System.out.println("VegBurger prepare");
    }
}

class CheeseBurger1 implements Burger1 {

    @Override
    public void prepare(){
        System.out.println("CheeseBurger prepare");
    }
}

class BurgerFactory1 {
    public static Burger1 createBurger1( String burgerType){
        if(burgerType.equals("Veg")){
            return new VegBurger1();
        }
        else if(burgerType.equals("Cheese")){
            return new CheeseBurger1();
        }
        else{
            throw new IllegalArgumentException("Invalid Burger Type");
        }

    }
}

public class Sol2 {
    public static void main(String[] args) {
        Burger1 burger1 = BurgerFactory1.createBurger1("Veg");
        burger1.prepare();
    }
}


// pros :
// 1. Moved the burger creation logic to a separate factory class and decoupled it from the client code.

// cons :
// 1. Still requires modification of the factory class to add new burger types, which violates the Open/Closed Principle.
// 2. Still has if-else statements, which can lead to code that is hard to maintain and extend.

