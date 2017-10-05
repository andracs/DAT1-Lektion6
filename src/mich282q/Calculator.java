package mich282q;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("indtast et tal");
        int numb = input.nextInt();

        if (numb % 5 == 0){
            System.out.println("HighFive");
        }
        if (numb % 2 == 0) {
            System.out.println("HighTwo");
        }
        else;
        System.out.println("Hinothing");
    }
}
