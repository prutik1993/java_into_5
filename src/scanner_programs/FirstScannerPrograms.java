package scanner_programs;

import java.util.Scanner;

public class FirstScannerPrograms {
    public static void main(String[] args) {
        //1. Create a scanner object
        // dataType varName = value;\

        String fName, lName;

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Please enter your name:");
        fName = inputReader.next();
        System.out.println("Please enter your last name:");
        lName = inputReader.next();

        System.out.println("Your full name = " + fName + " " + lName);






    }
}
