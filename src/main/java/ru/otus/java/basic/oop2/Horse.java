package ru.otus.java.basic.oop2;

public class Horse extends Animal{
    public Horse(String name, double runningSpeed, double swimmingSpeed, int endurance) {
        super(name, runningSpeed, swimmingSpeed, endurance);
    }
    public double swim(int distance) {
        double time = distance / swimmingSpeed;
        double wasteOfStamina = distance * 4;
        if (endurance >= wasteOfStamina) {
            endurance -= wasteOfStamina;
            System.out.println(name + " порплыл " + distance + "м, Осталось выносливости: " + endurance);
        } else {
            System.out.println(name + " Недостаточно выносливости для такой дистанции");
            return -1;
        }
        return time;
    }
}
