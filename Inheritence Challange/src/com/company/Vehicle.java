package com.company;

public class Vehicle {

    private String name;
    private int wheels;
    private int weight;

    public Vehicle(String name, int wheels, int weight) {
        this.name = name;
        this.wheels = wheels;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getWeight() {
        return weight;
    }

    public void move(int speed){
        System.out.println("Your Vehicle is moving at "+ speed + "km/hr");

    }
}
