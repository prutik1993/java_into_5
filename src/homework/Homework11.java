package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public class Homework11 {

    //////////////////////////////Task-1//////////////////////////////
    public static String noSpace(String str){
         return str.replaceAll("\\s","");
    }

    //////////////////////////////Task-2//////////////////////////////
    public static String replaceFirstLast(String str){
       if(str.length() < 2) return "";
       return str.charAt(str.length()-1)
                + str.substring(1,str.length()-1) + str.charAt(0);
    }

    //////////////////////////////Task-3//////////////////////////////
    public static boolean hasVowel(String str){
        str = str.toLowerCase();
         for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'
                    || str.charAt(i) == 'o' || str.charAt(i) == 'u') return true;
        }
         return false;
    }

    //////////////////////////////Task-4//////////////////////////////
    public static String checkAge(int year) {
        int currentYear = 2022;
        int answer = currentYear - year;
        if(answer > 100 || year > currentYear)
            return "AGE IS NOT VALID";
        else if(answer < 16)
            return "AGE IS NOT ALLOWED";
        else  return "AGE IS ALLOWED";

    }

    //////////////////////////////Task-5//////////////////////////////
    public static int averageOfEdges(int n1, int n2, int n3){
        int max = Math.max(Math.max(n1,n2),n3);
        int min = Math.min(Math.min(n1,n2),n3);
        return (max + min)/2;
    }

    //////////////////////////////Task-6//////////////////////////////
    public static String[] noA(String[] str){
        String[] answer = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            if(str[i].toLowerCase().startsWith("a")) answer[i] = "xxx";
            else answer[i] = str[i];
        }
        return answer;
    }

    //////////////////////////////Task-7//////////////////////////////
    public static int[] no3or5(int[] numbers){
        int[] numbers1 = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 15 == 0) numbers1[i] = 101;
            else if(numbers[i] % 3 == 0) numbers1[i] = 100;
            else if(numbers[i] % 5 == 0) numbers1[i] = 99;
            else numbers1[i] = numbers[i];
        }
        return numbers1;
    }

    //////////////////////////////Task-8//////////////////////////////
    public static int countPrimes(int[] numbers){
        int count = 0;
        for (int number : numbers){
            if (number == 2 || number == 3) count++;
            else if (number > 3) {
                boolean isPrime = true;
                for (int i = 2; i < number; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                    }
                }
                if(isPrime) count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        System.out.println("\n______________________Task-1______________________\n");

        String str1 = "Tech Global";
        //String str1 = "   Hello World   ";
        //String str1 = "Java";
        //String str1 = "    Hello    ";

        System.out.println(noSpace(str1));

        System.out.println("\n______________________Task-2______________________\n");

        //String str2 = "Hello";
          String str2 = "Tech Global";
        //String str2 = "A";
       // String str2 = "";

        System.out.println(replaceFirstLast(str2));

        System.out.println("\n______________________Task-3______________________\n");

        // String str3 = "Java";
        //String str3 = "1234";
        //String str3 = "";
        String str3 = "ABC";

        System.out.println(hasVowel(str3));

        System.out.println("\n______________________Task-4______________________\n");

         //int year = 2010;
          int year = 2006;
         // int year = 2050;
         //int year = 1920;
         //int year = 1800;

        System.out.println(checkAge(year));

        System.out.println("\n______________________Task-5______________________\n");

        //int n1 = 0, n2 = 0, n3 = 0;
        //int n1 = 0, n2 = 0, n3 = 6;
        //int n1 = -2, n2 = -2, n3 = 10;
        //int n1 = -3, n2 = 15, n3 = -3;
        int n1 = 10, n2 = 13, n3 = 20;

        System.out.println(averageOfEdges(n1,n2,n3));

        System.out.println("\n______________________Task-6______________________\n");

        //String[] arr = {"java", "hello", "123", "xyz"};
        //String[] arr = {"appium", "123", "ABC", "java"};
        String[] arr = {"apple", "appium", "ABC", "Alex", "A"};

       System.out.println(Arrays.toString(noA(arr)));

        System.out.println("\n______________________Task-7______________________\n");

        //int[] numbers7 = {7, 4, 11, 23, 17};
        //int[] numbers7 = {3, 4, 5, 6};
        int[] numbers7 = {10, 11, 12, 13, 14, 15};

        System.out.println(Arrays.toString(no3or5(numbers7)));

        System.out.println("\n______________________Task-8______________________\n");

        //int[] numbers8 = {7, 4, 11, 23, 17};
        int[] numbers8 = {41, 53, 19, 47, 67};

        System.out.println(countPrimes(numbers8));

    }
}
