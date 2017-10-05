package niels;

import java.util.Scanner;

public class GaetEtTal {
        // Generate a random number to be guessed
        public static void main(String[] args) {


        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();

        while (guess != number) {
            System.out.println("\nEnter your number: ");

        if (guess == number)
            System.out.println("Yes, the number is " + number);
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");

        }
    }
}
