public class Methods1 {
    public static void main(String[] args) {
        //Will filup later
        printer("I am Ironman!");
        System.out.println(sum(5.5,75));
        System.out.println(hasEqualSum(3,3,6));
        System.out.println(hasEqualSum(3,5,7));
    }
    public static void printer(String x){
        System.out.println(x);
    }
    public static int sum(int x , int y){
        return x + y ;
    }
    public static boolean hasEqualSum(int x , int y, int z){
        return z == x+y;
    }
    public static double sum(double x , double y){
        return x + y;
    }
}
