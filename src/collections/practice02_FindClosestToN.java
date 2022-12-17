package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class practice02_FindClosestToN {
    public static void main(String[] args) {

        System.out.println(findClosest(Arrays.asList(3,5,6,7),7)); // 6
        System.out.println(findClosest(Arrays.asList(3,5,6,8),7)); // 6
        System.out.println(findClosest(Arrays.asList(3),5)); // 3
        System.out.println(findClosest(Arrays.asList(3,8),3)); // 8
        System.out.println(findClosest(Arrays.asList(8,8),3)); // 8
       // System.out.println(findClosest(Arrays.asList(3),3)); exception
        //System.out.println(findClosest(Arrays.asList(),3)); exception


    }

    /*
    Assume you are given collection of numbers and a number as n

    Find the closest number to n on tje given collection
    [8 10 12], 10 -> 8
    [], 5 -> throw exception
    [3], 3 -> throw exception
    [4, 4], 4 -> throw exception
     */

    public static int findClosest(List<Integer> nums, int n){
        TreeSet<Integer> set = new TreeSet<>(nums);
        if(set.isEmpty() || (set.size() == 1 && set.first() == n))
            throw new RuntimeException("There is not number close to " + n);
        else if(set.size() == 1) return set.first();
        else{
            try{
                int lowerNumber = set.lower(n);
            }catch(NullPointerException e){
                return set.higher(n);
            }
            try{
                int higherNumber = set.higher(n);
            }catch(NullPointerException e){
                return set.lower(n);
            }
            int lower = set.lower(n), higher = set.higher(n);

            return n - lower <= higher - n ? lower : higher;
        }

    }
}
