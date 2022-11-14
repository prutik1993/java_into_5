package homework;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework08 {
    public static void main(String[] args) {

        System.out.println("==================Task-1==================");
        String str1 = " Javattt ";
        System.out.println(countConsonants(str1));

        System.out.println("==================Task-2==================");
        String str2 = "Hello, nice  to meet  you!!";
        System.out.println(Arrays.toString(wordArray(str2)));

        System.out.println("==================Task-3==================");
        String str3 = " Java  is    fun ";
        System.out.println(removeExtraSpaces(str3));

        System.out.println("==================Task-4==================");

       String sentence = "";
        System.out.println(count3OrLess(sentence));
        

        System.out.println("==================Task-5==================");
        String dateOfBirth = "2/16/1957";
        System.out.println(isDateFormatValid(dateOfBirth));

        System.out.println("==================Task-6==================");
        String email = "abc@gmail!com";
        System.out.println(isEmailFormatValid(email));

    }

    //////////////////////////Task-1//////////////////////////
    public static int countConsonants(String str){
        return str.toLowerCase().replaceAll("[aeiou]","").trim().length();
    }

    //////////////////////////Task-2//////////////////////////

    public static String[]  wordArray(String str){
        str = str.replaceAll("\\s+", " ").trim();
        String[] arr = str.replaceAll("[^A-Za-z\\s]","").split(" ");
        return arr;
    }

    //////////////////////////Task-3//////////////////////////

    public static String removeExtraSpaces(String str){
        str = str.replaceAll("\\s+", " ").trim();
        return str;
    }

    //////////////////////////Task-4//////////////////////////

    public static int count3OrLess(String sentence){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence");
        sentence = input.nextLine();
        String[] arr = sentence.split("[A-Za-z]{4,}");
        Pattern pattern = Pattern.compile("[A-Za-z]{1,3}");
        Matcher matcher = pattern.matcher(Arrays.toString(arr));
        int wordCounter = 0;

        while(matcher.find()){
            wordCounter++;
        }
        return wordCounter;

    }

    //////////////////////////Task-5//////////////////////////

    public static boolean isDateFormatValid(String dateOfBirth){
        return Pattern.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}",dateOfBirth);
    }

    //////////////////////////Task-6//////////////////////////  <2+chars>@<2+chars>.<2+chars>
    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}",email);
    }

}
