package erik2310;

import java.util.Scanner;

public class SimpleIFDemo {

    public static void main(String[] args) {

        // Laver en scanner med input som objekt
        Scanner input = new Scanner(System.in);

        // Spørger brugeren om en integer
        System.out.println("Enter an integer: ");

        // Gemmer brugerens indtastning i int number som int
        int number = input.nextInt();

        // if statements der tjekker om den er 5 eller et lige tal
        if (number % 5 == 0) {
            System.out.println("HiFive");
        }

        if (number % 2 == 0) {
            System.out.println("HiEven");
        }

        // if statement der tjekker om den ikke er 5 og et lige tal
        if ((number % 5 != 0) && (number % 2 != 0)) {
            System.out.println("HiNothing");
        }


    }

}
