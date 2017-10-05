package com.ushulabubko;                                //here i set that this file belongs in the package com.ushulabubko

import java.util.Scanner;                               //here i import the scanner class from the built in libary for use later

public class HighFive {                                 //here i define the name of my class
    public static void main(String[] args) {            //here i set my main witch is where the program starts


        Scanner highFive = new Scanner(System.in);      //here i pull the use of a function in the class Scanner
        int deFive = highFive.nextInt();//here i finish the use of the scanner

        if (deFive % 5 == 0){                           //here i am writing the first if statements requirement for the variable deFive

            System.out.println("HiFive");               //here i write the if the statment is ment it will print out HiFive
        }

        if (deFive % 2 == 0){                           //here i am writing the second if statement requirement

            System.out.println("HiEven");               //here i write the print line if requirements for the if statement are ment
        }


        if ((deFive % 5 != 0) && (deFive % 2 != 0)){    //here i have the final if statement and here i define the requirements for it

            System.out.println("No luck my friend");    //here is the printline for this satement to print out if the condition is met
        }
    }
}
