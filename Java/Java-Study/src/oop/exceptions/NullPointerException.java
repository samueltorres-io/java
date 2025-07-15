package oop.exceptions;

public class NullPointerException {

    public static void main(String[] args) {
        String name = null;

        try {

            int nameLenght = name.length();

        } catch (Exception _) {
            System.out.println("Err: Name is null!");
        } finally {
            System.out.println("Finally block!");
        }
    }
}
