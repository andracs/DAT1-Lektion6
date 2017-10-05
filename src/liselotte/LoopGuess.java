package liselotte;

import java.util.Scanner;
// i denne løsninger bruges while loop
public class LoopGuess {
    public static void main(String[] args) {
        // definerer variablen number, som har et random til som værdi
        int nummer = (int)(Math.random() * 101);

        Scanner input = new Scanner(System.in);
        System.out.println("Gæt et tal mellem 1 og 100");

        // Udskriver en linje som beder bruger om at gætte
        System.out.print("\nIndtast dit gæt her: ");
        int gæt = input.nextInt();


            if (gæt == nummer) //hvis gættet fra bruger er lige med det random tal - så skal der ske noget
                System.out.println("HURRAAAAAA du gættede rigtigt og er derfor mega sej! " + nummer + " er det rigtige tal! "); //tekst der bliver udskrevet hvis bruger gætter rigtigt

            else if (gæt > nummer) //hvis gæt er højere en nummer
                System.out.println("Lavere");
            else //hvis gæt ikke er højere end nummer, må det derfor være lavere og nedenstående tekst udskrives
                System.out.println("Højere");

             while (gæt != nummer) { //laver mit loop - så længe gæt ikke er lig med nummer

                 gæt = input.nextInt(); //bruger bliver bedt om et nyt gæt

                 if (gæt == nummer) //hvis gættet fra bruger er lige med det random tal - så stopper loop og udsriver nedenstående linje
                     System.out.println("HURRAAAAAA du gættede rigtigt og er derfor mega sej! " + nummer + " er det rigtige tal! "); //tekst der bliver udskrevet hvis bruger gætter rigtigt

                 else if (gæt > nummer) //hvis gæt er højere en nummer
                     System.out.println("Lavere");
                 else //hvis gæt ikke er højere end nummer, må det derfor være lavere og nedenstående tekst udskrives
                     System.out.println("Højere");










             }
    }
}