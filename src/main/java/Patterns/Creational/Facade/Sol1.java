package Patterns.Creational.Facade;

class Amplifier{
    public void on(){
        System.out.println("Amplifier on");
    }
    public void off(){
        System.out.println("Amplifier off");
    }
}

class DVDPlayer{
    public void play(String movie){
        System.out.println("DVD player playing  " + movie);
    }

    public void stop(){
        System.out.println("DVD stop");
    }

}

class Projector{
    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
}

class Screen{
    public void down(){
        System.out.println("Screen down");
    }
    public void up(){
        System.out.println("Screen up");
    }
}

class Light{
    public void dim(){
        System.out.println("Light dim");
    }
    public void bright(){
        System.out.println("Light bright");
    }
}

class PopcornPopper{
    public void pop(){
        System.out.println("Popcorn popper");
    }
    public void stop(){
        System.out.println("Popcorn stop");
    }
}



public class Sol1 {
    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        Projector projector = new Projector();
        Screen screen = new Screen();
        Light light = new Light();
        PopcornPopper popcornPopper = new PopcornPopper();

        // simulating watching the movie without facade
        amplifier.on();
        light.dim();
        screen.down();
        projector.on();
        amplifier.on();
        dvdPlayer.play("Inception");



        }

}

// cons:
// 1. Client needs to know about all the components
// if client messes up the order of operations, it can lead to errors
// Any change in the subsystem requires changes in the client code
// Client tightly coupled to many classes
// Complex & error-prone
// Hard to maintain
