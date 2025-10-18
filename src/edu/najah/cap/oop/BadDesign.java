package edu.najah.cap.oop;

public class BadDesign {
    String name;
    void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class BadRobotDog extends BadDesign {
    int batteryLevel;
    void makeSound(String sound) { // Overloading instead of overriding
        System.out.println(sound);
    }


}
