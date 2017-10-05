package MadsTheCaptain.HjemmeOpgaveTilUge41;

import java.util.Scanner;

public class OpgaverTilKap3 {
    public static void main(String[] args) {
        //Opgave 3.4 Random Month
        //Laver Math.random 0 til 11(Arrays Starter på 0)
        int ranMon = (int) (Math.random()*12);
        //Laver en array med alle mdr.
        String[] monName ={"January","February", "March" , "April" , "May" , "June" , "July", "August", "September",
                "October" ,"November", "December"};
        //printer den random mdr.
        System.out.println("Your random month is: " + monName[ranMon]);

        System.out.println(" ");
        //Opgave 3.6 Health application: BMI
        //Kalder Input fra bruger
        Scanner input = new Scanner(System.in);
        //Får værdier fra bruger
        System.out.println("Enter weight in Pounds:");
        double weight = input.nextDouble();
        System.out.println("Enter height in Feet:");
        double heightF = input.nextDouble();
        System.out.println("Enter height in Inches:");
        double heightI = input.nextDouble();

        //Regner feet omtil inches og lægger dem til de andre inches.
        double totalInch = (heightF*12)+heightI ;

        //Udregner bmi, ved hjælp af de andre værdier
        double bmiCal= (weight*703)/(totalInch*totalInch);

        //printer det
        System.out.println("You BMI is: "+ bmiCal);


        System.out.println(" ");
        //Opgave 3.17 rock paper scissor
        System.out.println("Lets play a game of Rock, Paper and Scissor!");
        System.out.println("Enter the number, which is used for the object.");
        System.out.println("Scissor (0), Rock (1), Paper (2): ");
        String[] rps= {"scissor", "rock", "paper" };
        int brInput = input.nextInt();
        int ranNumb = (int) (Math.random()*3);

        System.out.println("The computer chose: "+ rps[ranNumb]+ ". Bruger chose: "+rps[brInput]+".");
        if (brInput == ranNumb){
            System.out.println("Its a draw.");
        }
        //hvis bruger er scissor
        if (brInput==0){
            if (ranNumb==1){
                System.out.println("Computer wins.");
            }else if(ranNumb==2) {
                System.out.println("Bruger wins.");
            }
        }
        //hvis bruger er Rock
        if (brInput==1){
            if (ranNumb==2){
                System.out.println("Computer wins.");
            }else if(ranNumb==0) {
                System.out.println("Bruger wins.");
            }
        }
        //Hvis bruger er Paper
        if (brInput==2){
            if (ranNumb==0){
                System.out.println("Computer wins.");
            }else if(ranNumb==1) {
                System.out.println("Bruger wins.");
            }
        }






    }
}
