package mattu;

// Write a program that prompts the user to enter an integer.
// If the number is a multiple of 5, print HiFive.
// If the number is divisible by 2, print HiEven.

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Input fra user.
        System.out.println("Indtast et tal: ");
        int number1 = input.nextInt();

        // Udskriver HiNothing hvis tallet er 0
        if (number1 != 0){
            if (number1 % 5 == 0) {
                System.out.println("HiFive");

            }
        if (number1 % 2 == 0) {
            System.out.println("HiEven");
        }

        boolean kanDelesMed2, kanDelesMed5;
        kanDelesMed5 = (number1 % 5 == 0);
        kanDelesMed2 = (number1 % 2 == 0);

        if ((!kanDelesMed2) && (!kanDelesMed5)) {
            System.out.println("HiNothing");
        }

        //if ((number1 % 5 != 0) && (number1 % 2 != 0)) {
          //  System.out.println("HiNothing");
        //}

        }else {
            System.out.println("Intet går op i 0");
        }

        boolean b = !true;
        System.out.println("IKKE sandt (!true) er " + b + ".");
    }
}