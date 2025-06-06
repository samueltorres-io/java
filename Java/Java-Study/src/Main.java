// 18:32 - 19:23 | 19:49 - 20:02 | 13:58 -

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
         -- Var String --
         String name = "Samuel Torres Fernandes";
         System.out.println(name);
        */

        /*
          -- Var Numbers --
          byte age = 20; -- 1byte
          short year = 2025; -- 2bytes
          int anyBigNumber = 348239267; -- 4bytes
          long reallyBigNumber = anyBigNumber + ( year * ( age * 9 ) ); -- 8bytes
          System.out.println(age);
          System.out.println(year);
          System.out.println(anyBigNumber);
          System.out.println(reallyBigNumber);
         */

        /*
         -- Var Decimals --
         float dolarInReal = 5.59f; -- 4bytes
         double anyNumber = 5.6345533452323; -- 8bytes
         System.out.println(dolarInReal);
         System.out.println(anyNumber);
        */

        /*
         -- Var character and text --
         String name = "Samuel Torres Fernandes";
         char letter = 'S';
         System.out.println(name);
         System.out.println(letter);
        */

        /*
        -- Var and Boolean --
         var year = 2025;
         boolean isActive = true;
        */

        /*
         -- Wrappers --
         Byte age = 20;
         System.out.println(age.byteValue());
        */

        /*
         -- Changeable and Immutable --
         byte age = 17;
         age = 20;
         System.out.println(age);

         final byte AGE = 20;
         AGE = 17; <-- Error
         System.out.println(age);

         final String DATABASE = "databaseName";
        */

        /*
         -- Concatenation --
         String name = "Samuel Torres Fernandes";
         Byte age = 20;
         String profession = "Backend Developer";
         System.out.println("My name is " + name + ", " + "i have " + age + " years old, and i'm a " + profession);
        */

        /*
         -- User Input --
         String name;
         Scanner userInput = new Scanner(System.in);
         name = userInput.nextLine();
         System.out.println(name);

         byte age;
         age = userInput.nextByte();
         System.out.println(age);
        */

        /*
         -- Arithmetic Operators --
         int n1 = 10;
         int n2 = 47;
         float n3 = 3.65f;
         float sum = n1 + n2 + n3;
         int sub = n1 - n2;
         float div = n2 / n3;
         float mul = n1 * (n2 + n3);
         System.out.println(sum);
         System.out.println(sub);
         System.out.println(div);
         System.out.println(mul);
        */

        /*
         -- If and Else --
         Scanner userInput = new Scanner(System.in);

         boolean adult = false;
         byte age;
         age = userInput.nextByte();

         if (age >= 18) {
         adult = true;
            System.out.println("You are an adult and can access!");
         } else if (age < 0) {
            System.out.println("Your age cannot be less than 0.");
         } else if (age < 18) {
            System.out.println("You do not meet the minimum age to access!");
         } else {
            System.out.println("Unable to determine age!");
         }
        */

        /*
         -- Array --
         String[] myWallet = {"USDT", "BRL", "EUR"};
         System.out.println(myWallet[0]);
        */




    }

}