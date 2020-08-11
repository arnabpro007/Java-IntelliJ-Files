package com.company;

public class Car extends Vehicle {
    private String SteeringType;
    private int capacity;
    private int price;
    private int gear;
    public int speed;

    public Car(String name, int wheels, int weight, String steeringType, int capacity, int price,int gear,int speed) {
        super(name, wheels, weight);
        SteeringType = steeringType;
        this.capacity = capacity;
        this.price = price;
        this.gear = gear;
        this.speed = speed;
    }
    public void gear(int num){
        System.out.println("Your car has changed gear from "+ this.gear+ " to " + num);
        this.gear = num;
    }

    public void speedUp(int val){
        System.out.println("Speed changed from " + this.speed + " to " + (this.speed + val));
        this.speed += val;
    }
    private void move(){
        System.out.println("Your car is now moving!");
    }

    @Override
    public void move(int speed) {
        move();
    }
}
