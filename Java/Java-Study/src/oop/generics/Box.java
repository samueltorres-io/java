package oop.generics;

public class Box<T>{
    // Or create a list for boxList!
    public T boxList;

    public void save(T item) {
        this.boxList = item;
    }

    public T getBoxItems() {
        return boxList;
    }

    public static void main(String[] args) {

        // Text box
        Box<String> backpack = new Box<>();
        backpack.save("Lantern");
        System.out.println(backpack.getBoxItems());

        // Number box
        // int -> Integer
        // long -> Long
        // byte -> Byte
        //...
        Box<Integer> numberBox = new Box<>();
        numberBox.save(20);
        Integer number = numberBox.getBoxItems();
        System.out.println(number);
    }
}
