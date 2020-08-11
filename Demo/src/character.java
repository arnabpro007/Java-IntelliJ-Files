import java.util.Scanner;

public class character {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your String");
        String s = input.nextLine();
        System.out.println(s.length() + " is the length of your string" );
        for(int i = 0;i<s.length();i++){
            System.out.println("Character at index "+i+" is " +s.charAt(i));
        }
        String p = s.replace(" ","");
        System.out.println(p);
    }
}
