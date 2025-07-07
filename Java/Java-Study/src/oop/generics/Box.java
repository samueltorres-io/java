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

        Box<String> backpack = new Box<>();
        backpack.save("Lantern");
        System.out.println(backpack.getBoxItems());

    }
}
