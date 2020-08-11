import java.util.Scanner;

public class Module3Assignment {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your message:");
        String message = input.nextLine();
        System.out.println("Enter your key:");
        int key = input.nextInt();
        String p1 = method1(message);
        System.out.println("First Step: "+ p1);

        String p2 = method2(p1,key);
        System.out.println("Second Step "+p2);
        String p3 = method3(p2,key);
        System.out.println("Encrypted message: " + p3);
        String p4 = method4(p3,key);
        System.out.println("Decrypted message: "+p4);
    }
    public static String method1(String x){
        x = x.replaceAll("\\s+","");
        x=x.replaceAll("\\p{Punct}","");
        x = x.toUpperCase();
        return x;
    }
    public static String method2(String x,int y){
        String result = "";
        for(int i=0;i<x.length();i++){
            if ((int)x.charAt(i)<=90-y) {
                int s = (int) x.charAt(i) + y;
                result = result + (char) s;
            } else {
                int s = (int)x.charAt(i);
                int r = y-(90-s)+64;
                result = result + (char) r;
            }
        }
        return result;
    }
    public static String method3(String x,int y){
        String result = "";
        for(int i =0;i<x.length();i++){
            if(i%y ==0){
                result = result+" "+x.charAt(i);
            }else {
                result = result + x.charAt(i);
            }
        }
        if (x.length()%y ==0){
            return result;
        }else{
            int m = y - x.length()%y;
            String add = "";
            for(int j = 1;j<=m;j++){
                add = add+"x";
            }
            result = result+add;
            return result;
        }



    }
    public static String method4(String x,int y){
        x = x.replaceAll("\\s+","");
        x = x.replaceAll("x","");
        String result = "";
        for(int i=0;i<x.length();i++){
            if ((int)x.charAt(i)>=65+y) {
                int s = (int) x.charAt(i) - y;
                result = result + (char) s;
            } else {
                int s = (int)x.charAt(i);
                int r = 90-(y-(s-64)) ;
                result = result + (char) r;
            }
        }
        return result;
    }
}
