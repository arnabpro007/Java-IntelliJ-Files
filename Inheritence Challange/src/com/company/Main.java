package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Vehicle Class");
        Vehicle truck = new Vehicle("Volvo",24,1000);
        truck.move(30);

        System.out.println("Car Class");
        Car porsche = new Car("Porsche",4,120,"Power",2,40000,4,60);
        porsche.speedUp(75);

        System.out.println("Ferrari Class");
        Ferrari Ultra = new Ferrari("Ultra XS",4,190,"Power",4,65000,6,80,40000,"Ultra Generation",8000);
        Ultra.gear(2);
        Ultra.gear(7);
        Ultra.speedUp(95);

    }
}
