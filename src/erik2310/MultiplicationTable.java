package erik2310;

public class MultiplicationTable {

    public static void main(String[] args) {
        int j, i;

        for (j = 1; j <= 5; j++) {
            for (i = 1; i <= 5; i++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }

}
