package homework;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Homework08 {
    public static void main(String[] args) {

        System.out.println("==================Task-1==================");
        String str1 = "";
        System.out.println(countConsonants(str1));

        System.out.println("==================Task-2==================");
        String str2 = "Hello, nice to meet you!!";
        System.out.println(Arrays.toString(wordArray(str2)));

        System.out.println("==================Task-3==================");
        String str3 = "Java  is    fun";
        System.out.println(removeExtraSpaces(str3));

        System.out.println("==================Task-4==================");
        String str4 = "Hello guys";
        System.out.println(count3OrLess(str4));

        System.out.println("==================Task-5==================");
        String dateOfBirth = "12/16/1957";
        System.out.println(isDateFormatValid(dateOfBirth));

        System.out.println("==================Task-6==================");
        String email = "abc@@gmail.com";
        System.out.println(isEmailFormatValid(email));

    }

    //////////////////////////Task-1//////////////////////////
    public static int countConsonants(String str){
        str = str.toLowerCase();
        int counter = 0;
        for(int i = 0; i <= str.length()-1; i++){
            if(str.charAt(i) != 'a' && str.charAt(i) != 'o' &&
                    str.charAt(i) != 'e' && str.charAt(i) != 'i' &&
                    str.charAt(i) != 'u') counter++;
        }
        return counter;
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

    public static int count3OrLess(String str){
        int counter = 0;
        String[] arr = str.split(" ");
        for(String element : arr){
            if(element.length() <= 3) counter++;
        }
        return counter;
    }

    //////////////////////////Task-5//////////////////////////

    public static boolean isDateFormatValid(String dateOfBirth){
        if(Pattern.matches("[\\d]{2}/[\\d]{2}/[\\d]{4}",dateOfBirth))
            return true;
         return false;
    }

    //////////////////////////Task-6//////////////////////////  <2+chars>@<2+chars>.<2+chars>

    public static boolean isEmailFormatValid(String email){
        if(Pattern.matches("[A-Za-z]{2,}@[A-Za-z]{2,}\\.[A-Za-z]{2,}",email))
            return true;
        return false;
    }

}
