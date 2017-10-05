package mattu;

public class MultiplicationTable {
    public static void main(String[] args) {



        for (int i = 1; i <=5; i++){ // Kolonner
            System.out.println();
            for (int j = 1; j <= 5; j++) { // Rækker
                System.out.printf("%5d", i * j);

            }
            System.out.println();
        }
    }
}
