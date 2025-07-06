package oop.interfaces;

public interface Predator extends Prey {

    final String Description = "an animal that naturally preys on others!";

    // Abstract method
    void hunt();

    // Default method
    default void defaultMethod() {
        System.out.println("Default Method on Interface!");
    }

    // Static method
    static void preyDescription() {
        System.out.println(Prey.Description);
    }

    static void predatorDescription() {
        System.out.println(Predator.Description);
    }

}
