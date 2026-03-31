package ru.otus.java.basic.oop2;

public abstract class Animal {
    protected String name;
    protected double runningSpeed;
    protected double swimmingSpeed;
    protected int endurance;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(double runningSpeed) {
        this.runningSpeed = runningSpeed;
    }

    public double getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(double swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public int getEndurance() {
        return endurance;
    }

    public void setEndurance(int endurance) {
        this.endurance = endurance;
    }

    public Animal(String name, double runningSpeed, double swimmingSpeed, int endurance) {
        this.name = name;
        this.runningSpeed = runningSpeed;
        this.swimmingSpeed = swimmingSpeed;
        this.endurance = endurance;

        System.out.println("Появилось животное " + name);
    }

    public double run(int distance) {
        double time = distance / runningSpeed;
        double wasteOfStamina = distance;
        if (endurance >= wasteOfStamina) {
            endurance -= wasteOfStamina;
            System.out.println(name + " пробежал " + distance + "м, Осталось выносливости: " + endurance);
        } else {
            System.out.println(name + " Недостаточно выносливости для такой дистанции");
            return -1;
        }
        return time;
    }


    public abstract double swim(int distance);
public void info(){
    if (endurance <= 0){
        System.out.println(name + " устал, надо передохнуть");
    } else {
        System.out.println(name + " осталось еще " + endurance + " выносливости");
    }
}
}

