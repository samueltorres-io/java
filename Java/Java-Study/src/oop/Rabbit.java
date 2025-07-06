package oop;

// Predator extends Prey
import oop.interfaces.Predator;

public class Rabbit implements Predator {

    @Override
    public void flee() {
        System.out.println("The Rabbit is running now!");
    }

    @Override
    public void hunt() {
        System.out.println("The Rabbit hunt a bee!");
    }

}
