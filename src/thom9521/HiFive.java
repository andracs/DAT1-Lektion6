package thom9521;

import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et tal:");

        int number = input.nextInt();

        //Jeg har lavet en "if" som gør at, hvis mit input tal går op i 5 så bliver der skrevet HiFive
        if(number % 5 == 0) {
            System.out.println("HiFive");
        }

        //Jeg har lavet en "if" som gør at, hvis mit input går op i 2 så bliver der skrevet HiEven
            if(number % 2 == 0){
                System.out.println("HiEven");
        }

        //Hvis ingen af mine "if" er gode så bliver der skrevet HiNothing
        if(number % 2 != 0 && number % 5 != 0) {
                System.out.println("HiNothing");
            }

            if (number == 0){
                System.out.println("Føj");

            }
    }
}
