package MadsTheCaptain.DetViLavedeIKlassen;
import java.util.Scanner;

public class GuessNumberOneTime {
    public static void main(String[] args) {
        // Generate a random number to be guessed
        int number = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Guess a magic number between 0 and 100");

        // Prompt the user to guess the number
        System.out.print("Enter your guess: ");

        int guess = input.nextInt();

        if (guess> number){
            System.out.println("Your guess is too high.");
        }else if (guess < number){
            System.out.println("You number is too low.");
        }else if (guess == number){
            System.out.println("Youre right! The number is :"+ guess);
        }else{
            System.out.println("Something went wrong..");
        }

        while (guess != number){
            System.out.print("Enter your guess: ");
            int guesss = input.nextInt();
            guess=guesss;

            if (guess> number){
                System.out.println("Your guess is too high.");
            }else if (guess < number){
                System.out.println("You number is too low.");
            }else if (guess == number){
                System.out.println("Youre right! The number is: "+ guess);
            }else{
                System.out.println("Something went wrong..");
            }

        }

    }

}