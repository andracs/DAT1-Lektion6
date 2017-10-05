package SaneStreet;

public class ForExample {
    public static void main(String[] args) {
        int i, j, resultat;

        for(j = 1; j <= 10; j++) {
            for (i = 1; i <= 10; i++){
                resultat = i*j;
                if(resultat % 10 == 0){
                    System.out.print("*");
                }
                if (resultat < 10){
                    System.out.print(" ");
                }
                if(resultat % 10 != 0){
                    System.out.print(" ");
                }
                System.out.print(resultat + " ");
            }
            System.out.println();
        }
    }
}
