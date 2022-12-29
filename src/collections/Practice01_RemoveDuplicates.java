package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;

public class Practice01_RemoveDuplicates {
    public static void main(String[] args) {

        Integer[] nums = {3,5,7,5,3,7,9,8};
        ArrayList<Integer> duplicate =  new ArrayList<>();
       // LinkedHashSet<Integer> uniques = new LinkedHashSet<>(Arrays.asList(nums));
       // System.out.println(uniques);

        for (Integer n : nums) {
            if(duplicate.contains(n)){
                System.out.println(n);
                break;
            }
            else duplicate.add(n);
        }


//        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{-5, 10, -5, 10, 1, 2, 5})));
//        System.out.println(Arrays.toString(removeDuplicates(new Integer[]{})));
    }


    // Create a method that takes  an array
    // -5, 10, -5, 10, 1, 2, 5
    // remove all the duplicates and return new array

    public static Integer[] removeDuplicates(Integer[] arr){
        return new LinkedHashSet<>(Arrays.asList(arr)).toArray(new Integer[0]);
        // integer array -> integer list -> linkedhashset
    }

//    public static Integer[] removeDuplicates(Integer[] arr){
//        ArrayList<Integer> uniques = new ArrayList<>();
//        for (Integer i : arr) {
//            if(!uniques.contains(i)) uniques.add(i);
//        }
//
//        return uniques.toArray(new Integer[0]);
//    }
}
