// Number Game 

import java.util.Scanner;
import java.util.Random;

public class Task1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int randomNumber = r.nextInt(100) + 1;
        int numOfAttempts = 0;
        boolean playAgain;
        System.out.println("                          ******Welcome to Number Game!******\n");
        System.out.println("***Rules for the Game***\n");
        System.out.println("1.Guess a random number");
        System.out.println("2.No negative number is allowed");
        System.out.println("3.Kindly use a range of positive numbers between 0 to 100\n");
        System.out.println("********** GAME STARTED **********\n");
        int userGuess;
        int round = 0;

        do{
            System.out.println("\nRound" +(round+1)+ ":\n");

        do
        {
            System.out.print("Guess a random number between 0 to 100: ");
            userGuess = sc.nextInt();
            numOfAttempts++;

            if(userGuess < randomNumber)
            {
                System.out.println("You are guessing lower number. Try again with guessing higher number\n");
            }

            else if(userGuess > randomNumber)
            {
                System.out.println("You are guessing higher number. Try again with guessing lower number\n");
            }
            
            else
            {
                System.out.println("Congratulations! You guessed the number correctly.\n");
            }

        } while(userGuess != randomNumber);
    
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
            round++;

    } while(playAgain);

    System.out.println("Total rounds played: "+round);
    System.out.println("Total attempts: "+numOfAttempts);
    System.out.println("\n********** GAME OVER **********\n");

    sc.close();
    }
}