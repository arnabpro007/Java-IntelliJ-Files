import java.util.Scanner;

public class MazeRunner extends Maze{
    public static void main(String[] args){
        Maze myMap = new Maze();
        int e = 0;
        Intro();
        myMap.printMap();
        usermove();
        if (usermove().equals("R")){
            if (myMap.canIMoveRight()==false){
                System.out.println("Sorry! You have hit a wall pick again!");
                usermove();}else {
                e = e+1;
            }
        }else if (usermove().equals("L")){
            if (myMap.canIMoveLeft()==false){
                System.out.println("Sorry! You have hit a wall pick again!");
                usermove();} else {
                e = e+1;
            }
        }else if (usermove().equals("U")){
            if (myMap.canIMoveUp()==false){
                System.out.println("Sorry! You have hit a wall pick again!");
                usermove();} else {
                e = e+1;
            }
        }else{
            if (myMap.canIMoveDown()==false){
                System.out.println("Sorry! You have hit a wall pick again!");
                usermove();} else{
                e = e+1;
            }
        }
        }
    public static void Intro(){
        System.out.println("Hello Welcome to Maze Runner Game here you have to exit the maze within 100 steps! Good Luck!");

    }
    public static String usermove(){
        Scanner input = new Scanner(System.in);
        System.out.println("In which direction you would like to move? (R, L, U, D)");
        String move = input.nextLine();
        while ((move.equals("R")||move.equals("L")||move.equals("U")||move.equals("D")) == false){
            System.out.println("You have given an invalid direction please type again, In which direction you would like to move? (R, L, U, D)");
            move = input.nextLine();
        }

        return move;
    }
}