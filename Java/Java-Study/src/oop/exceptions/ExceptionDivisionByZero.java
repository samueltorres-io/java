package oop.exceptions;

public class ExceptionDivisionByZero {

    public static int mediaCalc(int totalScore, int studies) throws ArithmeticException {
        return totalScore / studies;
    }

    public static void main(String[] args) {

        int totalScore = 96;
        int studies = 12;

        try {

            int result = mediaCalc(totalScore, studies);
            System.out.println("Media: " + result); //8

        } catch (ArithmeticException ae) {

            System.out.println("Err: Division by zero!");

        }

    }

}
