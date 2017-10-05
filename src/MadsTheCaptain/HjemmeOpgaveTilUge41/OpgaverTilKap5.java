package MadsTheCaptain.HjemmeOpgaveTilUge41;

import java.util.Scanner;

public class OpgaverTilKap5 {
    public static void main(String[] args) {
        //Opgave 5.1 Average
        //Declarer værdier
        double data ;
        double sum = 0;
        int positiv=0;
        int negativ=0;
        int antalKlik=0;

        //Får værdi fra bruger
        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers, the code will end at 0: ");


        do {
            data = input.nextDouble();
            sum = sum+data;//Ligger input til sum
            if (data==0){break; }//Går ud hvis input er 0
            if (data<0){negativ++; }//ligger en til negativ, hvis tallet er negativt...
            if (data>0){positiv++; }//ligger en til positiv, hvis tallet er positivt...
            antalKlik++;//Ligger en til antalKlik

        } while (data != 0);
        //Printer Resultater
        double avg=(sum / antalKlik) ;
        System.out.println("Number of Negatives: "+ negativ);
        System.out.println("Number of positives: " +positiv);
        System.out.println("Total is: " + sum);
        System.out.println("Average is: "+ avg);


        System.out.println(" ");
        //Opgave 5.4 from  miles to km
        //deklarerer i
        int i = 1;
        System.out.println("Miles:   Kilometer:");
        //Printer et loop..
        for (i=1;i<=10;i++){
            double km = i*1.609;
            System.out.println(i+"        "+km);
        }

        //Opgave 5.10
        //Fik at vide vi ikke skulle lave den, og vil ikke overanstrenge mig XD 

    }


}
