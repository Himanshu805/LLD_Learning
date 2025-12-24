package Patterns.Creational.Singleton;

//A singleton enum in Java is a type-safe and concise way to implement the singleton design pattern,
// which ensures that a class has only one ( or single) instance throughout the application


public enum EnumSingleton {

    INSTANCE;       //single instance of the class

    private EnumSingleton() {
        //private constructor to prevent instantiation from outside
    }
}


//Pros : ✅
//Guaranteed one instance (Cannot instantiate more than one enum even through reflection).
//Thread-safe.
//Serialization.