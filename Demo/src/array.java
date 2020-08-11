import java.lang.reflect.Array;
import java.util.Scanner;
import java.util.Arrays;
public class array {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of homework assignments:");
        int num = input.nextInt();
        double s = 0;
        int[] homework = new int[num];
        for (int i=0;i<homework.length;i++){
            System.out.println("Enter your homework "+ (i+1) +" score:");
            homework[i] = input.nextInt();
            s = s + homework[i];
        }
        s = s/num;
        for (int i=0;i<homework.length;i++){
            if (homework[i]>s){
                System.out.println("Above average score:"+homework[i]);
            }
        }
        int[] b = homework;
        int[] a = Arrays.copyOf(homework,homework.length);
        homework[0] =0;
        System.out.println(homework.toString());
        System.out.println(a.toString());
        System.out.println(b.toString());





    }
}