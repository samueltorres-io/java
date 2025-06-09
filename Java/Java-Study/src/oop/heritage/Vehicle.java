package oop.heritage;

public class Vehicle {

    public byte currentGear = 0;

    public byte gearShift(String upOrDown) {
        if (upOrDown.equals("up")) {
            if (currentGear < 5) {
                currentGear++;
            }
        } else if (upOrDown.equals("down")) {
            if (currentGear > 0) {
                currentGear--;
            }
        } else {
            System.out.print("Error!");
        }
        return currentGear;
    }

}
