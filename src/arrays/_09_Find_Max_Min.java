package arrays;

import java.util.Arrays;

public class _09_Find_Max_Min {
    public static void main(String[] args) {

    }


    public static void printMaxAndMin(int[] numbers){
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int n : numbers){
            if(max < n){
                max = n;
            }
            if(min > n){
                min = n;
            }
        }
        if(numbers.length > 0){
        System.out.println("Max is = " + max);
        System.out.println("Min is = " + min);
        }
        else System.out.println("Array is empty");
    }


    public static void printMaxAndMinSort(int[] numbers){
        Arrays.sort(numbers);
        if(numbers.length > 0){
        System.out.println("The max number is " + numbers[numbers.length-1]);
        System.out.println("The min number is " + numbers[0]);
        }
        else System.out.println("Array is empty");
    }
}

