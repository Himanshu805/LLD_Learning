package SOLID.SRP_OCP;

public class BirdRepository {
    public void saveToDatabase(SRP.Bird bird) {
        System.out.println("Connecting to Database...");
        System.out.println("INSERT INTO birds (name, color, age) VALUES (" 
            + bird.getName() + ", " + bird.getColor() + ", " + bird.getAge() + ")");
    }
}