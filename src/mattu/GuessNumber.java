package mattu;

import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        int number = (int)(Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a number between 0 and 100");


        int guess = -10;


        do {
            System.out.print("\nEnter your guess: " );
            guess = input.nextInt();

            if (guess == number)
                System.out.println("Yes, the number is " + number);
            else if (guess > number)
                System.out.println("Your guess is too high");
            else {
                System.out.println("Your guess is too low");

            }
        } while (guess != number);




    }
}
