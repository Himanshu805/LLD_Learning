package Patterns.Creational.Prototype;

class Weapon {
    String name;
    int damage;

    public Weapon(String name, int damage) {
        simulateHeavyLoad();
        this.name = name;
        this.damage = damage;
    }

    public Weapon(Weapon original) {
        this.name = original.name;
        this.damage = original.damage;
    }

    public void simulateHeavyLoad() {
        try {
            System.out.println("Loading heavy weapon data from disk...");
            Thread.sleep(1000); // simulate disk IO
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getDetails() {
        return name + " (Damage: " + damage + ")";
    }
}

class Stats {
    int health;
    int mana;

    public Stats(int health, int mana) {
        this.health = health;
        this.mana = mana;
    }

    public Stats(Stats original) {
        this.health = original.health;
        this.mana = original.mana;
    }

    public String getStats() {
        return "Health: " + health + ", Mana: " + mana;
    }
}

class AI {
    String behavior;

    public AI(String behavior) {
        simulateLoad();
        this.behavior = behavior;
    }

    public AI(AI original) {
        this.behavior = original.behavior;
    }

    public void simulateLoad() {
        try {
            System.out.println("Configuring AI engine...");
            Thread.sleep(1000); // simulate setup
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getBehavior() {
        return behavior;
    }
}

class Mage {
    String name;
    Weapon weapon;
    Stats stats;
    AI ai;

    public Mage(String name, Weapon weapon, Stats stats, AI ai) {
        this.name = name;
        this.weapon = weapon;
        this.stats = stats;
        this.ai = ai;
    }

    // Deep copy constructor
    public Mage(Mage original) {
        this.name = original.name;
        this.weapon = new Weapon(original.weapon);
        this.stats = new Stats(original.stats);
        this.ai = new AI(original.ai);
    }

    public void displayInfo() {
        System.out.println("Mage Info:");
        System.out.println("Weapon: " + weapon.getDetails());
        System.out.println("Stats: " + stats.getStats());
        System.out.println("AI Behavior: " + ai.getBehavior());
    }
}

public class Sol5_DeepCopy {
    public static void main(String[] args) {
        Mage originalMage = new Mage(
                "Gandalf",
                new Weapon("Staff of Power", 150),
                new Stats(1000, 500),
                new AI("Aggressive")
        );

        System.out.println("Original Mage:");
        originalMage.displayInfo();

        System.out.println("\nCloning Mage...");
        Mage clonedMage = new Mage(originalMage);

        System.out.println("\nCloned Mage:");
        clonedMage.displayInfo();
    }
}

// Pros : ✅    (Using Deep copy Constructor )
// ✅- True deep copy of all mutable objects
// ✅- Changes to weapon, stats, ai do not affect the other object
// ✅- Client is not responsible for deep copying logic

// This solutoin is also valid to create a copy of existing Object. It is safer and more idiomatic in modern Java.


//Imp :💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡💡
//When to Use copy Constructor and when to use Prototype Pattern.

//Choose Copy Constructor for simple data objects where the type is always known (like a Point, User, or Address).
//Choose Prototype Pattern when you are building a framework, a game engine, or a system where you deal with a hierarchy of classes through a base interface.

//With Copy Constructor: The Caller must know the class type. You can't call a constructor unless you write the class name (e.g., new Eagle(...)).
//With Prototype: Because clone() is a method that is overridden in each subclass, Java uses Dynamic Dispatch to call the right version automatically.

/*

3. Avoiding "Class Explosion"
❌ If you have an object that can have hundreds of different state combinations (e.g., a "Warrior" in a game with different armor, weapons, and skills), creating a subclass for every combination is impossible.
✅  Instead, you create a few "Template" objects, configure them at startup, and then use the Prototype pattern to "spawn" copies of those specific configurations. A Copy Constructor would require you to pass all those complex state details around manually every time.*/
