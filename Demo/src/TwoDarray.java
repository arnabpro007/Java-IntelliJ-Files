import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.System.out;

public class TwoDarray {
    public static void main(String[] args){
        String[][] location = new String[3][3];
        for (int i=0;i<location.length;i++){
            for(int j = 0;j<location[i].length;j++){
                out.println("["+i+","+j+"]");
            }



        }
        int[][] test = {{1,22},{22,1}};
        out.println(Arrays.deepToString(test));
        ArrayList<Integer> kek = new ArrayList<Integer>();

        kek.add(15);
        kek.add(17);
        kek.add(39);
        kek.add(32);
        out.println(kek);
        kek.add(3,15);
        out.println(kek);
        out.println(kek.lastIndexOf(15));




    }



}
