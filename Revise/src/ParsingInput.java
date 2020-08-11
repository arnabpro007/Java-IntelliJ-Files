import java.util.Scanner;

public class ParsingInput {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String number1 = scanner.nextLine();
        System.out.println("Enter a number: ");
        String number2 = scanner.nextLine();
        int firstNumber = Integer.parseInt(number1);
        int secondNumber = Integer.parseInt(number2);
        System.out.println("Sum of the number is: " + (firstNumber + secondNumber));
    }
}
