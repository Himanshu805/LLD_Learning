package Patterns.Behavioural.Strategy;


// Strategy design pattern :
// It is a behavioral design pattern that enables selecting an algorithm's behavior at runtime.
// It defines a family of algorithms, encapsulates each one, and makes them interchangeable within that family.

// Components of Strategy Pattern:
// 1. Strategy: An interface that defines a common method for all supported algorithms.
// 2. Concrete Strategies: Classes that implement the Strategy interface, each providing a different algorithm.
// 3. Context: A class that uses a Strategy to execute the algorithm. It maintains a reference to a Strategy object and can change it at runtime.

// When to use Strategy Pattern ?
// - When you have multiple algorithms for a specific task and want to switch between them dynamically.
// - When you want to avoid conditional statements for selecting algorithms.

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

class Navigate3{

    RouteStrategy3 routeStrategy;

//    public Navigate3(RouteStrategy3 routeStrategy){
//        this.routeStrategy = routeStrategy;
//    }

    // Inject the desired strategy at runtime
    public void setRouteStrategy(RouteStrategy3 routeStrategy){
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

interface RouteStrategy3{
    public void calculateCost();
}

class FastestRouteStrategy3 implements RouteStrategy3{
    @Override
    public void calculateCost() {
        System.out.println("calculating fastest route cost....");
    }
}

class ShortestRouteStrategy3 implements RouteStrategy3{
    @Override
    public void calculateCost() {
        System.out.println("calculating shortest route cost....");
    }
}

class AvoidTollStrategy3 implements RouteStrategy3{
    @Override
    public void calculateCost() {
        System.out.println("calculating avoid toll cost....");
    }
}

class ScenicRouteStrategy3 implements RouteStrategy3{
    @Override
    public void calculateCost() {
        System.out.println("calculating scenic route cost....");
    }
}


public class Sol4 {

    public static void main(String[] args) {

        Navigate3 navigate = new Navigate3();

        navigate.setRouteStrategy(new FastestRouteStrategy3());
        navigate.navigate();

        navigate.setRouteStrategy(new ShortestRouteStrategy3());  
        navigate.navigate();

        navigate.setRouteStrategy(new AvoidTollStrategy3());
        navigate.navigate();


    }


}
// This Solution is same like Sol3 except it allow to change the behaviour strategy during runtime.

// Cons :
// Client must be aware of different strategies to choose from ( can be mitigated with a factory pattern )

