package SOLID.LSP;




public class BirdFlyService {

    public void fly(Before.Bird bird) {
        System.out.print(bird.getName() + ": ");
        bird.performFly();
    }
}
