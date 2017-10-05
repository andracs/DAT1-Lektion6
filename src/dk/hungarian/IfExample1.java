package dk.hungarian;

public class IfExample1 {
    public static void main(String[] args) {

        int numb = 10;
        System.out.println("Tallet er " + numb);

        // Hvis numb er større 0
        if (numb>0) {
            if (numb % 5 == 0) {
                System.out.println("HighFive!");
            }
            if (numb % 2 == 0) {
                System.out.println("HighTwo!");
            }

            boolean kanDelesMed2, kanDelesMed5;
            kanDelesMed5 = (numb % 5 == 0);
            kanDelesMed2 = (numb % 2 == 0);

            if ((!kanDelesMed2) && (!kanDelesMed5)) {
                System.out.println("HighNothing!");
            }
        } else {
            System.out.println("Som Sebastian har påpeget, skal du dalme ikke skrive tal mindre end 1!");
        }

        // Dette eksempel viser NEGATION!!!!!
        // Udråbstegne betyder "IKKE"
        boolean b = !true;
        System.out.println(b);

    }
}
