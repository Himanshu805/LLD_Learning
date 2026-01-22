package Patterns.Behavioural.Strategy;

class Navigate{

    RouteStrategy routeStrategy;
    public Navigate(RouteStrategy routeStrategy){
        this.routeStrategy = routeStrategy;
    }

    public void navigate(){
        if(routeStrategy != null){
            routeStrategy.calculateCost();
        }
        else{
            System.out.println("RouteStrategy is Invalid");
        }
    }
}

interface RouteStrategy{
    public void calculateCost();
}

class FastestRouteStrategy implements RouteStrategy{
    @Override
    public void calculateCost() {
        System.out.println("calculating fastest route cost....");
    }
}

class ShortestRouteStrategy implements RouteStrategy{
    @Override
    public void calculateCost() {
        System.out.println("calculating shortest route cost....");
    }
}

class AvoidTollStrategy implements RouteStrategy{
    @Override
    public void calculateCost() {
        System.out.println("calculating avoid toll cost....");
    }
}

class ScenicRouteStrategy implements RouteStrategy{
    @Override
    public void calculateCost() {
        System.out.println("calculating scenic route cost....");
    }
}

public class Sol3 {
    public static void main(String[] args) {
        Navigate navigate = new Navigate(new FastestRouteStrategy());
        navigate.navigate();

        Navigate navigate2 = new Navigate(new ShortestRouteStrategy());
        navigate2.navigate();
    }

}

// Pros :
// Adheres to Open/Closed Principle
// No if-else statements
// Follows Single Responsibility Principle
// Loose coupling between Navigation and route types
// Follows Dependency Inversion Principle
// No string based route type selection
// Easy to extend with new route types
// Easier to maintain
// Easier to test individual route strategies
// Easy to read and understand

// Cons :
// Client must be aware of different route strategy classes
// Route selection logic not present
