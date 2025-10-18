package edu.najah.cap.oop;



    public class TestBadDesign {
        public static void main(String[] args) {
            BadRobotDog dog = new BadRobotDog();
            dog.makeSound();
            dog.makeSound("Beep! Woof!");
        }
    }

