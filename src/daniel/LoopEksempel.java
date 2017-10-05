/* Dette program er en simpel test af while-loop. Let's go comment that code! */

package daniel;

public class LoopEksempel {

    public static void main(String[] args) { // Kører programmet

        int i = 1; // Deklarerer og initialiserer variablen "i"
        while (i <= 50) { // Starter while-loop der kører så længe variablen "i" er mindre end eller lig med 50
            System.out.println(i + ". gang loopet er kørt."); // Printer tekst i konsollen med antal gange loopet har kørt
            i++; // Lægger 1 til variablen "i"
        }

    }

}