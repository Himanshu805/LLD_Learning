package SOLID.SRP;

import SOLID.OCP.OCP;

public class BirdFlyService {

    public void fly(SRP.Bird bird) {
        // Logic for flying
        String name = bird.getName();
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
}
