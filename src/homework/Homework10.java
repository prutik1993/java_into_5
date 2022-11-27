package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Homework10 {

    ///////////////////////////Task-1///////////////////////////
    public  static int countWords(String str){
        int counter = 0;
        str = str.replaceAll("\\s+", " ").trim();
        for (int i = 0; i < str.length(); i++) {
            if(Character.isWhitespace(str.charAt(i))) counter++;
        }
        if(counter > 1) counter += 1;
        return counter;
    }

    ///////////////////////////Task-2///////////////////////////
    public static int countA(String str){
        int counter = 0;
       str = str.toLowerCase();
      for (int i = 0; i < str.length(); i++) {
          if(str.charAt(i) == 'a') counter++;
       }
      return counter;
    }

    ///////////////////////////Task-3///////////////////////////
    public static int countPos(ArrayList<Integer> numbers){
        int counter = 0;
        for (Integer number : numbers) {
            if(number > 0) counter++;
        }
        return counter;
    }

    ///////////////////////////Task-4///////////////////////////
    public static ArrayList<Integer> removeDuplicateNumbers(ArrayList<Integer> numbers){
        ArrayList<Integer> noDuplicates = new ArrayList<>();
        for (Integer number : numbers) {
            if(!noDuplicates.contains(number))
                noDuplicates.add(number);
        }
        return noDuplicates;
    }

    ///////////////////////////Task-5///////////////////////////
    public static ArrayList<String> removeDuplicateElements(ArrayList<String> elements){
        ArrayList<String> arr = new ArrayList<>();
        for (String element : elements) {
            if(!arr.contains(element))
                arr.add(element);
        }
        return arr;
    }
    ///////////////////////////Task-6///////////////////////////
    public static String removeExtraSpaces(String str){
        return str.replaceAll("\\s+", " ").trim();
    }

    ///////////////////////////Task-7///////////////////////////
    public static int[] add(int[] n1, int[] n2){
        if(n1.length > n2.length){
            for (int i = 0; i < n2.length; i++) {
                 n1[i] += n2[i];
            }
        }
        else{
            for (int i = 0; i < n1.length; i++) {
               n2[i] += n1[i];
            }
        }
        if(n1.length > n2.length) return n1;
        return n2;
    }

    ///////////////////////////Task-8///////////////////////////

    public static int indClosestTo10(int[] numbers){
        int closestTo10 = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] != 0 && 10 % numbers[i] < closestTo10)
                closestTo10 = numbers[i];
        }
        return closestTo10;
    }


    public static void main(String[] args) {

        System.out.println("\n______________________Task-1______________________\n");

        String str1 = "      Java is fun       ";
        //String str1 = "Selenium is the most common UI automation tool.   ";
        //String str1 = " ";
        System.out.println(countWords(str1));


        System.out.println("\n______________________Task-2______________________\n");

        String str2 = "TechGlobal is a QA bootcamp";
        //String str2 = "QA stands for Quality Assurance";
        //String str2 = "";
        System.out.println(countA(str2));


        System.out.println("\n______________________Task-3______________________\n");

        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(-45, 0, 0, 34, 5, 67));
        //ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(-23, -4, 0, 2, 5, 90, 123));
        //ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(-23, -4, 0, -2, -5, -90));
        System.out.println(countPos(numbers3));


        System.out.println("\n______________________Task-4______________________\n");

        //ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(10, 20, 35, 20, 35, 60, 70, 60));
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(1, 2, 5, 2, 3));
        System.out.println(removeDuplicateNumbers(numbers4));


        System.out.println("\n______________________Task-5______________________\n");

       //ArrayList<String> languages5 = new ArrayList<>(Arrays.asList("java", "C#", "ruby", "JAVA", "ruby", "C#", "C++"));
       ArrayList<String> languages5 = new ArrayList<>(Arrays.asList("abc", "xyz", "123", "ab", "abc", "ABC"));
        System.out.println(removeDuplicateElements(languages5));


        System.out.println("\n______________________Task-6______________________\n");

        String str6 = "   I   am      learning     Java      ";
        //String str6 = "Java  is fun          ";
        //String str6 = "";
        System.out.println(removeExtraSpaces(str6));


        System.out.println("\n______________________Task-7______________________\n");

        //int[] arr1 = {3, 0, 0, 7, 5, 10};
        // int[] arr2 = {6, 3, 2};
        int[] arr1 =  {10, 3, 6, 3, 2};
        int[] arr2 = {6, 8, 3, 0, 0, 7, 5, 10, 34};
        System.out.println(Arrays.toString(add(arr1, arr2)));


        System.out.println("\n______________________Task-8______________________\n");

       // int[] numbers8 = {10, -13, 5, 70, 15, 57};
        //int[] numbers8 = {10, -13, 8, 12, 15, -20};
        int[] numbers8 = {7, 0, 8, 5, 15, -15};
        System.out.println(indClosestTo10(numbers8));
    }
}
