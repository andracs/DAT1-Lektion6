package thom9521;

import java.util.Scanner;

public class HiFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Indtast et tal:");

        int number = input.nextInt();

        if(number % 5 == 0) {
            System.out.println("HiFive");
        }

            if(number % 2 == 0){
                System.out.println("HiEven");
        }

        else {
                System.out.println("HiNothing");
            }
    }
}
