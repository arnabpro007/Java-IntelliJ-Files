public class variables {
    public static void main(String[] arg){

        method1();
        method2();
        method3();
    }
    public static void method1(){
        int x = 5;
        System.out.println("The number is "+x);
        x = 15;
        System.out.println("The number is "+x);
        String mystring = "The number is";
        System.out.println(mystring+" "+(x+2));
    }
    public static void method2(){
        double x = 15.23;
        double y = 16.23;
        int z = 5;
        int w = 6;
        System.out.println((x+y)+"  "+(x*y) + "  "+ (x/y));
        System.out.println((z+w)+"  "+(z*w)+"  "+(z/w));
    }
    public static void method3(){
        String var1 = "I am ";
        String var2 = "Iron man";
        System.out.println(var1+var2);
    }
}
