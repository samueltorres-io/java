import oop.*;

import java.util.Scanner;
import company.data.Employeer;
import oop.interfaces.Predator;
import oop.interfaces.Prey;

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

        /* -- While and For --
            Name -> Age -> Wallet with 3 items.

            Scanner userInput = new Scanner(System.in);
            final String[] person = {"Adult", "Teen", "Kid"};

            boolean nameStatus = false;
            String name = "";

            boolean ageStatus = false;
            byte age = 0;
            String people = "";

            boolean walletStatus = false;
            String[] wallet = new String[3];

            while(!nameStatus) {
                System.out.print("Type your name: ");
                name = userInput.nextLine();

                if (!name.isBlank()) {
                    nameStatus = true;
                } else {
                    System.out.println("Name cannot be empty!");
                }
            }

            while(!ageStatus) {
                System.out.print("Type your age: ");
                age = Byte.parseByte(userInput.nextLine());

                try {

                    if (age < 0) {
                        System.out.println("Invalid age!");
                    } else if (age >= 18) {
                        people = person[0];
                        ageStatus = true;
                        System.out.println("You are an : " + people);
                    } else if (age >= 12 && age < 18) {
                        people = person[1];
                        ageStatus = true;
                        System.out.println("You are an: " + people);
                    } else {
                        people = person[2];
                        ageStatus = true;
                        System.out.println("You are an: " + people);
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Invalid character! Insert a valid number.");
                }
            }

            while (!walletStatus) {
                for (int i = 0; i < wallet.length; ) {
                    System.out.print("Choose the " + (i + 1) + "° Money Type: ");
                    String item = userInput.nextLine();

                    if (item.isBlank()) {
                        System.out.println("Item cannot be empty!");
                    } else {
                        wallet[i] = item;
                        i++;
                    }
                }

                walletStatus = true;
            }

            System.out.println("\n--- User Summary ---");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Wallet contains:");
            for (String item : wallet) {
                System.out.print(" - " + item);
            }
        */

        /* -- Switch --
        byte month = 3;
        String outMonth = "";

        switch(month) {
            case 1:
                outMonth = "January";
                break;
            case 2:
                outMonth = "February";
                break;
            case 3:
                outMonth = "March";
                break;
            case 4:
                outMonth = "April";
                break;
            case 5:
                outMonth = "May";
                break;
            case 6:
                outMonth = "June";
                break;
            case 7:
                outMonth = "July";
                break;
            case 8:
                outMonth = "August";
                break;
            case 9:
                outMonth = "September";
                break;
            case 10:
                outMonth = "October";
                break;
            case 11:
                outMonth = "November";
                break;
            case 12:
                outMonth = "December";
                break;
            default:
                outMonth = "Invalid month";
                break;
        }

        System.out.println("Month: " + outMonth);
         */

        /*
            // -- OOP --
            People people = new People();
            byte age = 20;

            people.setAge(age);
            System.out.println(people.getAge());

            // -- Builders --
            Car car = new Car("Red");

            car.accelerate();
            String carColor = car.carColor();
            System.out.println("The car has a "+ car.carColor() + " color!");
            System.out.println("The car has a "+ carColor + " color!");

            // -- Heritage --
            Truck truck = new Truck();
            System.out.println("Current gear is: " + truck.gearShift("up"));
            System.out.println("Current gear is: " + truck.gearShift("up"));
            System.out.println("Current gear is: " + truck.gearShift("up"));
            System.out.println("Current gear is: " + truck.gearShift("down"));
         */

        /* -- Exeptions --
            double totalValue = 4000;
            double downPayment = 900;
            int installments = 8;

            try {
                Financing financing = new Financing(totalValue, downPayment, installments);
                System.out.println(financing.provision());
            } catch (RuntimeException e) {
                System.out.print(e);
            }
        */

        /* -- Instanceof --
            // Verify an Object only!
            Object obj = "Hello";
            if (obj instanceof String) {
                System.out.println(obj);
            }

            Boolean status = true;
            if (status instanceof Boolean) {
                System.out.println("Boolean");
            }
        */

        /* --  switch-case Initialization + Lambda
            String day = "Mon.";

            String dayType = switch (day) {
                case "Mon.", "Tue.", "Wed.", "Thu.", "Fri." -> "Working day";
                case "Sat.", "Sun." -> "Weekend";
                default -> "Unknown";
            };

            System.out.println(dayType);
        */

        /* -- Satisfaction level with switch-case Expression --
            byte level = 5;
            final String[] feedback = {"Very dissatisfied!", "Dissatisfied!", "Neutral!", "Satisfied!", "Very satisfied!"};
            switch (level) {
                case 1 -> System.out.println(feedback[0]);
                case 2 -> System.out.println(feedback[1]);
                case 3 -> System.out.println(feedback[2]);
                case 4 -> System.out.println(feedback[3]);
                case 5 -> System.out.println(feedback[4]);
                default -> System.out.println("Err"); // Create a best msm err
            }
        */

        /* -- Constructor Overloading --
            Bike bike0 = new Bike();
            Bike bike1 = new Bike("Ford", "Ka");
            Bike bike2 = new Bike("Ford", "Ka", (short) 2023); // Err -> Send as Int!
        */

        /* -- Package --
        Ex: -> import company.data.Employeer

            Employeer employeer = new Employeer("Marcos", (double) 4928.74);

        */

        /* -- Methods and Encapsulation
            Product product = new Product("Smart Watch", 1200, 3027);
        */

        /* -- Method --
            Employeer employeer = new Employeer("Lucas", (double) 5389.94);
            employeer.increaseSalary(2948.79);
        */

        /* -- Array --
            int[] array;
            array = new int[3];
            array[0] = 10;
            array[1] = 20;
            array[2] = 30;
            array = new int[]{10, 20, 30};

            for(int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
         */

        /* -- Interfaces --
            Rabbit rabbit = new Rabbit();
            rabbit.flee();

            // Interface Predator extends Interface Prey too! ->
            rabbit.hunt();
            System.out.println(Prey.Description);

            // Default and Static methods on Interfaces
            // NOTE: Predator extends Prey!
            Predator.preyDescription();
            Predator.predatorDescription();
        */





    }

}