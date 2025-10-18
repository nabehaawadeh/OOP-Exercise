package edu.najah.cap.oop;

public abstract class Animal {
    protected String name;
    protected int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Animal constructor called for " + name);
    }


    public abstract void makeSound();

    public void eat() {
        System.out.println(name + " is eating...");
    }
}
