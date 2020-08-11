package com.company;

public class Fish extends Animals {
    private int Gills;
    private int eyes;
    private int fins;

    public Fish(String name, int brain, int body, int size, int weight, int gills, int eyes, int fins) {
        super(name, brain, body, size, weight);
        Gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }
    private void swim(){
        System.out.println("Swimming");

    }

    @Override
    public void move(int speed) {
        swim();

    }
}
