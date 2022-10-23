package loops.do_while_loops;

import java.util.Scanner;

public class Exercise02_GetNumberDividedBy5 {
    public static void main(String[] args) {

        System.out.println("\n-----do while loop------\n");
        Scanner input = new Scanner(System.in);
        int number;
        do{
            System.out.println("Please enter a number");
            number = input.nextInt();
            if(number % 5 != 0) System.out.println("This number is not dividable by 5");
        }
        while (number % 5 != 0);
        System.out.println("This number is dividable by 5");



        System.out.println("\n-----while loop------\n");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number");
        int num1 = scanner.nextInt();
        while(num1 % 5 != 0){
            System.out.println("This number is not dividable by 5");
            System.out.println("Please enter a number");
            num1 = scanner.nextInt();
        }
        System.out.println("This number is dividable by 5");



        System.out.println("\n-----fori loop------\n");

        for (;;) {
            System.out.println("Please enter a number");
            int num3 = scanner.nextInt();
            if(num3 % 5 != 0) System.out.println("This number is not dividable by 5");
            else break;
        }

        System.out.println("This number is dividable by 5");



         }

    }

