package homework;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        System.out.println("\n-------------------------Task-1------------------------\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("The difference between numbers is = " + Math.abs(num1 - num2));


        System.out.println("\n-------------------------Task-2------------------------\n");


        System.out.println("Hey user enter 5 numbers:");
        num1 = input.nextInt();
        num2 = input.nextInt();
        int num3 = input.nextInt();
        int num4 = input.nextInt();
        int num5 = input.nextInt();
        System.out.println("Max value = " + Math.max(Math.max(num1, num2),Math.max(Math.max(num3, num4), num5)));
        System.out.println("Min value = " + Math.min(Math.min(num1, num2),Math.min(Math.min(num3, num4), num5)));


        System.out.println("\n-------------------------Task-3------------------------\n");


        int myRandomNumber1 = (int)(Math.random() * (100 - 50 + 1) + 50);
        int myRandomNumber2 = (int)(Math.random() * (100 - 50 + 1) + 50);
        int myRandomNumber3 = (int)(Math.random() * (100 - 50 + 1) + 50);
        int  sumOfRandom = myRandomNumber1 + myRandomNumber2 + myRandomNumber3;

        System.out.println("Number 1 = " + myRandomNumber1);
        System.out.println("Number 2 = " + myRandomNumber2);
        System.out.println("Number 3 = " + myRandomNumber3);
        System.out.println("The sum of numbers is = " + sumOfRandom);


        System.out.println("\n-------------------------Task-4------------------------\n");


        double alexBalance, mikeBalance, transaction;
        alexBalance = 125;
        mikeBalance = 220;
        transaction = 25.5;
        alexBalance -= transaction;
        mikeBalance += transaction;

        System.out.println("Alex's money: $" + alexBalance +
                           "\n Mike's money: " + mikeBalance);



        System.out.println("\n-------------------------Task-5------------------------\n");


        double bikePrice = 390, savePerDay = 15.60;
        System.out.println((int)(bikePrice/savePerDay));


        System.out.println("\n-------------------------Task-6------------------------\n");


        String s1 = "5", s2 = "10";
        int a1 = Integer.parseInt(s1);
        int a2 = Integer.parseInt(s2);
        System.out.println("-Sum of " + a1 + " and " + a2 + " is = " + (a1 + a2) +
                           "\n-Product of " + a1 + " and " + a2 + " is = " + a1 * a2 +
                           "\n-Division of " + a1 + " and " + a2 + " is = " + a1 / a2 +
                           "\n-Subtraction of " + a1 + " and " + a2 + " is = " + (a1 - a2) +
                           "\n-Remainder of " + a1 + " and " + a2 + " is = " + a1 % a2);


        System.out.println("\n-------------------------Task-7------------------------\n");


        s1 = "200"; s2 = "-50";
        int b1 = Integer.parseInt(s1);
        int b2 = Integer.parseInt(s2);
        System.out.println("The greatest value is = " + Math.max(b1, b2) +
                           "\nThe smallest value is = " + Math.min(b1, b2) +
                           "\nThe average is = " + (b1 + b2)/2 +
                           "\nThe absolute difference is = " + Math.abs(b1 - b2));


        System.out.println("\n-------------------------Task-8------------------------\n");


        double c1 = 0.75, c2 = 0.1, c3 = 0.1, c4 = 0.01;
        double sum = c1 + c2 + c3 + c4;
        System.out.println((int)(24 / sum) + " days");
        System.out.println((int)(168 / sum) + " days");
        System.out.println("$" + sum * 150);


        System.out.println("\n-------------------------Task-9------------------------\n");


        c1 = 1250; c2 = 62.5;
        System.out.println((int)(c1 / c2));


        System.out.println("\n-------------------------Task-10------------------------\n");


        c1 = 475.50; c2 = 951; c3 = 14265;
        System.out.println("Option 1 will take " + (int)(c3 / c1) +
                           " months\n\nOption 2 will take " +(int)(c3 / c2) + " months");


        System.out.println("\n-------------------------Task-11------------------------\n");


        System.out.println("Enter 2 numbers please: ");
          num1 = input.nextInt();
          num2 = input.nextInt();
        System.out.println((double) num1 / (double) num2);


        System.out.println("\n-------------------------Task-12------------------------\n");


        int number1 = (int)(Math.random() * 101);
        int number2 = (int)(Math.random() * 101);
        int number3 = (int)(Math.random() * 101);
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);

        if(number1 > 25 && number2 > 25 && number3 > 25){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("End of the program!");


        System.out.println("\n-------------------------Task-13------------------------\n");


        System.out.println("Please enter a number between 1 to 7: ");
        num1 = input.nextInt();
        if(num1 == 1){
            System.out.println("The number entered returns MONDAY");
        }
            else if(num1 == 2){
            System.out.println("The number entered returns TUESDAY");
        }
            else if(num1 == 3){
            System.out.println("The number entered returns WEDNESDAY");
        }
            else if(num1 == 4){
            System.out.println("The number entered returns THURSDAY");
        }
            else if(num1 == 5){
            System.out.println("The number entered returns FRIDAY");

        }
            else if(num1 == 6){
            System.out.println("The number entered returns SATURDAY");
        }
            else{
            System.out.println("The number entered returns SUNDAY");
        }

        System.out.println("End of the program!");


        System.out.println("\n-------------------------Task-14------------------------\n");


        System.out.println("Tell me your exam results?");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        int sumExams = (num1 + num2 + num3)/3;
        if(sumExams >= 70){
            System.out.println("YOU PASSED");
        }
        else{
            System.out.println("YOU FAILED");
        }

        System.out.println("End of the program!");


        System.out.println("\n-------------------------Task-15------------------------\n");


        System.out.println("Enter 3 numbers");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();

        if(num1 == num2 && num2 == num3) {
            System.out.println("TRIPLE MATCH");
        }
         else if(num1 != num2 && num2 != num3 && num1 != num3){
            System.out.println("NO MATCH");
        }
        else{
            System.out.println("DOUBLE MATCH");
        }
        System.out.println("End of the program!");

    }
}
