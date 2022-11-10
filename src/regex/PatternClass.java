package regex;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-z0-9]{5,10}");

        System.out.println(pattern); // returns pattern
        System.out.println(pattern.pattern()); // returns pattern as a String
        System.out.println(pattern.toString()); // returns pattern as a String

        System.out.println(Pattern.matches(pattern.pattern(),"Apple".toLowerCase()));

        String str = "I go to school at TechGlobal and i love it";
        String[] arr = str.split(" [a-z0-9]{5,10}");
        System.out.println(Arrays.toString(arr));

        System.out.println("\n=========EX1=========\n");

        Scanner input =  new Scanner(System.in);
        System.out.println("Please enter a user name");
        String username = input.nextLine();
     Pattern pattern1 = Pattern.compile( "[a-zA-Z0-9]{5,10}");
     if(pattern1.matches(pattern1.pattern(), username)) System.out.println("Valid Username");
     else System.out.println("Error! Username must be 5 to 10 characters long and can \n" +
             "only contain letters and numbers");

         String str1 = ScannerHelper.getAString();
         String regex = "[a-zA-z0-9_-]{9,15}";
        System.out.println(Pattern.matches(regex,str1));

    }

}
