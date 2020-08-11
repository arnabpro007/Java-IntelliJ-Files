public class Loopyloops {
    public static void main(String[] args) {
        int number = 3;
        if(number == 4){
            number--;
        }
        for (int i = 0; i < number; i++) {
            System.out.println("This is " + i  );
        }
        while(number>0){
            number --;
        }
        System.out.println(number);
    }

}
