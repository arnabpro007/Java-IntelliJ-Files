package com.company;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the date");

        String[] firstMultipleInput = scanner.nextLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);


        System.out.println(findDay(month,day, year));


    }
    public static String findDay(int month , int day, int year) {
        String date = Integer.toString(day) + "/"+Integer.toString(month) + "/" + Integer.toString(year);
        SimpleDateFormat format1=new SimpleDateFormat("dd/MM/yyyy");
        try {
            //The code you are trying to exception handle
            Date dt1=format1.parse(date);
            DateFormat format2=new SimpleDateFormat("EEEE");
            String finalDay=format2.format(dt1);
            return finalDay.toUpperCase();
        }
        catch (Exception e) {
            //The handling for the code
            return "ERROR!";
        }









    }
}
