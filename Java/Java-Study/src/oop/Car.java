package oop;

public class Car {
    String color = "";

    public Car(String color) {
        this.color = color;
    }

    public String carColor() {
        return this.color;
    }

    public void accelerate() {
        System.out.println("The car is accelerating!");
    }
}
