package oop.exceptions;

public class ArithmeticException {

    public static void main(String[] args) {
        int studies = 0;
        int teachers = 0;

        try {

            int result = studies / teachers;

        } catch (Exception e) {
            System.out.println("ERR: Division by zero");
        } finally {
            System.out.println("End of program!");
        }
    }

}

