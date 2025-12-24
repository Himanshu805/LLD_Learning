package SOLID.SRP_OCP;

public class SRP {

    // Single Responsibility Principle (SRP) states that a class should have only one reason to change.
    // This means that a class should only have one job or responsibility.

    public static class Bird{
        private String name;
        private String color;
        private int age;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getColor() {
            return color;
        }

        public String getName() {
            return name;
        }

        public void fly() {
            // general flying logic
        }
    }

    public static class Sparrow extends Bird {
        private String sparrowSpecificField;

        public Sparrow(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Sparrow
            System.out.println("Sparrow is flying.");
        }
    }

    public static class Eagle extends Bird {
        public Eagle(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Eagle
            System.out.println("Eagle is soaring high.");
        }
    }

    public static class Parrot extends Bird {
        public Parrot(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // specific flying logic for Parrot
            System.out.println("Parrot is flying with vibrant colors.");
        }
    }

    public static class Penguin extends Bird {
        public Penguin(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // Penguins cannot fly, so we can throw an exception or print a message
            System.out.println("Penguins cannot fly.");
        }
    }

    public static class Ostrich extends Bird {
        public Ostrich(String name, String color, int age) {
            super(name, color, age);
        }

        @Override
        public void fly() {
            // Ostriches cannot fly, so we can throw an exception or print a message
            System.out.println("Ostriches cannot fly.");
        }
    }

    public static void main(String[] args) {
        Bird sparrow = new Sparrow("Sparrow", "Brown", 2);
        sparrow.fly(); // Output: Sparrow is flying.

        Bird eagle = new Eagle("Eagle", "Golden", 5);
        eagle.fly(); // Output: Eagle is soaring high.

        Bird parrot = new Parrot("Parrot", "Green", 3);
        parrot.fly(); // Output: Parrot is flying with vibrant colors.
    }

}

// How to spot SRP violations:
// 1. If a class has multiple methods that are not related to each other, it may be a sign of SRP violation.
// 2. Monster methods -> methods that are too long and do too many things.

// 4. This class have many reason to change.
/*
Scenario A: The  team wants to add a weight field to all birds. (You must change the Bird class).

Scenario B: The  designer decides that an "Eagle" should "Soar" instead of "Fly." (You must also change the Bird class).

Scenarios C:  If you change your database from SQL to a text file. (You must also change the Bird class).
*/


// How to enable SRP :
//✅ 1. One class should have one responsibility.
//✅ 2. If a class is doing more than one thing, split it into multiple classes.
//✅ 3. Break down monster methods into smaller methods with single responsibility.


// How to spot OCP violations:
// 1.🔴 If you have to modify existing code to add new functionality, it may be a sign of OCP violation.
// 2.🔴 If you have large switch or if-else statements to handle different types, it may be a sign of OCP violation.


// How to enable OCP :
// 1.✅ Use interfaces or abstract classes to define common behavior.
// 2.✅ Use inheritance and polymorphism to extend functionality without modifying existing code.
// ✅ you can add 1,000 different birds just by adding new classes.

