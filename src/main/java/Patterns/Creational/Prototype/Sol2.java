package Patterns.Creational.Prototype;

import Patterns.Creational.Prototype.BoilerPlateDP.AI;
import Patterns.Creational.Prototype.BoilerPlateDP.Mage;
import Patterns.Creational.Prototype.BoilerPlateDP.Stats;
import Patterns.Creational.Prototype.BoilerPlateDP.Weapon;

public class Sol2 {
    public static void main(String[] args) {
        Mage mage = new Mage(
                "Jaina",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );

        Mage mage2 = new Mage(
                "Jaina 2",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );
    }
}

// Cons :
// - New object created, but not a true clone
// - If we create 100 copies, it will be inefficient
// - Code is repetitive and error-prone
// - Time consuming to create each object manually
// - Client is responsible for creating copies