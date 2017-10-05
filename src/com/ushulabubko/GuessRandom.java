package com.ushulabubko;

import java.util.Scanner;

public class GuessRandom {
    public static void main(String[] args) {

        // i will start be creating a variable that can generate me a random number

        int guessNumber = (int)(Math.random()*201);


        Scanner input = new Scanner(System.in);
        System.out.println("guess a number between 0 and 200 " + guessNumber);


        System.out.println("\n what would you thing the number is ??? " + " : ");
        int guess = input.nextInt();

        while (guess != guessNumber){
            System.out.println("det er forkert fister");
            if (guess > guessNumber){
                System.out.println("du har gættet for højt.");
            }else if (guess < guessNumber){
                System.out.println("du har gættet for lavt");
            }
            System.out.println("prøv igen");
            guess = input.nextInt();
        }

        if ( guess == guessNumber){
            System.out.println("you did it !!!");
        }

    }



}
