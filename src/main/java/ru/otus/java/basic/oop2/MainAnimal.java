package ru.otus.java.basic.oop2;

public class MainAnimal {
    public static void main(String[] args) {
        Cat cat = new Cat("Murzik", 15, 0, 10);
        Dog dog = new Dog("Sharik", 25, 5, 20);
        Horse horse = new Horse("Loshad", 55, 55,150);
        cat.run(2);
        dog.run(30);
        horse.run(100);
        cat.swim(0);
        dog.swim(2);
        horse.swim(5);
        cat.info();
        dog.info();
        horse.info();
    }
}
