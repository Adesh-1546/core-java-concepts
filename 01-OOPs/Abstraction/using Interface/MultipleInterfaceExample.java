/*
Q: Demonstrate abstraction using multiple interfaces in Java.

Problem Statement:
Create two interfaces:
1. Camera → method takePhoto()
2. MusicPlayer → method playMusic()

Create a class Smartphone that implements both interfaces.

In the main method:
- Create object of Smartphone
- Call both methods to demonstrate multiple inheritance using interfaces
*/

interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {

    @Override
    public void takePhoto() {
        System.out.println("Photo captured using smartphone camera");
    }

    @Override
    public void playMusic() {
        System.out.println("Playing music on smartphone");
    }
}

public class MultipleInterfaceExample {

    public static void main(String[] args) {

        Smartphone phone = new Smartphone();

        phone.takePhoto();
        phone.playMusic();
    }
}
