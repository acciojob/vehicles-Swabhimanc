package com.driver;

public class Car extends Vehicle {
    private int wheels;
    private String type;
    private int doors;
    private int gears;
    private boolean isManual;
    private int currentGear;
    private int seats;
    private String name;

    public Car(String name, int wheels, int doors, int gears, boolean isManual, String type, int seats) {
        super(name);
        this.name=name;
        this.wheels=wheels;
        this.doors=doors;
        this.gears=gears;
        this.isManual=isManual;
        this.type=type;
        this.seats=seats;
    }

    public void changeGear(int newGear){
        if (newGear >= 1 && newGear <= gears) {
            this.currentGear = newGear;
        } else {
            System.out.println("Invalid gear!");
            return;
        }
        System.out.println("changeGear method called - The gear is changed to: " + currentGear);
    }

    public void changeSpeed(int newSpeed, int newDirection){
        if (newSpeed >= 0) {
            super.move(newSpeed, newDirection);
        } else {
            System.out.println("Invalid speed!");
        }
        System.out.println("changeSpeed method called - The speed is changed to: " + newSpeed + ", and the direction is changed to: " + newDirection + " degrees");
    }

    public int getCurrentGear() {
        return currentGear;
    }
    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isManual() {
        return isManual;
    }

    public String getType() {
        return type;
    }

    public int getSeats() {
        return seats;
    }

}
