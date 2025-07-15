package oop.exceptions;

public class ArithmeticExceptionClass {

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

        // In java 22, we can use _ vars!
        try {

            int resultTwo = studies / teachers;

        } catch (Exception _) { // <-- Here
            System.out.println("ERR: Division by zero");
        } finally {
            System.out.println("End of program!");
        }
    }

}

