package erik2310;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        // Laver et tilfældigt tal
        int randomNumber = (int)(Math.random() * 101);

        //Laver en scanner
        Scanner input = new Scanner(System.in);

        // Udskriver en besked
        System.out.println("Guess a number between 0 and 100");

        // Laver en int variabel
        int guess = -1;
        // En while løkke der kører så længe at guess ikke er det samme som randomNumber
        while (guess != randomNumber) {
            // Spørger om guess
            System.out.println("Enter your guess: ");
            // Gemmer brugerens indtastning i guess som int
            guess = input.nextInt();

            if (guess == randomNumber) {
                System.out.println("You guessed right, the number is " + randomNumber + ".");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high.");
            } else {
                System.out.println("Your guess is too low.");
            }
        }
    }

}
