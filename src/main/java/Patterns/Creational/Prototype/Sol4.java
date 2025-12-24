package Patterns.Creational.Prototype;

import Patterns.Creational.Prototype.BoilerPlateDP.AI;
import Patterns.Creational.Prototype.BoilerPlateDP.Mage;
import Patterns.Creational.Prototype.BoilerPlateDP.Stats;
import Patterns.Creational.Prototype.BoilerPlateDP.Weapon;

public class Sol4 {
    public static void main(String[] args) {
        Mage mage = new Mage(
                "Jaina",
                new Weapon("Frost Staff", 80),
                new Stats(100, 200),
                new AI("Aggressive")
        );

        Mage magecopy = new Mage(mage);
    }
}



// Pros :
// - New object created using copy constructor
// - Client code is cleaner
// - Client doesn't need to know the details of Mage class
// - Client code is not tightly coupled with Mage class implementation
// - Any changes in Mage class won't affect client code`

// Cons :
// - Shallow copy
// - Changes to Weapon, Stats, or AI in magecopy will affect mage (and vice versa)