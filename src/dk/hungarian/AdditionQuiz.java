package dk.hungarian;

import java.util.Scanner;

public class AdditionQuiz {

    public static void main(String[] args) {
        //Random number generation
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);


        Scanner obj = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + " :- ");
        int number = obj.nextInt();
        System.out.println(number1 + " + " + number2 + " = " + number + " is " + (number1 + number2 == number));

        // Vi bruger if sætning til at vise resultat på dansk
        if (number1 + number2 == number) {
            System.out.println("Du har regnet rigtigt!");
        } else {
            System.out.println("Du har ikke regnet rigtigt!");
        }


    }
}
