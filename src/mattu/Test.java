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


        if (number1 % 5 == 0) {
            System.out.println("HiFive");


        }
        else if (number1 % 2 == 0){
            System.out.println("HiEven");
        }

        else {
            System.out.println("HiNothing");
        }

    }
}
