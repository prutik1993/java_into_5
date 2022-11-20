package homework;

import java.util.Arrays;

public class Homework09 {
    public static void main(String[] args) {

        System.out.println("\n____________________Task-1____________________\n");

        // int[] numbers1 = {-4, 0, -7, 0, 5, 10, 45, 45};
        // int[] numbers1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        int[] numbers1 = {-8, 56, 7, 8, 65};

        int duplicate = 0;
        boolean duplicateFount = false;

        for (int i = 0; i < numbers1.length - 1; i++) {
            for (int j = i + 1; j < numbers1.length; j++) {
                if (numbers1[i] == numbers1[j] && !duplicateFount) {
                    duplicate = numbers1[i];
                    duplicateFount = true;
                    break;
                }
            }
        }
        System.out.println(duplicateFount ? duplicate : "There is no duplicates");


        System.out.println("\n____________________Task-2____________________\n");

        String[] words = {"Z", "abc", "z", "123", "#"};
        // String[] words = {"xyz", "java", "abc"};
        // String[] words = {"a", "b", "B", "XYZ", "123"};

        String duplicate2 = "";
        boolean duplicateFound2 = false;

        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j]) && !duplicateFound2) {
                    duplicate2 = words[i];
                    duplicateFound2 = true;
                    break;
                }
            }
        }

        System.out.println(duplicateFound2 ? duplicate2 : "There is no duplicates");


        System.out.println("\n____________________Task-3____________________\n");

        int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        //  int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};

        int counter = 1;
        int repeated = 0;
        boolean isFound = false;
        String duplicates3 = "";

        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if (duplicates3.contains(numbers3[i] + "")) break;
               if(numbers3[i] == numbers3[j]) duplicates3 += numbers3[i] + ",";

            }

        }

            System.out.println(duplicates3);


        }
    }

