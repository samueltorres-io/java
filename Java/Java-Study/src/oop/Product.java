package oop;

public class Product {

    private String name;
    private double price;
    private int amount;

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;

        System.out.println(name);
        System.out.println(price);
        System.out.println(amount);
    }

}
