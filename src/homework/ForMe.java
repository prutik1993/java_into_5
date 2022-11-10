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

        String name = "Anastasiya";
        String reverse = "";
        for(int i = name.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println(reverse);

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


        String word1 = "The best is Java";
        int counter = 1;

        for(int i = 0; i <= word1.length()-1; i ++){
            if(Character.isWhitespace(word1.charAt(i))) counter++;
        }
        System.out.println(counter);







    }
}
