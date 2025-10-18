package edu.najah.cap.oop;

class FixedAnimal {
    String name;
    void makeSound() {
        System.out.println("generic animal sound");
    }
}

class FixedRobotDog extends FixedAnimal {
    int batteryLevel;

    @Override
    void makeSound() {
        System.out.println("Beep! Woof! (Fixed RobotDog)");
    }
}
