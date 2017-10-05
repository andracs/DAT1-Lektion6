package SaneStreet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("The world is a playground.");
        System.out.print("Input number: ");         //Udskriver "Input number:"
        Scanner input   = new Scanner(System.in);   //Laver en Scanner variabel kaldet input
        int number      = input.nextInt();          //Laver en integer variabel der skal indeholde Scanner input

        boolean delesMed2, delesMed5;               //Laver boolean variablerne delesMed2 og delesMed5
        delesMed2 = (number % 2 == 0);              //delesMed2 skal udregne om input går op med 2
        delesMed5 = (number % 5 == 0);              //delesMed5 skal udregne om input går op med 5

        if(number != 0) {                             //Hvis number IKKE er lig med 0, gør følgende:
            if (delesMed5 == true) {                //Hvis (if) input går op med 5, er statement "true", udskriv "HiFive"
                System.out.println("HiFive");
            }
            if (delesMed2 == true) {                //Hvis (if) input går op med 2, er statement "true", udskriv "HiEven"
                System.out.println("HiEven");
            }
            if ((!delesMed2) && (!delesMed5)) {     //Hvis (if) tallet fra Scanneren (input) IKKE går op med 5 eller 2, så er det false, udskriv "HiNothing"
                System.out.println("HiNothing");
            }
        }
        else{                                       //Hvis intet ovenfor er true eller false, udskriv besked:
            System.out.println("input must not be less than 1.");
        }


    }
}
