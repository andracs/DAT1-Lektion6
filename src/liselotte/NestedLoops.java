package liselotte;

public class NestedLoops {
    public static void main(String[] args) {

        int i, j, resultat; //deklarerer mine variabler i og j

        for (j = 1; j <= 10; j++) { //kolonner

            for (i = 1; i <= 10; i++) { //rækker
                resultat = i*j;
                if(resultat % 10 == 0) { //de tal som er delelige med 10
                    System.out.print("*"); // vil blive markeret med en stjerne
                }
                if(resultat < 10) {
                    System.out.print("^");
                }
                System.out.print(resultat + " ");

            }

            System.out.println();

        }


    }
}
