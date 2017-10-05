package SaneStreet;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //System.out.println("Hello world.");

        int random = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess = -10;

        //System.out.println(random);
        //System.out.println(guess);

        while(guess != random){

            System.out.println("CHEAT - the number is: " + random);
            System.out.println("Guess a number between 0 and 100: ");
            guess = input.nextInt();
            if (guess == random){
                System.out.println("you got it");
            }
            if (guess > random){
                System.out.println("too high");
            }
            if (guess < random)
                System.out.println("too low");

        }
    }
}
