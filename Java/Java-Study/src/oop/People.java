package oop;

public class People {

    public String name = "";
    private byte age = 0;

    // Get and Set
    public byte getAge() {
        return this.age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    // Method
    static boolean isAdult(byte age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }
}
