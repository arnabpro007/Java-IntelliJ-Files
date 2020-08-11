package com.company;

public class Ferrari extends Car {
    private int MaintainanceCost;
    private String Generation;
    private int insuranceCost;

    public Ferrari(String name, int wheels, int weight, String steeringType, int capacity, int price, int gear, int speed, int maintainanceCost, String generation, int insuranceCost) {
        super(name, wheels, weight, steeringType, capacity, price, gear, speed);
        MaintainanceCost = maintainanceCost;
        Generation = generation;
        this.insuranceCost = insuranceCost;
    }

    private void gear(){
        System.out.println("Special ferrari gear!!!");
    }

    @Override
    public void gear(int num) {
        this.gear();
        super.gear(num);

    }

    private void speedUp(){
        System.out.println("Ferrari special booster");
    }

    @Override
    public void speedUp(int val) {
        this.speedUp();
        super.speedUp(val);
    }
}
