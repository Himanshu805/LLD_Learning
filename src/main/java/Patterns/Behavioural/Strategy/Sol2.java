package Patterns.Behavioural.Strategy;

class Navigation2{

    public void navigate(String routeType){
        if(routeType.equals("Shortest")){
            new ShortestRoute().calculate();
        }
        else if(routeType.equals("Fastest")){
            new FastestRoute().calculate();
        }
        else if(routeType.equals("avoid tolls")){
            new AvoidTollsRoute().calculate();
        }
        else if(routeType.equals("scenic")){
            new ScenicRoute().calculate();
        }
        else{
            System.out.println("Invalid route type");
        }
    }

}

class FastestRoute{
    public void calculate(){
        System.out.println("calculating the fastest route");
    }
}
class ShortestRoute{
    public void calculate(){
        System.out.println("calculating the shortest route");
    }
}

class AvoidTollsRoute{
    public void calculate() {
        System.out.println("calculating the avoid tolls route");
    }
}

class ScenicRoute{
    public void calculate(){
        System.out.println("calculating the scenic route");
    }
}


public class Sol2 {
    public static void main(String[] args) {
        Navigation2 navigation = new Navigation2();
        navigation.navigate("fastest");
        navigation.navigate("shortest");
        navigation.navigate("avoid tolls");
        navigation.navigate("scenic");
        navigation.navigate("invalid route");
    }

}

// Cons :
// Voilates Open/Closed Principle
// Voilates Single Responsibility Principle
// Tight coupling between Navigation and route types
// Voilates Dependency Inversion Principle
// Too many if-else statements ( Scalability issues )`

// Pros :
// Each route type is encapsulated in its own class
// better modularity
// Easy to maintain each route separately


