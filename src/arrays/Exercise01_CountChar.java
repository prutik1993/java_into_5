package arrays;

import java.util.Arrays;

public class Exercise01_CountChar {
    public static void main(String[] args) {
        /*
        Assume you are given as below

        String word = "Java";

        Count how many a letters you have in the String

        EXPECTED:
        2
         */
        String word = "Java";
        int counter = 0;
        for (int i = 0; i < word.length(); i++) {
            if(word.toLowerCase().charAt(i) == 'a') counter++;
        }
        System.out.println(counter);

        char[] wordArray = word.toCharArray();
        System.out.println(Arrays.toString(wordArray));
        int count = 0;
        for(char element : wordArray){
            if(element == 'a') count++;
        }
        System.out.println(count);
    }
}
