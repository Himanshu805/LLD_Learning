package SOLID.SRP_OCP;

public class WithoutSOLID {

    public static class Bird{
        private String name;
        private String color;
        private int age;
        private int sparrowSpecificField;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public void fly() {
            // Logic for flying
            if(name == "Piegon"){
                System.out.println(name + " is flying.");
            } else if(name == "Parrot") {
                System.out.println(name + " is flying.");
            } else if(name == "Sparrow") {
                System.out.println(name + " is flying.");
            } else if(name == "Eagle") {
                System.out.println(name + " is flying.");
            } else if(name == "Penguin") {
                System.out.println(name + " cannot fly.");
            } else if (name == "Ostrich") {
                System.out.println(name + " cannot fly.");
            } else {
                System.out.println(name + " is not a recognized bird.");
            }
        }

        public void saveToDatabase() {
            System.out.println("Connecting to Database...");
            System.out.println("INSERT INTO birds (name, color, age) VALUES (" + this.name + ", " + this.color + ")");
        }

    }

    public static void main(String[] args) {
        //
    }

}

// Cons
// 🔴 Too many if else conditions
// 🔴 Not all birds can fly but they are forced to use fly method
// 🔴 Not extensible for new bird types
// 🔴 Kind of like a God class that does everything
// 🔴 Not readable and maintainable
