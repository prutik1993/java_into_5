package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindFirstNegativePositive {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(0, -4, -7, 0, 5, 10, 45));
        firstPositiveNegative(numbers);
        firstNegativePositive2(numbers);

    }

    /*
    create a public static method which will take an arraylist and it will find the
    first positive and first negative number and print them.

    Example:
        ArrayList -> [0, -4, -7, 0, 5, 10, 45]

    Output:
        First positive number is: 5
        First negative number is: -4
     */

    public static void firstPositiveNegative(ArrayList<Integer> numbers){

         int positive = 0;
         int negative = 0;
         boolean isPositive = false;
         boolean isNegative = false;

        for (Integer n : numbers ) {
            if(!isNegative && n < 0){
                negative = n;
            isNegative = true;
            }
            if(!isPositive && n > 0){
               positive = n;
            isPositive = true;
            }
        }
        System.out.println("First positive is: " + positive);
        System.out.println("First negative is: " + negative);
    }

    public static void firstNegativePositive2(ArrayList<Integer> numbers){

        int firstNegative = 0;
        int firstPositive = 0;

        for (Integer number : numbers) {
            if (number < 0 && firstNegative == 0)
                firstNegative = number;
            if(number > 0 && firstPositive == 0)
                firstPositive = number;
        }
        System.out.println("First positive number is: " + firstPositive);
        System.out.println("First negative number is: " + firstNegative);
    }
}
