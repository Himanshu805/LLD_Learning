package SOLID.SRP;

public class SRP {

    // Single Responsibility Principle (SRP) states that a class should have only one reason to change.
    // This means that a class should only have one job or responsibility.

    // Open Close Principle (OCP) states that software entities (classes, modules, functions, etc.)
    // should be open for extension but closed for modification.


    public static class Bird{
        private String name;
        private String color;
        private int age;

        public Bird(String name, String color, int age) {
            this.name = name;
            this.color = color;
            this.age = age;
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

    }





}

// How to spot SRP violations:
// 1. If a class has multiple methods that are not related to each other, it may be a sign of SRP violation.

//Your Bird class does multiple jobs:
// 1. Holds bird data (name, color, age)
// 2. Decides flying behavior
// 3. Handles database persistence

// 4. This class have many reason to change.
/*
//Scenario A: The  team wants to add a weight field to all birds. (You must change the Bird class).
//
//Scenario B: The  designer decides that an "Eagle" should "Soar" instead of "Fly." (You must also change the Bird class).

Scenarios C:  If you change your database from SQL to a text file. (You must also change the Bird class).
*/


// How to enable SRP :
//✅ 1. One class should have one responsibility.
//✅ 2. If a class is doing more than one thing, split it into multiple classes.

