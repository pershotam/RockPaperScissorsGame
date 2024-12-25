import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mywins=0;
        int computerwins=0;
        byte rock = 0;
        byte paper = 1;
        byte scissors = -1;

        System.out.println("Game Rules");
        System.out.println("------------------");
        System.out.println("  0 : Rock\n  1 : Paper\n -1 : Scissors");
        System.out.println("------------------");

        System.out.println("Enter you name");
        String name = sc.nextLine();
        System.out.println("Player 1 -> "+ name);
        System.out.println("Player 2 -> Computer");
        System.out.println("Five Match Series");

        for (int i = 1; i <= 5; i++) {
            System.out.println("------------------");
            System.out.println("Match "+i);

            System.out.println("Enter your Move ");
            byte mymove = sc.nextByte();
            System.out.println("My Move " + mymove);

            int systemMove = (int) (Math.random() * 3) - 1;
            System.out.println("Computer Move " + systemMove);

            if (mymove == systemMove)
                System.out.println("Tie");

            else if ((mymove == 0)) {
                if (systemMove == 1){
                    System.out.println("Computer Win!");
                    computerwins+=1;
                }
                else{
                    System.out.println(name+" Win!");
                    mywins+=1;
                }
            } else if (mymove == 1) {
                if (systemMove == 0){
                    System.out.println(name+" Win!");
                    mywins+=1;
                }
                else{
                    System.out.println("Computer Win!");
                    computerwins+=1;
                }
            } else if (mymove == -1) {
                if (systemMove == 0){
                    System.out.println("Computer Win!");
                    computerwins+=1;
                }
                else{
                    System.out.println(name+" Win!");
                    mywins+=1;
                }
            } else
                System.out.println("Invalid number");
        }
        if (mywins>computerwins)
            System.out.println("\nCongratulations " +name+", You Win the Series!");
        else if (mywins==computerwins)
            System.out.println("\nSeries Tie!");
        else
            System.out.println("\nComputer Win the Series!");



    }
}
