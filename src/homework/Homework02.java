package homework;


import java.util.Scanner;

public class Homework02 {
   public static void main(String[] args){
       System.out.println("\n---------------------Task-1------------------\n");

       int number1, number2;
       Scanner input = new Scanner(System.in);
       System.out.println("Please enter the number 1: ");
       number1 = input.nextInt();
       System.out.println("Please enter the number 2: ");
       number2 = input.nextInt();
       System.out.println("The number 1 entered by user is = " + number1 +
               "\nThe number 2 entered by user is = " + number2 + "\n" +
               "The sum of number 1 and 2 entered by user is = "
               + (number1 + number2));

       System.out.println("\n-------------------Task-2----------------------\n");

       System.out.println("Please enter number 1: ");
       number1 = input.nextInt();
       System.out.println("Please enter number 2: ");
       number2 = input.nextInt();
       System.out.println("The product of given 2 numbers is: " + number1 * number2);


       System.out.println("\n-------------------Task-3----------------------\n");

       double num1, num2;
       System.out.println("Please enter number 1: ");
       num1 = input.nextDouble();
       System.out.println("Please enter number 2: ");
       num2 = input.nextDouble();
       System.out.println("The sum of the given numbers is = " + (num1 + num2) +
                       "\nThe product of the given numbers is = " + num1 * num2 +
                       "\nThe subtraction of the given numbers is = " + (num1 - num2) +
                       "\nThe division of the given numbers is = " + num1 / num2 +
                       "\nThe remainder of the given numbers is = " + num1 % num2);


       System.out.println("\n-------------------Task-4----------------------\n");

       System.out.println("1.\t\t" + (-10 + 7 * 5)  +
                        "\n2.\t\t" + ((72+24) % 24) +
                         "\n3.\t\t" + (10 + -3*9 / 9) +
                         "\n4.\t\t" + (5 + 18 / 3 * 3 - (6 % 3)));



       System.out.println("\n-------------------Task-5----------------------\n");

       System.out.println("Please enter number 1: ");
       number1 = input.nextInt();
       System.out.println("Please enter number 2: ");
       number2 = input.nextInt();
       System.out.println("The average of the given numbers is: " + (number1 + number2) / 2);



       System.out.println("\n-------------------Task-6----------------------\n");

       int number3, number4, number5;
       System.out.println("Please enter number 1: ");
       number1 = input.nextInt();
       System.out.println("Please enter number 2: ");
       number2 = input.nextInt();
       System.out.println("Please enter number 3: ");
       number3 = input.nextInt();
       System.out.println("Please enter number 4: ");
       number4 = input.nextInt();
       System.out.println("Please enter number 5: ");
       number5 = input.nextInt();
       System.out.println("The average of given numbers is: "
                         +(number1 + number2 + number3 + number4 + number5) / 5);


       System.out.println("\n-------------------Task-7----------------------\n");

       System.out.println("Please enter number 1: ");
       number1 = input.nextInt();
       System.out.println("Please enter number 2: ");
       number2 = input.nextInt();
       System.out.println("Please enter number 3: ");
       number3 = input.nextInt();
       System.out.println("The 5 multiplied with 5 is = " + number1 * number1 +
                          "\nThe 6 multiplied with 6 is = " + number2 * number2 +
                          "\nThe 10 multiplied with 10 is = " + number3 * number3);


       System.out.println("\n-------------------Task-8----------------------\n");

       System.out.println("Please enter the side of a square: ");
       number1 = input.nextInt();
       System.out.println("Perimeter of the square = " + 4 * number1 +
                          "\nArea of the square = " + number1 * number1);


       System.out.println("\n-------------------Task-9----------------------\n");

       double salary = 90_000;
       System.out.println("A Software Engineer in Test can earn $" + salary * 3 + " in 3 years.");


       System.out.println("\n-------------------Task-10----------------------\n");

       String favBook, favColor;
       int favNumber;
       input.nextLine();
       System.out.println("Please enter your favorite book: ");
       favBook = input.nextLine();
       System.out.println("Please enter your favorite color: ");
       favColor = input.nextLine();
       System.out.println("Please enter your favorite number: ");
       favNumber = input.nextInt();
       System.out.println("User’s favorite book is: " + favBook +
                          "\nUser’s favorite color is: " + favColor +
                          "\nUser’s favorite number is: " + favNumber);


       System.out.println("\n-------------------Task-11----------------------\n");

       String fName, lName, email, pNumber, address;
       int age;
       input.nextLine();
       System.out.println("Please enter your first name: ");
       fName = input.nextLine();
       System.out.println("Please enter your last name: ");
       lName = input.nextLine();
       System.out.println("Please enter your age: ");
       age = input.nextInt();
       input.nextLine();
       System.out.println("Please enter your email address: ");
       email = input.nextLine();
       System.out.println("Please enter your phone number: ");
       pNumber = input.nextLine();
       System.out.println("Please enter your address: ");
       address = input.nextLine();
       System.out.println("\tUser who joined this program is " + fName + " " + lName +
                          ". John’s age is\n" + age + ". John’s email address is " + email +
                          ", phone number\nis " + pNumber + ", and address is " + address + ".");






















































    }
}
