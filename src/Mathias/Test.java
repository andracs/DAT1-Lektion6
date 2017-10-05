package Mathias;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(" Indtast et tal"); // printer en linje i konsollen som skriver indtast et tal
        int tal = input.nextInt(); // Deklarerer variablen tal som et input i konsollen

         // Hvis tallet kan ganges med 5 eller divideres med 2 så skriver den HIGHTWO i konsollen.
        if (tal % 5 == 0 && tal % 2 == 0)   {
            System.out.println(" HighTWO");

        }    // Hvis tallet der indtastes kan ganges med 5 skriver den HiFive
        else if (tal % 5 == 0) {
            System.out.println(" HiFive");
        }
              // hvis tallet kan divideres med 2 skriver den HiEven
        else if (tal % 2 == 0) {
            System.out.println(" HiEven ");
        }
          else System.out.println(" Du har indtastet noget som ikke gir mening ...");













    }
}
