package SOLID.LSP;


import SOLID.OCP.OCP;

public class Before {

    public static class Bird{
        protected String name;
        protected String color;
        protected int age;
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


        @Override
        public void fly() {
            System.out.println( "Sparrow is flying high.");
        }
    }

    public static class Penguin implements FlyBehavior {


        @Override
        public void fly()
        {
            throw new UnsupportedOperationException("Penguins cannot fly.");
        }
    }


    public static void main(String[] args) {
        BirdFlyService birdFlyService = new BirdFlyService();
        Bird sp = new Bird("Sparrow", "Brown", 2, new Sparrow());
        //sp.fly();
        birdFlyService.fly(sp);

        Bird pe = new Bird("Penguin", "Blue", 1, new Penguin());
        //pe.fly();
        birdFlyService.fly(pe);  //❌ .UnsupportedOperationException: Penguins cannot fly.
    }
}

// Problems :
// 1. It voilates expectations - A user of the Bird class would expect that any Bird instance can fly.
// However, when a Penguin instance is used, it throws an exception, which is unexpected behavior.
// 2. Will cause runtime errors.

// Subclass is not behaving like the parent class.
