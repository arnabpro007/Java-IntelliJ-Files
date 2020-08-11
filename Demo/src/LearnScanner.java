import java.util.Scanner;

public class LearnScanner {
    public static void main(String[] args) {
        method1();
        method2();
        method3();

    }
    public static void method1(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.println("Hello " + name);
    }
    public static void method2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Write something about yourself: ");
        String name = input.nextLine();
        System.out.println("Is this really true? " + "\n" + name);
    }
    public static void method3(){
        Scanner input = new Scanner(System.in);
        System.out.println("Give me 3 numbers separated by comma and no spaces for god sake");
        Double name1 = input.nextDouble();
        Double name2 = input.nextDouble();
        Double name3 = input.nextDouble();
        Double mean = (name1+name2+name3)/3;
        System.out.println("Average is " + mean);
        if (mean%2 ==0){
            System.out.println("You are extremely un-odd!");
        }
        else{
            System.out.println("You are extremely odd!");
        }

    }
}