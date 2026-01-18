package SOLID.LSP;

public class After {
    // Liskov Substitution Principle (LSP) states that objects of a superclass should be replaceable with objects
    // of a subclass without affecting the correctness/behavior of the program.

    public static class Bird {

        protected String name;
        protected String color;
        protected int age;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }



    public static class Sparrow extends Bird implements FlyingBird {
        public Sparrow(String name, String color, int age) {
            super(name, color, age);
        }



        // Altering the behavior of the fly method
        // Voilating the LSP
        @Override
        public void fly() {
            System.out.println("Sparrow is sleeping.");
        }
    };

    public static class Penguin extends Bird {
        public Penguin(String name, String color, int age) {
            super(name, color, age);
        }
    };

    public static void main(String[] args) {
        FlyingBird sp = new Sparrow("Sparrow","Black",2);
        sp.fly();    // ✅ valid

        Bird pe = new Penguin("Penguin","Blue",3);
        //pe.fly  // ❌ compile-time safety
    }

}

// Where is LSP voilated ?
//🚫 Subclass alters expected behavior of the superclass methods.
//🚫 Subclass throws exceptions that the superclass does not throw.

// How to apply LSP ?
//✅ 1. Ensure that subclasses extend the behavior of the superclass without changing its original functionality.
//✅ 2. Use abstract classes or interfaces to define clear contracts for subclasses to follow.

//Summary of LSP:
//LSP teaches us that inheritance isn't just about sharing code; it's about sharing behavior.If a subclass cannot do everything the parent claims to do, the inheritance is wrong.