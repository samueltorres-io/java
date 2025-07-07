package oop.polymorphism;

public class TestPolymorphism {

    public static void main(String[] args) {

        // Polymorphism obj
        // Desta forma, podemos utilizar o metodo 'animalSong()' e quem será referenciado é a principal.
        // Podemos reutilizar partes do dos códigos(variaveis, metodos, etc...) da classe super e da principal.
        // Podemos criar um novo obj e usar o mesmo metodo, mas de forma dinámica e reutilizavel.
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.animalSong();
        dog.animalName = "Teddy";

        cat.animalSong();
        cat.animalName = "Cat";

    }

}
