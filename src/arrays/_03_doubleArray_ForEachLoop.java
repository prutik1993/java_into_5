package arrays;

import java.util.Arrays;

public class _03_doubleArray_ForEachLoop {
    public static void main(String[] args) {

        // 1. Create an array to store -> 5.5, 6, 10.3, 25
        double[] doubles = {5.5, 6, 10.3, 25};

        // 2. Print the array
        System.out.println(Arrays.toString(doubles));

        // 3. Print the size of array
        System.out.println(doubles.length);

        System.out.println("\n-------------for-each loop-----------------\n");
        for(double number : doubles){
            System.out.println(number);
        }
    }
}
