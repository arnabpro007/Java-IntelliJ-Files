import java.util.*;
public class ControlStructure {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("************Welcome to HBS Admission Board!****************");
        int num = 0;
        for(int i=0;i<=4;i++) {
            while (num < 2) {

                System.out.println("Enter your GMAT score:");
                int gmat = input.nextInt();
                System.out.print("Enter your company level by our ranking system:");
                int clev = input.nextInt();
                System.out.println("Enter your experience level:");
                int exp = input.nextInt();
                System.out.println("Enter your essay rating");
                int ess = input.nextInt();
                System.out.println("Enter your extracurricular rating:");
                int exc = input.nextInt();
                double rating = gmat + (exp * 200.0 / clev) + (100.0 * ess) + (100.0 * exc);
                if (rating > 2000) {
                    System.out.println("Congrats you are admitted to HBS!");
                    System.out.println("Are you going to book your seat?");
                    String response = input.next();
                    if (response.equalsIgnoreCase("yes")) {
                        System.out.println("Alrigh! welcome to the family!");
                        num = num+1;
                    } else {
                        System.out.println("You stupid pig!");
                    }
                } else if (rating > 1600) {
                    System.out.println("You need to go through a round of interview before getting a final decision.");
                    System.out.println("Enter your interview score:");
                    int interview = input.nextInt();
                    double score = rating + (interview * 100);
                    if (score > 2200) {
                        System.out.println("Congrats you are admitted to HBS!");
                        System.out.println("Are you going to book your seat?");
                        String response = input.next();
                        if (response.equalsIgnoreCase("yes")) {
                            System.out.println("Alrigh! welcome to the family!");
                            num = num+1;
                        } else {
                            System.out.println("You stupid pig!");
                        }
                    } else {
                        System.out.println("Try again in the next round!");
                    }
                } else if (rating > 1400) {
                    System.out.println("You are wait-listed for the moment.Check your email regularly if position opens up we will contact you!");
                } else {
                    System.out.println("Try again in the next round");
                }

            }
            num = 0;

        }

    }





}
