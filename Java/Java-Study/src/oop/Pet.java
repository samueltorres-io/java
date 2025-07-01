package oop;

class Animal {
    public String name;
    public void song() {
        System.out.println("Default song!");
    }
}

// Annotations override
class Dog extends Animal {

    @Override

    public void song() {
        System.out.println("The dog bark!");
    }
}

public class Pet {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.song();
    }
}