package oop.exceptions;

public class ArrayIndex {

    public static void main(String[] args) {
         int[] numbers = {23, 75, 1, 862};

         try {
             System.out.println(numbers[4]);
         } catch (ArrayIndexOutOfBoundsException e) {
             System.out.println("Err: "+ e.getMessage());
         }

    }
}
