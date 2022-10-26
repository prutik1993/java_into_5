package arrays;

import java.util.Arrays;

public class _06_doubleArray_Recap {
    public static void main(String[] args) {

        double[] doubles = {1.5, 2.3, -1.3, -3.7};

        System.out.println(Arrays.toString(doubles));
        System.out.println("The length of the array is " + doubles.length);
        Arrays.sort(doubles);
        System.out.println("Array after sorting " + Arrays.toString(doubles));
        char[] chars = {'a', 'b', 'c', 'd'};



        System.out.println("\n------------fori each-------------\n"); // when you don't need indexes or an increment to use
        for(double element : doubles){
            System.out.println(element);
        }
        System.out.println("\n------------fori loop-------------\n"); // when you  need indexes or an increment to use
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i]);
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.println(doubles[i] + " - " + chars[i]);
        }


    }
}
