/* Dette program er en simpel test af if og else statements. Let's go comment that code! */

package daniel;
import java.util.Scanner; // Importerer Scanner-klassen fra package java.util

public class SimpleIfDemo {

    public static void main(String[] args) { // Kører programmet

        int indtastHeltal; // Deklarerer variabel

        System.out.print("Indtast dit tal: "); // Printer tekst
        Scanner input = new Scanner(System.in); // Laver ny Scanner med navnet "input"
        indtastHeltal = input.nextInt(); // Fortæller at variablen "indtastHeltal" er baseret på den oprettede Scanner

        if ( indtastHeltal != 0 ) { // If-statement der siger, at "indtastHeltal" IKKE kan være 0. I så fald køres de følgende statements ikke!
            if (indtastHeltal % 5 == 0) { // If-statement der siger, at "indtastHeltal" SKAL kunne deles med 5
                System.out.println("HiFive!"); // Udskriver denne tekst, hvis betingelsen er sand
            } // Bemærk der ikke er nogen "else" herefter, hvilket betyder, at både dette og næste statement kan komme til at være sande

            if (indtastHeltal % 2 == 0) { // If-statement der siger, at "indtastHeltal" SKAL kunne deles med 2
                System.out.println("HiEven!"); // Udskriver denne tekst, hvis betingelsen er sand
            }

            if ((indtastHeltal % 5 != 0) && (indtastHeltal % 2 != 0)) { // If-statement der siger, at ingen af de to forgående statements er sande
                System.out.println("HiNothing!"); // Udskriver denne tekst, hvis "indtastHeltal" hverken kan divideres med 5 eller 2
            }
        } // Afslutter vores hoved-statement

        else System.out.println("Tallet kan ikke være 0!"); // Udskriver denne tekst i konsollen, hvis tallet ikke er lig med 0

    } // Afslutter vores program

}