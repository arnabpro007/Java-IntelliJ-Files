package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dimensions dimensions = new Dimensions(20,50,10);
        Case theCase = new Case("220B","Intel","240",dimensions);
        Monitor monitor = new Monitor("24inch","Intel",24,new Resolution(2450,1440));
        Motherboard motherboard = new Motherboard("255C","Intel",4,4,"TYT");
        PC myPc = new PC(theCase,monitor,motherboard);
        myPc.powerUp();

    }
}
