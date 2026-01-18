package Patterns.Creational.Facade;

//The Facade Design Pattern is a structural design pattern that provides a simplified interface to a complex subsystem.

// 👉 It hides system complexity and exposes only what the client needs.


class HomeTheatreFacade{
    private Amplifier amplifier;
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private Screen screen;
    private Light light;
    private PopcornPopper popcornPopper;

    public HomeTheatreFacade(){
        amplifier = new Amplifier();
        dvdPlayer = new DVDPlayer();
        projector = new Projector();
        screen = new Screen();
        light = new Light();
        popcornPopper = new PopcornPopper();
    }

    public void watchMovie(String movieName){
        System.out.println("ready to watch movie " + movieName);
        screen.down();
        amplifier.on();
        projector.on();
        light.dim();
        popcornPopper.pop();
        dvdPlayer.play(movieName);

    }

    public void endMovie(){
        screen.up();
        amplifier.off();
        projector.off();
        light.dim();
        popcornPopper.stop();
        dvdPlayer.stop();

    }
}

public class Sol3 {
    public static void main(String[] args) {
        HomeTheatreFacade theatre = new HomeTheatreFacade();
        theatre.watchMovie("Inception");
    }
}


// pros:
//Key Benefits ⭐
//✔ Simplifies client interaction
//✔ Reduces coupling
//✔ Improves readability
//✔ Easier maintenance


//When to Use Facade Pattern?
//System has many dependent classes
//Client only needs high-level operations
//You want to hide implementation details
//You are integrating legacy systems

