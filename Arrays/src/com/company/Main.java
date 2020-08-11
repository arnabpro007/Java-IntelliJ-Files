package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
       int[] myintArray = {1,2,3,4,5,6,7,8,9,10};
       //myintArray[5] = 50;
       System.out.println(myintArray[5]);
       printArray(myintArray);

    }
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is "+ array[i]);
        }
    }
}
