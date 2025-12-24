package Patterns.Creational.Prototype;

import Patterns.Creational.Prototype.BoilerPlateDP.AI;
import Patterns.Creational.Prototype.BoilerPlateDP.Mage;
import Patterns.Creational.Prototype.BoilerPlateDP.Stats;
import Patterns.Creational.Prototype.BoilerPlateDP.Weapon;

public class Sol1 {
    public static void main(String[] args) {
        Mage mage = new Mage(
            "Jaina",
            new Weapon("Frost Staff", 80),
            new Stats(100, 200),
            new AI("Aggressive")
        );

        Mage magecopy = mage; // same reference

        // Modifying magecopy will affect mage
        magecopy.setName("Modified Jaina");

        System.out.println("Original Mage Name: " + mage.getInfo());

        System.out.println("Copied Mage Name: " + magecopy.getInfo());
    }
}

// Cons :
// - No new object created, just a reference copy
// Client is responsible for creating copies
// - Changes to magecopy will affect mage (and vice versa)
// - Not a true clone, just two references to the same object