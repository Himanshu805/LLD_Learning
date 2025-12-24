package SOLID.ISP;

public class Before {

    interface Bird {
        void fly();
        void dance();
        void hunt();
        void swim();
    }

    public static class Penguin implements Bird {
        public void fly() {
            // Not applicable❌
            throw new UnsupportedOperationException("Penguins can't fly");
        }

        public void dance() {
            System.out.println("Penguin dances");
        }

        @Override
        public void hunt() {
            // Not applicable❌
            throw new  UnsupportedOperationException("Penguins can't hunt");
        }

        @Override
        public void swim() {
            System.out.println("Penguin can swim");
        }
    }

    public static void main(String[] args) {
        Bird pe = new Penguin();
        pe.dance();
        pe.fly(); // ❌Pengiun is forced to implement fly method, which is not applicable for it
        // This will throw a runtime exception
    }
}

//In the previous step (LSP), we created a Flyable interface. But birds do more than just fly— they swim,
// they walk, and they hunt. If we create one giant "Bird" interface, we fall back into the same trap as before.