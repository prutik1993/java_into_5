package arrays;

import java.util.Arrays;

public class Exercise02_CountWords {
    public static void main(String[] args) {

        System.out.println("\n---------------Solution with for-each-------------------\n");
        String sentence = "I love java";
        int counter = 0;
        char[] newSentence = sentence.toCharArray();
        for (char element : newSentence) {
            if (element == ' ') counter++;
        }
        System.out.println(counter + 1);


        System.out.println("\n---------------Solution with fori-------------------\n");
        String sentence1 = "I love arrays";

        int countS = 0;

        for (int i = 0; i < sentence1.length(); i++) {
            if(sentence1.charAt(i) == ' ') countS++;
        }
        System.out.println(countS + 1);

        System.out.println("\n---------------Solution with split() method-------------------\n");
         String[] arr = sentence1.split(" "); //[I, love, arrays]
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);

    }
}