package homework;

import java.util.Arrays;

public class Homework12 {
    ///////////////////////Task-1///////////////////////
    public static String noDigit(String str){
        return str.replaceAll("[0-9]","");
    }

    ///////////////////////Task-2///////////////////////
    public static String noVowel(String str){
        return str.replaceAll("[AEIOUaeiou]","");
    }

    ///////////////////////Task-3///////////////////////
    public static int sumOfDigits(String str){
        int sum = 0;
        if(str.length() == 0) return 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
               sum += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        return sum;
    }

    ///////////////////////Task-4///////////////////////
    public static boolean hasUpperCase(String str){
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
                return true;
        }
        return false;
    }

    ///////////////////////Task-5///////////////////////
    public static int middleInt(int a,int b,int c){
        int max = Math.max(Math.max(a,b),c);
        int min = Math.min(Math.min(a,b),c);
        int sum = a + b + c;
        return sum - max - min;
    }

    ///////////////////////Task-6///////////////////////
    public static int[] no13(int[] numbers){
        for (int number : numbers) {
            if(number == 13)
                number = 0;
        }
        return numbers;
    }

    ///////////////////////Task-7///////////////////////
    public static int[] arrFactorial(int[] numbers){
        int[] numbers2 = new int[numbers.length];
         // 1, 2, 3, 4
        int f;
        for (int i = 0; i < numbers.length; i++) {
            f = 1;
            for (int j = 1; j <= numbers[i]; j++) {
                f = f * j;
            }
            numbers2[i] = f;
        }
        return numbers2;
    }

    ///////////////////////Task-8///////////////////////
    public static String[] categorizeCharacters(String str){
        String[] strings = {"","",""};
        for (int i = 0; i < str.length(); i++) {
            if(Character.isLetter(str.charAt(i)))
                strings[0] += str.charAt(i);
            else if(Character.isDigit(str.charAt(i)))
                strings[1] += str.charAt(i);
            else strings[2] += str.charAt(i);
        }
        return strings;
    }


    public static void main(String[] args) {

        System.out.println("\n_____________________Task-1_____________________\n");

        String str1 = "Java";
        System.out.println(noDigit(str1));
        str1 = "123Hello";
        System.out.println(noDigit(str1));
        str1 = "";
        System.out.println(noDigit(str1));
        str1 = "123Hello World149";
        System.out.println(noDigit(str1));
        str1 = "123Tech456Global149";
        System.out.println(noDigit(str1));

        System.out.println("\n_____________________Task-2_____________________\n");

        String str2 = "";
        System.out.println(noVowel(str2));
        str2 = "xyz";
        System.out.println(noVowel(str2));
        str2 = "JAVA";
        System.out.println(noVowel(str2));
        str2 = "125&";
        System.out.println(noVowel(str2));
        str2 = "TechGlobal";
        System.out.println(noVowel(str2));

        System.out.println("\n_____________________Task-3_____________________\n");

        String str3 = "";
        System.out.println(sumOfDigits(str3));
        str3 = "Java";
        System.out.println(sumOfDigits(str3));
        str3 = "John’s age is 29";
        System.out.println(sumOfDigits(str3));
        str3 = "$125.0";
        System.out.println(sumOfDigits(str3));

        System.out.println("\n_____________________Task-4_____________________\n");

        String str4 = "";
        System.out.println(hasUpperCase(str4));
        str4 = "java";
        System.out.println(hasUpperCase(str4));
        str4 = "John’s age is 29";
        System.out.println(hasUpperCase(str4));
        str4 = "$125.0";
        System.out.println(hasUpperCase(str4));

        System.out.println("\n_____________________Task-5_____________________\n");

        int a = 1, b = 1, c = 1;
        System.out.println(middleInt(a,b,c));
        a = 1; b = 2; c = 2;
        System.out.println(middleInt(a,b,c));
        a = 5; b = 5; c = 8;
        System.out.println(middleInt(a,b,c));
        a = 5; b = 3; c = 5;
        System.out.println(middleInt(a,b,c));
        a = -1; b = 25; c = 10;
        System.out.println(middleInt(a,b,c));

        System.out.println("\n_____________________Task-6_____________________\n");

        int[] numbersA = {1, 2, 3 ,4};
        System.out.println(Arrays.toString(no13(numbersA)));
        int[] numbersB = {13, 2, 3};
        System.out.println(Arrays.toString(no13(numbersB)));
        int[] numbersC = {13, 13, 13 , 13, 13};
        System.out.println(Arrays.toString(no13(numbersC)));

        System.out.println("\n_____________________Task-7_____________________\n");

        int[] numbers7 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arrFactorial(numbers7)));

        System.out.println("\n_____________________Task-8_____________________\n");

        String str8 = "abc123$#%";
        System.out.println(Arrays.toString(categorizeCharacters(str8)));




    }
}
