package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Homework14 {
    //////////////////////Task-1//////////////////////
    public static void fizzBuzz1(int number){
        for (int i = 1; i <= number; i++) {
            if(i % 15 == 0) System.out.println("FizzBuzz");
            else if(i % 3 == 0) System.out.println("Fizz");
            else if(i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }
    }
    //////////////////////Task-2//////////////////////
    public static String fizzBuzz2(int number){
        String str = "";
        if(number % 15 == 0) return "FizzBuzz";
        else if(number % 3 == 0) return "Fizz";
        else if(number % 5 == 0) return "Buzz";
        else str = String.valueOf(number);
        return str;
    }
    //////////////////////Task-3//////////////////////
    public static int findSumNumbers(String str){ // a1b4c  6#
       int sum = 0;
       str = str.replaceAll("[^0-9]"," ");// 1 4 6
       String[] array = str.split(" ");//[1,4,6]
        for (String a : array) {
            if (!a.isEmpty()) {
                sum += Integer.parseInt(a);// 11
            }
        }
        return sum;
    }
    ////////////////////Task-4//////////////////////
    public static int findBiggestNumber(String str){
        int biggest = 0;
        str = str.replaceAll("[^0-9]"," ");
        String[] array = str.split(" ");
        for (String a : array) {
            if(!a.isEmpty() && Integer.parseInt(a) > biggest)
                biggest = Integer.parseInt(a);
        }
        return biggest;
    }
    //////////////////////Task-5//////////////////////
    public static String countSequenceOfCharacters(String str){
        String answer = "";
        int count = 1;         //    abbccaa
        for (int i = 0; i < str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i + 1)){
                count++;
            }else{
                answer += String.valueOf(count) + str.charAt(i); // 1a 2b 2c 2a
                count = 1;
            }
            if(i == str.length()-2) answer += String.valueOf(count) + str.charAt(i+1);
        }
        return answer;
    }

    public static void main(String[] args) {

        System.out.println("_______________Task-1_______________");

        fizzBuzz1(3);
        System.out.println("-----------------");
        fizzBuzz1(5);
        System.out.println("-----------------");
        fizzBuzz1(18);

        System.out.println("_______________Task-2_______________");

        System.out.println(fizzBuzz2(0));
        System.out.println(fizzBuzz2(1));
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));

        System.out.println("_______________Task-3_______________");

        System.out.println(findSumNumbers("abc$"));
        System.out.println(findSumNumbers("a1b4c  6#"));
        System.out.println(findSumNumbers("ab110c045"));
        System.out.println(findSumNumbers("525"));

        System.out.println("_______________Task-4_______________");

        System.out.println(findBiggestNumber("abc$"));
        System.out.println(findBiggestNumber("a1b4c  6#"));
        System.out.println(findBiggestNumber("ab110c045"));
        System.out.println(findBiggestNumber("525"));

        System.out.println("_______________Task-5_______________");

        System.out.println(countSequenceOfCharacters(""));
        System.out.println(countSequenceOfCharacters("abc"));
        System.out.println(countSequenceOfCharacters("abbccaa")); //1a2b2c2a
        System.out.println(countSequenceOfCharacters("aaAAa"));   // 2a2A1a
    }
}

