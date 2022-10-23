package homework;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Homework05 {
    public static void main(String[] args) {


       System.out.println("\n-------------------------Task-1-------------------------\n");

        String result = "";
        for (int i = 1; i <= 100 ; i++) {
            if(i % 7 == 0)
            result += i + " - ";
        }
        System.out.print(result.substring(0,result.length()-3));


        System.out.println("\n-------------------------Task-2-------------------------\n");

        String result2 = "";
        for (int i = 1; i <= 50 ; i++) {
            if(i % 6 == 0)
            result2 += i + " - ";
        }
        System.out.println(result2.substring(0,result2.length()-3));


        System.out.println("\n-------------------------Task-3-------------------------\n");

        String result3 = "";
        for(int i = 100; i >= 50 ; i--) {
            if(i % 5 == 0)
            result3 += i + " - ";
        }
        System.out.println(result3.substring(0,result3.length()-3));


        System.out.println("\n-------------------------Task-4-------------------------\n");

        int square = 0;
        for ( int i = 0; i <= 7 ; i++) {
            square = i * i;
            System.out.println("The square of " + i + " is = " + square );
        }


        System.out.println("\n-------------------------Task-5-------------------------\n");

        int sum = 0;
        for (int i = 1; i <= 10 ; i++) {
            sum += i;
        }
        System.out.println(sum);


        System.out.println("\n-------------------------Task-6-------------------------\n");

        int n = ScannerHelper.getANumber();
        int factorial = 1;
        for (int i = 1; i <= n ; i++) {
            factorial = factorial * i;
        }
        System.out.println(factorial);


        System.out.println("\n-------------------------Task-7-------------------------\n");

        String fullName = ScannerHelper.getAFullName();
        int counter = 0;
        String fullName1 = fullName.toLowerCase();
        for (int i = 0; i <= fullName1.length()-1 ; i++) {
            if(fullName1.charAt(i) == 'a' || fullName1.charAt(i) == 'e' ||
                    fullName1.charAt(i) == 'i' || fullName1.charAt(i) == 'o' ||
                    fullName1.charAt(i) == 'u') counter++;
        }
        System.out.println("There are " + counter + " vowel letters in this full name");


        System.out.println("\n-------------------------Task-8-------------------------\n");

        Scanner input = new Scanner(System.in);
       int num;
        int count = 0;
        do{
            if(count == 0)System.out.println("Please enter a number");
            else System.out.println("Please enter a number");
            num = input.nextInt();
            if(num < 100) count += num;
            else{
                System.out.println("This number is already more than 100");
                break;
            }
          if(count >= 100){
              System.out.println("Sum of the entered numbers is at least 100");
              break;
          }
        }
        while(num <= 100);



       System.out.println("\n-------------------------Task-9-------------------------\n");

        int number = 10;
        int a = 0;
        int b = 1;
       String total = "";
        for (int i = 1; i <= number ; i++) {
            total += a + " - ";
            sum = a + b;
            a = b;
            b = sum;
        }
        System.out.println(total.substring(0, total.length()-3));


        System.out.println("\n-------------------------Task-10-------------------------\n");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
            String name = scanner.nextLine();
            while(name.toLowerCase().charAt(0) != 'j'){
                System.out.println("Please enter a name");
                 name = scanner.nextLine();
            }
        System.out.println("End of the program!");
    }
}
