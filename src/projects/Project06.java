package projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project06 {


    //////////////////////////Task-1//////////////////////////
    public static int  countMultipleWords(String[] coconuts) {
        int counter = 0;
        for (String coconut : coconuts) {
            coconut = coconut.trim();
            if(Pattern.matches("[\\w]+ [\\w ]+",coconut)) counter++;

        }
        return counter;
    }


    //////////////////////////Task-2//////////////////////////
    public static ArrayList<Integer> removeNegatives(ArrayList<Integer> numbers){
        Iterator<Integer> negativeIterator = numbers.iterator();
        while(negativeIterator.hasNext()){
            Integer n = negativeIterator.next();
           if(n < 0) negativeIterator.remove();
        }
        return numbers;
    }


    //////////////////////////Task-3//////////////////////////
    public static boolean validatePassword(String password){
        return (Pattern.matches("(?=.*[A-Z])(?=.*[a-z])(?=.*[\\d])(?=.*[@#$%*&!?+_])\\S{8,16}" ,password));
    }


    //////////////////////////Task-4//////////////////////////

    public static boolean validateEmailAddress(String email){
        return Pattern.matches("[\\w]{2,}@[\\w]{2,}\\.[\\w]{2,}",email);
    }



    public static void main(String[] args) {

        System.out.println("\n=======================Task-1=======================\n");

        String[] coconuts = {"foo", "", " ", "foo bar", "java is fun", "ruby"};
        System.out.println(countMultipleWords(coconuts));


        System.out.println("\n=======================Task-2=======================\n");

        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(2, -5, 6, 7, -10, -78, 0, 15));
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(-4, -9, 34, 9, -10, -88, 0, 1, -22));
        System.out.println(removeNegatives(numbers1));
        System.out.println(removeNegatives(numbers2));


        System.out.println("\n=======================Task-3=======================\n");

        String str1 ="Abcd1234";
        String str2 ="Aabcd";
        String str3 ="abcd1234";
        String str4 ="AAbcd123!";
        System.out.println(validatePassword(str1));
        System.out.println(validatePassword(str2));
        System.out.println(validatePassword(str3));
        System.out.println(validatePassword(str4));


        System.out.println("\n=======================Task-4=======================\n");

        String email1 = "a@gmail.com";
        String email2 = "abc@g.com";
        String email3 = "abc@gmail.c";
        String email4 = "abc@@gmail.com";
        String email5 = "abcd@gmail.com";
        System.out.println(validateEmailAddress(email1));
        System.out.println(validateEmailAddress(email2));
        System.out.println(validateEmailAddress(email3));
        System.out.println(validateEmailAddress(email4));
        System.out.println(validateEmailAddress(email5));


    }
}
