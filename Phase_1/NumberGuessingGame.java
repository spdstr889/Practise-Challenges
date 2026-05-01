import java.util.Random;
import java.util.Scanner;


public class NumberGuessingGame {
    private static int rando;

    public static void main (String[] args){
        Random random=new Random();
        try (Scanner scanner = new Scanner(System.in)) {
            rando = random.nextInt(100)+1;
            int count=0;
            System.out.println("Guess a number between 1 and 100:");
            while (count<100){
                int userNum=scanner.nextInt();
                if (userNum<rando){
                    System.out.println("Too low");


                }
                else if (userNum>rando){
                    System.out.println("Too high");

                }
                else if (userNum==rando){
                    System.out.println("You got it!");
                    break;
                }
                count++;
            }
        }

    }
    
}
