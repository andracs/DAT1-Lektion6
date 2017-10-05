package Mathias;

import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int) (Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();


        while (guess != number) {

            if (guess > number)
                System.out.println(" Your guess is too high, enter new guess ");
            else
                System.out.println(" Your guess is too low, enter new guess ");
            guess = input.nextInt();

        }
        if (guess == number)
            System.out.println(" Your Guess " + number + " is correct " );
    }
}