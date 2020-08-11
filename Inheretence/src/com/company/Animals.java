package com.company;

public class Animals {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animals(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }
    public void eat(){
        System.out.println("Eating------>like an animal");
    }

    public void move(int speed){
        System.out.println("Moving----->like an animal");
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }
}
