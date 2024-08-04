import java.util.Random;
import java.util.Scanner;

public class Numbergussgame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        boolean playagain = true;
        int totalscore = 0;
        int roundswon = 0;
        System.out.println("welcome to game ");

        while (playagain) {
            int max_attemps = 5;
            int attemps = 0;
            int comp_guss = rand.nextInt(100);
            System.out.println("I am thinking of a number between 1 and 100");
            boolean roundwon = false;

            while (attemps < max_attemps) {

                System.out.println("Enter user input :");
                int user_guss = sc.nextInt();
                attemps++;

                if (user_guss < comp_guss) {
                    System.out.println("your guess is too low");
                    // System.out.println("computer guess is :" + comp_guss);
                }

                else if (user_guss == comp_guss) {
                    System.out.println("Congrulation your guess is correct");
                    System.out.println("computer guess is :" + comp_guss);
                    roundwon = true;
                    break;
                }

                else {
                    System.out.println("your guess is too high");
                }

                System.out.println();
            }

            if (roundwon) {
                roundswon++;
                totalscore = totalscore + (max_attemps - attemps);
            } else {
                System.out.println("Sorry your attemps are finish.The correct guess is :" + comp_guss);
            }

            System.out.println("Total score :" + totalscore);
            System.out.println("Round win :" + roundswon);

            System.out.print("Do you want to play again? (y/n): ");
            String response = sc.next();
            playagain = response.equalsIgnoreCase("y");
        }

        System.out.println("Thank you for playing");
    }

}
