import java.util.*;
public class multiplicationTable {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int m = input.nextInt();
        System.out.println("Enter the ending number:");
        int n = input.nextInt();
        for(int i =1;i<=10;i++){
            for (int j = m;j<=n;j++){
                System.out.println(j+"x"+i+ "="+ (j*i));


        }
    }























}


}



