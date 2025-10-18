package edu.najah.cap.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println(" Part: creation and polymorphism ");

         RobotDog a = new RobotDog("Bolt", 2, 90);
        a.eat();
        a.makeSound();


        System.out.println("\n Part : type assignment experiments ");

           Animal dog2 = new RobotDog("Rex", 3, 50);
        dog2.makeSound();
        dog2.eat();


           Rechargeable dog3 = new RobotDog("Robo", 1, 30);
        dog3.recharge();


    }
}
