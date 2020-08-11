package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Bed:
        Bed thebed = new Bed("Godrej",2016,new newDimension(25,25,10),25000,100);
        //Table:
        Table thetable = new Table("ArnCos",new newDimension(10,10,25),10000);
        Room myRoom = new Room(thebed,thetable);
        myRoom.Description();
    }
}
