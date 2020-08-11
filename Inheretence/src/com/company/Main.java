package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Animals animal = new Animals("Animal",1,1,1,10);
        Dog husky = new Dog("Husky",8,25,2,4,1,20,"Furry");
        husky.eat();
        husky.move(9);
        animal.eat();

        System.out.println("Fish section");
        Fish fish = new Fish("Katla",1,1,5,2,2,2,2);
        fish.move(35);

    }
}
