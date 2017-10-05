package liselotte;

import java.util.Scanner;

public class SimpleIfDemo {
    public static void main(String[] args) {

        int number1 = (int) (System.currentTimeMillis() & 10);
        int number2 = (int) (System.currentTimeMillis() / 8 & 10);

        if (number1 % 5 == 0) {
            System.out.println("HighFive!"); }
            else {
            System.out.println("forkert");   }


        if (number2 % 2 == 0) {
            System.out.println("HighEven!"); }
            else
            System.out.println("forkert");   }


        /*if ((number1 % 5 != 0) && (number2 % 2 != 0)); {

            System.out.println("HiNothing"); }

        }


        int tal = 10;

        if (tal % 5 == 0) {
            System.out.println("HighFive!"); }
            else {
            System.out.println("forkert");   }

        if (tal % 2 == 0) {
            System.out.println("HighEven!"); }
            else {
            System.out.println("forkert");   }*/




    }


