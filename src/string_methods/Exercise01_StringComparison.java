package string_methods;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise01_StringComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 Strings:");
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        if(s1.equals(s2))System.out.println("These strings are equal");
        else System.out.println("These strings are not equal");
        String result = s1.equals(s2) ? "These strings are equal" :"These strings are not equal";
        System.out.println(result);
        System.out.println(s1.equals(s2) ? "These strings are equal" :"These strings are not equal");
    }
}
