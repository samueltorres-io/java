package oop;

// Constructor Overloading
public class Bike {

    String model;
    String mark;
    short year;

    // No parameters
    public Bike(){
    }

    // Model and mark
    public Bike(String model, String mark){
        this.model = model;
        this.mark = mark;
    }

    // All attributes
    public Bike(String model, String mark, short year){
        this.model = model;
        this.mark = mark;
        this.year = year;
    }


}
