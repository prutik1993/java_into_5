package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ForMe {
    public static void main(String[] args) {

//        int n1, n2, n3, n4, n5;
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter 5 numbers between 1 to 10:");
//        n1 = input.nextInt();
//        n2 = input.nextInt();
//        n3 = input.nextInt();
//        n4 = input.nextInt();
//        n5 = input.nextInt();
//
//
//
//        char a1 = '8';
//        if(a1 >= 65 && a1 <= 90 || a1 >= 97 && a1 <= 122){
//            System.out.println("Character ia a letter");
//        }else if(a1 >= 48 && a1 <= 57) {
//            System.out.println("Character ia a digit");
//        }else{
//            System.out.println("Character not letter or digit");
//        }


        int iter = 7;
        int fNum = 0;
        int sNum = 1;
        int sum = 0;
        String answer = "";
        for (int i = 0; i < iter; i++) {
            answer += fNum + " - ";
            sum = fNum + sNum;
            fNum = sNum;
            sNum = sum;
        }
        System.out.println(answer.substring(0,answer.length()-3));


        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 7, 87, -7, 54, -45));
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer n : nums) {
            if(n > max )
                max = n;
            if(n < min)
                min = n;
        }
        System.out.println(max);
        System.out.println(min);

        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (Integer n : nums) {
            if(n > secondMax && n != max)
                secondMax = n;
            if(n < secondMin && n != min)
                secondMin = n;
        }
        System.out.println(secondMin);
        System.out.println(secondMax);


        String[] fruits = {"Apple", "Orange", "Apricot", "Kiwi", "apple"};

//        for (String fruit : fruits) {
//            if(fruit.toLowerCase().startsWith("a"))
//                System.out.println(fruit);
//            break;
//        }
//
//         boolean isAFound = false;
//        for (String fruit : fruits) {
//            if(fruit.toLowerCase().startsWith("a") && !isAFound)
//                System.out.println(fruit);
//            isAFound = true;
//        }
//

        int count = 0;
        for (String fruit : fruits) {
            if(fruit.length() == 5) count++;
        }
        System.out.println(count);


        String word = "The best is Java";

        word = word.trim();

        word = word.substring(word.lastIndexOf(" ") + 1) +
               word.substring(word.indexOf(" "),word.lastIndexOf(" ") + 1)  +
               word.substring(0,word.indexOf(" "));
        System.out.println(word);



        System.out.println("\n__________find the first duplicated number in an int array numbers__________\n");

        //int[] numbers1 = {-4, 0, -7, 0, 5, 10, 45, 45};
         //int[] numbers1 = {3, 4, 3, 3, 5, 5, 6, 6, 7};
        int[] numbers1 = {-8, 56, 7, 8, 65};

        boolean isDuplicate = false;
        int duplicate = 0;

        for(int i = 0; i < numbers1.length-1; i++){
            for (int j = i + 1; j < numbers1.length; j++) {
                if(numbers1[i] == numbers1[j] && !isDuplicate){
                    duplicate = numbers1[i];
                isDuplicate = true;
                break;
                }
            }

        }
        System.out.println(isDuplicate ? duplicate : "There is no duplicates");


        System.out.println("\n__________find the first duplicated number in an int array String__________\n");

        String[] words2 = {"Z", "abc", "z", "123", "#"};
         //String[] words2 = {"xyz", "java", "abc"};
         //String[] words2 = {"a", "b", "B", "XYZ", "123"};

        String answer2 = "";
        boolean duplicateFound = false;

        for(int i = 0; i < words2.length-1; i++){
            for (int j = i + 1; j < words2.length; j++) {
                if(words2[i].equalsIgnoreCase(words2[j]) && !duplicateFound){
                    answer2 = words2[i];
                    duplicateFound = true;
                    break;
                }
            }
        }
        System.out.println(duplicateFound ? answer2 : "There is no duplicates");


        System.out.println("\n__________find the all duplicates in an int array numbers__________\n");

        //int[] numbers3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
        int[] numbers3 = {1, 2, 5, 0, 7};

        ArrayList<Integer> numbers2 = new ArrayList<>();

        for (int i = 0; i < numbers3.length - 1; i++) {
            for (int j = i + 1; j < numbers3.length; j++) {
                if(numbers3[i] == numbers3[j] && !numbers2.contains(numbers3[i]))
                    numbers2.add(numbers3[i]);
            }
        }
        if(numbers2.isEmpty()) System.out.println("There is no duplicates");
        else numbers2.forEach(System.out::println);


        System.out.println("\n__________find the all duplicates in an int array String__________\n");

        String[] words4 = {"A", "foo", "12" , "Foo", "bar", "a", "a", "java"};
        // String[] words4 = {"python", "foo", "bar", "java", "123" };

        String answer3 = "";

        for (int i = 0; i < words4.length-1; i++) {
            for (int j = i + 1; j < words4.length; j++) {
                if(words4[i].equalsIgnoreCase(words4[j]) && !answer3.contains(words4[i].toLowerCase())){
                    answer3 += words4[i].toLowerCase();
                System.out.println(words4[i]);
                }
            }
        }
        if(answer3.isEmpty()) System.out.println("There is no duplicates");


        System.out.println("\n__________reverse elements in an array__________\n");

        //String[] words5 = {"abc", "foo", "bar"};
        String[] words5 = {"java", "python", "ruby"};

        ArrayList<String> arr = new ArrayList<>();

        for (int i = words5.length-1; i >= 0 ; i--) {
            arr.add(words5[i]);
        }
        System.out.println(arr);

        System.out.println("\n__________reverse each word in a given String__________\n");

        //String str5 = "Java is fun";
        String str5 = "Today is a fun day";

        String[] arr1 = str5.split(" ");
        //System.out.println(Arrays.toString(arr1));
        String str = "";
        for (String s : arr1) {
            str += new StringBuilder(s).reverse() + " ";
        }
        System.out.println(str.substring(0,str.length()-1));


        System.out.println("\n__________count how many words in a String__________\n");

        String str6 = "Today is a fun day";

        int count1 = 1;

//        for (int i = 0; i < str.length()-1; i++) {
//            if(str.charAt(i) == ' ') count1++;
//        }
//        System.out.println(count1);

        for (int i = 0; i < str6.length()-1; i++) {
            if(Character.isWhitespace(str6.charAt(i))) count1++;
        }
        System.out.println(count1);

        System.out.println("\n__________reverse a String__________\n");

        String name1 = "Anastasiya";

        //String name2 = new StringBuilder(name1).reverse().toString();
        //System.out.println(name2);

        String name2 = "";
        for (int i = name1.length()-1; i >= 0 ; i--) {
            name2 += name1.charAt(i);
        }
        System.out.println(name2);























    }
}
