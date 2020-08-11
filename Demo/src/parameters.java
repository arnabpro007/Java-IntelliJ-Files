import java.util.*;
public class parameters {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What would you like to enter integer or double?");
        String type = input.next();
        if (type.equals("integer")){
            System.out.println("Enter your integer:");
            int val = input.nextInt();

            method1(val);
        }else if (type.equals("double")){
            System.out.println("Enter your double:");
            double val = input.nextDouble();
            method1(val);
        }else {
            String p = method1(type);
            System.out.println(p);
        }
    }
    public static void method1(int x){
        System.out.println("Your lucky number: "+ (x*x/(x+5)));
        double y = Math.decrementExact(x);
        System.out.println("Decrement Exact = "+ y);
    }
    public static void method1(double x){
        System.out.println("Your lucky number: "+ (x*x/(x+5)));
        double y = Math.exp(x);
        System.out.println("Exponential value = "+y);
    }
    public static String method1(String x){
        String a = "hey you entered " + x +" which is not a keyword,restart the program and try again" ;
        return a;
    }
}
