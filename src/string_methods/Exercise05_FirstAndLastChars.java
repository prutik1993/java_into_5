package string_methods;

import java.util.Scanner;

public class Exercise05_FirstAndLastChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // String name = ScannerHelper.getAName();
        System.out.println("Please enter your name:");
        String name = input.nextLine();
        System.out.println("First character in the name is  = " + name.charAt(0)); // always find 1 letter
        System.out.println("Last character in the name is = " + name.charAt(name.length() - 1)); // always find last letter


    }
}
