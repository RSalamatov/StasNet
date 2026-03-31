package ru.otus.java.basic.oop2;

public class Cat extends Animal {
    public Cat(String name, double runningSpeed, double swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }
    public double swim(int distance) {
        double time = distance / swimmingSpeed;
        System.out.println("Кот не плавает");
        return time;
    }


}
