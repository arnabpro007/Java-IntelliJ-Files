import java.util.*;

public class Module2Assignment {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello! What is your name?");
        String name = input.next();
        System.out.println("Hello " + name + " what will you pick? (O)dd or (E)ven");
        String pick = input.next();
        if (pick.equals("Odd")) {
            System.out.println(name + " has picked Odd");
            System.out.println("What is your finger score?");
            int f1 = input.nextInt();
            Random rand = new Random();
            int f2 = rand.nextInt(6);
            System.out.println("Computer has picked " + f2 + " fingers");
            System.out.println(f1 + "+" + f2 + "=" + (f1 + f2));
            if ((f1 + f2) % 2 == 0) {
                System.out.println("Computer has won!");
            }else {
                System.out.println(name + " has won!");
            }

        }else{
            System.out.println(name + " has picked Even");
            System.out.println("What is your finger score?");
            int f1 = input.nextInt();
            Random rand = new Random();
            int f2 = rand.nextInt(6);
            System.out.println("Computer has picked " + f2 + " fingers");
            System.out.println(f1 + "+" + f2 + "=" + (f1 + f2));
            if ((f1 + f2) % 2 == 1) {
                System.out.println("Computer has won!");
            }else {
                System.out.println(name + " has won!");
            }
        }
    }
}
