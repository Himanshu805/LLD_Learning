package SOLID.OCP;



public class OCP {

    // Open Close Principle (OCP) states that software entities (classes, modules, functions, etc.)
    // should be open for extension but closed for modification.

    public static class Bird{
        private String name;
        private String color;
        private int age;
        private FlyBehavior flyBehavior;

        public Bird(String name, String color, int age, FlyBehavior flyBehavior) {
            this.name = name;
            this.color = color;
            this.age = age;
            this.flyBehavior = flyBehavior;
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

        public void performFly() {
            flyBehavior.fly();
        }

    }

    public static class Sparrow implements FlyBehavior {
        private String sparrowSpecificField;



        @Override
        public void fly() {
            // specific flying logic for Sparrow
            System.out.println("Sparrow is flying.");
        }
    }

    public static class Eagle  implements FlyBehavior {


        @Override
        public void fly() {
            // specific flying logic for Eagle
            System.out.println("Eagle is soaring high.");
        }
    }

    public static class Parrot  implements FlyBehavior {


        @Override
        public void fly() {
            // specific flying logic for Parrot
            System.out.println("Parrot is flying with vibrant colors.");
        }
    }

    public static class Penguin  implements FlyBehavior{


        @Override
        public void fly() {
            // Penguins cannot fly, so we can throw an exception or print a message
            System.out.println("Penguins cannot fly.");
        }
    }

    public static class Ostrich  implements FlyBehavior {


        @Override
        public void fly() {
            // Ostriches cannot fly, so we can throw an exception or print a message
            System.out.println("Ostriches cannot fly.");
        }
    }

    public static void main(String[] args) {
        BirdFlyService flyService = new BirdFlyService();
        Bird sparrow = new Bird("Sparrow", "Brown", 2, new Sparrow());
        flyService.fly(sparrow); // Output: Sparrow is flying.
        Bird eagle = new Bird("Eagle", "Golden", 5, new Eagle());
        flyService.fly(eagle);// Output: Eagle is soaring high.

        Bird parrot = new Bird("Parrot", "Green", 3,  new Parrot());
        flyService.fly(parrot); // Output: Parrot is flying with vibrant colors.
    }

}



// How to spot OCP violations:
// 1.🔴 If you have to modify existing code to add new functionality, it may be a sign of OCP violation.
// 2.🔴 If you have large switch or if-else statements to handle different types, it may be a sign of OCP violation.


// How to enable OCP :
// 1.✅ Use interfaces or abstract classes to define common behavior.
// 2.✅ Use inheritance and polymorphism to extend functionality without modifying existing code.
// ✅ you can add 1,000 different birds just by adding new classes.


