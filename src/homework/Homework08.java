package homework;

import utilities.ScannerHelper;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Homework08 {
    public static void main(String[] args) {

        System.out.println("==================Task-1==================");

        String lime1 = "hello";
        String lime2 = "Java";
        String lime3 = "";
        System.out.println(countConsonants(lime1));
        System.out.println(countConsonants(lime2));
        System.out.println(countConsonants(lime3));


        System.out.println("==================Task-2==================");

        String lemon1 = "hello";
        String lemon2 = "java is  fun";
        String lemon3 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(lemon1)));
        System.out.println(Arrays.toString(wordArray(lemon2)));
        System.out.println(Arrays.toString(wordArray(lemon3)));


        System.out.println("==================Task-3==================");

        String orange1 = "hello";
        String orange2 = " Java  is    fun ";
        String orange3 = "Hello,  nice  to  meet   you!!";
        System.out.println(removeExtraSpaces(orange1));
        System.out.println(removeExtraSpaces(orange2));
        System.out.println(removeExtraSpaces(orange3));


        System.out.println("==================Task-4==================");

        String sentence = "";
        System.out.println(count3OrLess(sentence));
        

        System.out.println("==================Task-5==================");

        String dateOfBirth1 = "01/21/1999";
        String dateOfBirth2 = "1/20/1991";
        String dateOfBirth3 = "10/2/1991";
        String dateOfBirth4 = "12-20 2000";
        String dateOfBirth5 = "12/16/19500";
        System.out.println(isDateFormatValid(dateOfBirth1));
        System.out.println(isDateFormatValid(dateOfBirth2));
        System.out.println(isDateFormatValid(dateOfBirth3));
        System.out.println(isDateFormatValid(dateOfBirth4));
        System.out.println(isDateFormatValid(dateOfBirth5));


        System.out.println("==================Task-6==================");

        String email1 = "abc@gmail.com";
        String email2 = "abc@student.techglobal.com";
        String email3 = "a@gmail.com";
        String email4 = "abcd@@gmail.com";
        String email5 = "abc@gmail";
        System.out.println(isEmailFormatValid(email1));
        System.out.println(isEmailFormatValid(email2));
        System.out.println(isEmailFormatValid(email3));
        System.out.println(isEmailFormatValid(email4));
        System.out.println(isEmailFormatValid(email5));

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

    //////////////////////////Task-6//////////////////////////
    public static boolean isEmailFormatValid(String email){
        return Pattern.matches("[\\w_.#&-]{2,}@[\\w_.#&-]{2,}\\.[\\w]{2,}",email);
    }
}
