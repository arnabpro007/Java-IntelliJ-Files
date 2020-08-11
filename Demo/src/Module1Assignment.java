import java.util.Scanner;
import java.util.*;
public class Module1Assignment {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method4();

    }
    public static void method1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to vacation Planner!");
        System.out.println("What is your name?");
        String name = input.next();
        System.out.println("Nice to meet you " + name + ", where are you travelling to?");
        String name1 = input.next();
        System.out.println("Great! "+ name1 + " sounds like a great trip");
        System.out.println("**************************************");
        System.out.println(" ");
    }
    public static void method2(){
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are you going to spend travelling?");
        int NumDays = input.nextInt();
        System.out.println("How much money, in USD, are you planning to spend on your trip?");
        Double Money = input.nextDouble();
        System.out.println("What is the three letter currency symbol for your travel destination?");
        String curr = input.next();
        System.out.println("How many "+curr+" are there in 1 USD?");
        Double conv = input.nextDouble();
        System.out.println("If you are travelling for "+NumDays + " that is the same as " + (24*NumDays) + " hours");
        System.out.println("If you are going to spend "+Money+" USD that means per day you can spend "+ (Money/NumDays));
        System.out.println("Your total budget in "+ curr + " is "+ (Money*conv)+", which per day is "+(Money*conv/NumDays));
        System.out.println("**************************************");
        System.out.println(" ");

    }
    public static void method3(){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the difference ,in hours, between your home and your destination?");
        Double time = input.nextDouble();
        int z = (int)(time*100);

        int x = z/100;
        int y = z%100;
        System.out.println("That means that when it is midnight at home it will be "+x+":"+y+" in your travel destination");
        System.out.println("and when it is noon at home it will be "+ (x+12)+":"+y);
        System.out.println("**************************************");
        System.out.println(" ");

    }
    public static void method4(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Latitude of your home:");
        Double l1 = input.nextDouble();
        System.out.println("Enter Longitude of your home:");
        Double l2 = input.nextDouble();
        System.out.println("Enter Latitude of your destination:");
        Double p1 = input.nextDouble();
        System.out.println("Enter Longitude of your destination:");
        double p2 = input.nextDouble();
        double r = 6378.1;
        double d1 = (l1-p1)/2;
        double d2 = (l2-p2)/2;
        double d3 = Math.toRadians(d1);
        double d4 = Math.toRadians(d2);
        double e1 = Math.sin(d3);
        e1 = e1*e1;
        double e2 = Math.sin(d4);
        e2 = e2*e2;
        double e4 = Math.cos(l1);
        double e5 = Math.cos(p1);
        double fin = (2*r*(Math.sqrt(e1 +(e2*e5*e4)))) ;

        System.out.println("So the distance between your home and your destination is " + fin +"kms");
        System.out.println("**************************************");
        System.out.println(" ");

    }

}
