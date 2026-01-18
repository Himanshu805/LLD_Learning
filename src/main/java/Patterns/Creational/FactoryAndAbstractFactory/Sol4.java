package Patterns.Creational.FactoryAndAbstractFactory;


// Requirement - Create a burger meal - Burger , Fries and Drink
// Veg Burger, Veg Fries, Veg Drink
// Cheese Burger, Cheese Fries, Cheese Drink

// Abstract Factory Design Pattern is a creational design pattern that provides an interface for creating
// families of related or dependent objects without specifying their concrete classes. It promotes loose
// coupling by allowing the client code to work with abstract types rather than concrete implementations.

interface Burger {
    void prepare();
}

class VegBurger4 implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Veg Burger");
    }
}

class CheeseBurger4 implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Cheese Burger");
    }
}

class MexicanBurger4 implements Burger {
    @Override
    public void prepare() {
        System.out.println("Preparing Mexican Burger");
    }
}

interface Fries {
    void fry();
}

class VegFries implements Fries {
    @Override
    public void fry() {
        System.out.println("Frying Veg Fries");
    }
}

class CheeseFries implements Fries {
    @Override
    public void fry() {
        System.out.println("Frying Cheese Fries");
    }
}

class MexicanFries implements Fries {
    @Override
    public void fry() {
        System.out.println("Frying Mexican Fries");
    }
}

interface Drink {
    void pour();
}

class VegDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("Pouring Veg Drink");
    }
}

class CheeseDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("Pouring Cheese Drink");
    }
}

class MexicanDrink implements Drink {
    @Override
    public void pour() {
        System.out.println("Pouring Mexican Drink");
    }
}

// Abstract Factory
abstract class MealFactory {
    abstract Burger createBurger();
    abstract Fries createFries();
    abstract Drink createDrink();

    public void orderMeal() {
        Burger burger = createBurger();
        Fries fries = createFries();
        Drink drink = createDrink();

        burger.prepare();
        fries.fry();
        drink.pour();

        System.out.println("Meal ordered successfully!");
    }
}

// Concrete Factory classes
class VegMealFactory extends MealFactory {
    @Override
    Burger createBurger() {
        return new VegBurger4();
    }

    @Override
    Fries createFries() {
        return new VegFries();
    }

    @Override
    Drink createDrink() {
        return new VegDrink();
    }
}

class CheeseMealFactory extends MealFactory {
    @Override
    Burger createBurger() {
        return new CheeseBurger4();
    }

    @Override
    Fries createFries() {
        return new CheeseFries();
    }

    @Override
    Drink createDrink() {
        return new CheeseDrink();
    }
}

class MexicanMealFactory extends MealFactory {
    @Override
    Burger createBurger() {
        return new MexicanBurger4();
    }

    @Override
    Fries createFries() {
        return new MexicanFries();
    }

    @Override
    Drink createDrink() {
        return new MexicanDrink();
    }
}

public class Sol4 {
    public static void main(String[] args) {
        MealFactory mealFactory = new VegMealFactory();
        mealFactory.orderMeal();

        MealFactory cheeseMealFactory = new CheeseMealFactory();
        cheeseMealFactory.orderMeal();
    }
}