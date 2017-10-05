/* Dette program er en overbygning på Y. Daniel Liangs class "GuessNumberOneTime".
Min tilføjelse gør brugeren i stand til at gætte flere gange vha. en while loop */

package daniel;
import java.util.Scanner;

public class GuessNumberWhileLoop {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("\nEnter your guess: ");
        int guess = input.nextInt();

        if (guess == number)
            System.out.println("Yes, the number is " + number + "! First try!");
        else if (guess > number)
            System.out.println("Your guess is too high");
        else
            System.out.println("Your guess is too low");

        while(guess != number) {
            System.out.println("Try again bro!");
            System.out.print("\nEnter your guess again: ");
            guess = input.nextInt();
            if (guess == number)
                System.out.println("Yes, the number is " + number + "! Great bro!");
            else if (guess > number)
                System.out.println("Your guess is too high");
            else
                System.out.println("Your guess is too low");
        }
    }
}