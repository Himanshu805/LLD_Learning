package SOLID.OCP;

public class BirdFlyService {

    public void fly(OCP.Bird bird) {
        System.out.print(bird.getName() + ": ");
        bird.performFly();
    }
}
