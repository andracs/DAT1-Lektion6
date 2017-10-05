package SaneStreet;

import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        //System.out.println("Hello world.");
        //DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE
        //DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE//DET VIRKER IKKE
        System.out.println("Guess a number: ");
        int random = (int)(Math.random() * 101);
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();

        System.out.println(random);
        System.out.println(guess);

        while(guess != random){
            System.out.println("Guess again: ");
            if (guess == random){
                System.out.println("you got it");
            }
            if (guess > random){
                System.out.println("too high");
            }
            else{
                System.out.println("too low");
            }
        }
    }
}
