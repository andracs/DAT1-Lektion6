package MadsTheCaptain.DetViLavedeIKlassen;

public class NestedLoop {
    public static void main(String[] args) {
        int i;
        int j;
        for (i=1; i<=10;i++){

            for (j=1; j<=10;j++){
                int k=j*i;
                if (k<10){
                    System.out.print(" ");
                }
                System.out.print(k+" ");
            }

            System.out.println(" ");


        }
    }
}
