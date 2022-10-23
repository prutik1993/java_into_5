package string_methods;

import java.util.Arrays;

public class _16_Split_Method {
    public static void main(String[] args) {
        /*
        -return
        -return a String Array
        -non-static
        -it takes regex as argument
         */

        String s = "Today is Sunday and the weather is nice";
        String [] arr1 = s.split(" ");
        System.out.println(Arrays.toString(arr1)); // [Today, is, Sunday, and, the, weather, is, nice]
        System.out.println(Arrays.toString(s.split("is"))); // [Today ,  Sunday and the weather ,  nice]
    }
}
