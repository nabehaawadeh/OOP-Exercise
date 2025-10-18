package edu.najah.cap.oop;

public class RobotDog extends Animal implements Rechargeable {
    private int batteryLevel;

    public RobotDog(String name, int age, int batteryLevel) {
        super(name, age); // Call parent constructor
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void makeSound() {
        System.out.println("Beep! Woof! (Robot Dog Sound)");
    }

    public void recharge() {
        this.batteryLevel = 100;
        System.out.println(name + " recharged to " + batteryLevel + "%");
    }

    @Override
    public void eat() {
        super.eat(); // Call parent version
        System.out.println("RobotDog uses electricity instead of food.");
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }
}
