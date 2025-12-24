package Patterns.Creational.Singleton;

// Eager Initialization Singleton Pattern
// Instance is created at the time of class loading

public class EagerInitialization {
    private static EagerInitialization instance = new EagerInitialization();

    private EagerInitialization() {}

    public static EagerInitialization getInstance(){
        return instance;
    }

    public static void displayMessage(){
        System.out.println("Testing eager init");
    }
}

class Client1 {
    public static void main(String[] args) {
        EagerInitialization instance1 = EagerInitialization.getInstance();
        EagerInitialization instance2 = EagerInitialization.getInstance();
        System.out.println("Are both instances same? " + (instance1 == instance2));
    }
}

// Pros: ✅
// Very simple to implement
// Thread-safe without synchronization overhead

// Cons: ❌
// Instance is created at class loading time, even if not needed
// Cannot be used in scenarios where instance creation is expensive and not always needed
// Parameters cannot be passed to the constructor during runtime







