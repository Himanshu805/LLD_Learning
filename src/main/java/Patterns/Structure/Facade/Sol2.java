package Patterns.Structure.Facade;


class Amplifier1{
    public void on(){
        System.out.println("Amplifier on");
    }
    public void off(){
        System.out.println("Amplifier off");
    }
}

class DVDPlayer1{
    public void play(String movie){
        System.out.println("DVD player playing::  " + movie);
    }

    public void stop(){
        System.out.println("DVD stop");
    }

}

class Projector1{
    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector off");
    }
}

class Screen1{
    public void down(){
        System.out.println("Screen down");
    }
    public void up(){
        System.out.println("Screen up");
    }
}

class Light1{
    public void dim(){
        System.out.println("Light dim");
    }
    public void bright(){
        System.out.println("Light bright");
    }
}

class PopcornPopper1{
    public void pop(){
        System.out.println("Popcorn popper");
    }
    public void stop(){
        System.out.println("Popcorn stop");
    }
}

class Helper{
    public static void  watchMovie(String movie){
        Amplifier1 amplifier = new Amplifier1();
        DVDPlayer1 dvdPlayer = new DVDPlayer1();
        Projector1 projector = new Projector1();
        Screen1 screen = new Screen1();
        Light1 light = new Light1();
        PopcornPopper1 popcornPopper = new PopcornPopper1();

        // simulating watching the movie without facade
        amplifier.on();
        light.dim();
        screen.down();
        projector.on();
        amplifier.on();
        dvdPlayer.play("Inception");
    }
}




public class Sol2 {
    public static void main(String[] args) {
       Helper.watchMovie("Inception");

    }


}
