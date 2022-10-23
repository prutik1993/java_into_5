package methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class ScannerPractices {
    public static void main(String[] args) {

        /*
         Write a program that asks user to enter their name and then age
         Print the info in below format

          {name}'s age is {age}.
         */

       /* Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String name = input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println(name + "'s age is " + age + ".");
*/
        String name = ScannerHelper.getAName();
        int age = ScannerHelper.getAnAge();
        String address = ScannerHelper.getAnAddress();
        System.out.println(name + "'s age is " + "\n" + "Address is " + address);

    }
}
