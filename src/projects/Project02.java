package projects;

import java.util.Scanner;

public class Project02 {
    public static void main(String[] args) {

        System.out.println("\n-------------------Task-1---------------------\n");
        int number1, number2, number3;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 3 numbers");
        number1 = input.nextInt();
        number2 = input.nextInt();
        number3 = input.nextInt();
        System.out.println("The product of the numbers entered is = " + number1 * number2 * number3);


        System.out.println("\n-------------------Task-2---------------------\n");
        String fName, lName;
        input.nextLine();
        System.out.println("What is your name?");
        fName = input.nextLine();
        System.out.println("What is your last name?");
        lName = input.nextLine();
        System.out.println("What is your year of birth?");
        int age = input.nextInt();
        System.out.println(fName + " " + lName + "'s age is = " + (2022 - age) + ".");


        System.out.println("\n-------------------Task-3---------------------\n");
        input.nextLine();
        System.out.println("What is your full name?");
        String fullName = input.nextLine();
        System.out.println("What is your weight?");
        double weight = input.nextDouble();
        input.nextLine();
        System.out.println(fullName + "'s weight is = " + weight * 2.205 + " lbs.");



        System.out.println("\n-------------------Task-4---------------------\n");

        String fullStudent1, fullStudent2, fullStudent3;
        int ageStudent1, ageStudent2, ageStudent3;

        System.out.println("What is your full name?");
        fullStudent1 = input.nextLine();
        System.out.println("What is your age?");
        ageStudent1 = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name?");
        fullStudent2 = input.nextLine();
        System.out.println("What is your age?");
        ageStudent2 = input.nextInt();
        input.nextLine();
        System.out.println("What is your full name?");
        fullStudent3 = input.nextLine();
        System.out.println("What is your age?");
        ageStudent3 = input.nextInt();
        input.nextLine();
        System.out.println(fullStudent1 + "'s age is " + ageStudent1 + ".\n" +
                fullStudent2 + "'s age is " + ageStudent2 + ".\n" +
                fullStudent3 + "'s age is " + ageStudent3 + ".");

        System.out.println("The average age is " + (ageStudent1 + ageStudent2 + ageStudent3)/3 + ".");
        System.out.println("The eldest age is " + Math.max(Math.max(ageStudent1, ageStudent2), ageStudent3) + ".");
        System.out.println("The youngest age is " + Math.min(Math.min(ageStudent1, ageStudent2), ageStudent3) + ".");













    }
}
