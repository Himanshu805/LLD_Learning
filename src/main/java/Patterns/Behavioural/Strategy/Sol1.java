package Patterns.Behavioural.Strategy;

class Navigation{

    public void navigation(String routeType){
        if(routeType.equals("fastest")){
            System.out.println("calculate the Fastest route...");
        }
        else if(routeType.equals("shortest")){
            System.out.println("calculate the Shortest route...");
        }
        else if(routeType.equals("avoid tolls")){
            System.out.println("calculate the Avoid Tolls route...");
        }
        else if(routeType.equals("scenic")){
            System.out.println("calculate the Scenic route...");
        }
        else{
            System.out.println("Invalid route type....");
        }

    }
}

public class Sol1 {
    public static void main(String[] args) {

        Navigation navigation = new Navigation();
        navigation.navigation("fastest");
        navigation.navigation("shortest");
        navigation.navigation("avoid tolls");
        navigation.navigation("scenic");
    }

}

// Cons :
// Voilates Open/Closed Principle
// Voilates Single Responsibility Principle
// Tight coupling between Navigation and route types
// Too many if-else statements ( Scalability issues )
// String based route type selection ( error-prone )
// Difficult to test individual route
// Difficult to extend with new route types
// Difficult to maintain
