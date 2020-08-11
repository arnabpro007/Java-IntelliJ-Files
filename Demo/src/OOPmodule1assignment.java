import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

public class OOPmodule1assignment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //Empty Map
        String[][] map = new String[12][16];
        for(int i =0;i<map.length;i++){
            for (int j=0;j<map[i].length;j++){
                map[i][j] = " ";
            }
        }
        int m =0;
        for (int j=3;j<=12;j++){
            int l = m;
            map[0][j] = Integer.toString(l);
            map[11][j] = Integer.toString(l);
            m=m+1;
        }
        int k =0;
        for (int i=1;i<=10;i++){
            int l =k;
            map[i][0] = Integer.toString(l) ;
            map[i][15] = Integer.toString(l);
            map[i][2] = "|";
            map[i][13] = "|";
            k = k+1;

        }





        System.out.println("*****Welcome to the Battleship Game*****");
        System.out.println("Right now the sea is empty");
        for(int i=0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]);
            }
            System.out.print("\n");

        }
    //Deploying user ship's round-1
        ArrayList<Integer> user = new ArrayList<Integer>();
        user.add(-97);
        user.add(-97);
        for(int i = 0;i<=4;i++){

            int x = -1;
            int y = -1;

            for (int r = 0; r<=user.size()/2;r++) {
                System.out.print("Enter your " + (i+1) + " ship's X-co-ordinate:");
                x = input.nextInt();
                System.out.print("Enter your " + (i+1) + " ship's Y-co-ordinate:");
                y = input.nextInt();
                while (((x < 0) || (x > 9) || (y < 0) || (y > 9))||((x==user.get(2*r))&&(y == user.get((2*r)+1)))) {
                    System.out.print("Try again,Enter your " + (i+1) + " ship's X-co-ordinate:");
                    x = input.nextInt();
                    System.out.print("Try again,Enter your " + (i+1) + " ship's Y-co-ordinate:");
                    y = input.nextInt();
                }

            }
            user.add(x);
            user.add(y);
            map[x+1][y+3] = "@";
        }
        System.out.println("*****Welcome to the Battleship Game*****");
        System.out.println("You have deployed your ships");
        for(int i=0;i<map.length;i++){
            for (int j = 0;j<map[i].length;j++){
                System.out.print(map[i][j]);
            }
            System.out.print("\n");

        }



    }
}
