package com.company;

public class Dog extends Animals {
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;
    public Dog(String name, int size, int weight,int eyes, int legs, int tail,int teeth,String coat) {
        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }
    private void chew(){
        System.out.println("Chew!!");
    }

    @Override
    public void eat() {
        this.chew();
        super.eat();
    }

    public void walk(){
        System.out.println("Walking");
    }
    public void Run(){
        System.out.println("Running");
    }

    @Override
    public void move(int speed) {
        if (speed<10){
            this.walk();
        }else{
            this.Run();
        }

    }
}
