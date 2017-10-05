package thom9521;

import java.util.Scanner;

public class GuessANumber {


        public static void main(String[] args) {
            // Generate a random number to be guessed
            int number = (int)(Math.random() * 101);

            Scanner input = new Scanner(System.in);
            System.out.println("Guess a magic number between 0 and 100");

            // Prompt the user to guess the number
            System.out.print("\nEnter your guess: ");
            int guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");



            //Loop som bliver ved med at spørge om et nyt tal ind til det bliver det rigtige.
            while ( guess != number) {
                System.out.println("");
                System.out.println("Gæt igen");

                guess = input.nextInt();
                if (guess == number)
                    System.out.println("Yes, the number is " + number);
                else if (guess > number)
                    System.out.println("Your guess is too high");
                else
                    System.out.println("Your guess is too low");

            }
        }
    }

