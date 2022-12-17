package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class Practice04_MinMaxValues {
    public static void main(String[] args) {

        System.out.println(max(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(max(new Integer[]{10}));
        System.out.println(max(new Integer[]{}));


        System.out.println(min(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(min(new Integer[]{10}));
        System.out.println(min(new Integer[]{}));

        System.out.println(secondMax(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(secondMin(new Integer[]{10, 10, 10}));
        System.out.println(secondMin(new Integer[]{10}));
        System.out.println(secondMax(new Integer[]{}));

        System.out.println(secondMin(new Integer[]{10, 100, 123, 507, 25}));
        System.out.println(secondMin(new Integer[]{10, 10, 10}));
        System.out.println(secondMin(new Integer[]{10}));
        System.out.println(secondMin(new Integer[]{}));

        System.out.println("\n_____________________________________\n");

        System.out.println(nthMax(new ArrayList<>(Arrays.asList(10, 100, 123, 507, 25)),3));
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100)),3));
        System.out.println(nthMax(new ArrayList<>(Arrays.asList()),3));
        System.out.println(nthMax(new ArrayList<>(Arrays.asList(23,24)),3));

        System.out.println("\n_____________________________________\n");

        System.out.println(nthMin(new ArrayList<>(Arrays.asList(10, 101, 123, 507, 25)),3));
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(100, 100, 100, 100, 100)),3));
        System.out.println(nthMin(new ArrayList<>(Arrays.asList()),3));
        System.out.println(nthMin(new ArrayList<>(Arrays.asList(23,24)),3));


    }

    // Find the max from given numbers below
    // [10, 100, 123, 507, 25] -> max 507
    // [12] -> 12 print itself
    // [] -> null

    public static Integer max(Integer[] arr){
       return new TreeSet<>(Arrays.asList(arr)).pollLast();
    }

    public static Integer min(Integer[] arr){
        return new TreeSet<>(Arrays.asList(arr)).pollFirst();
    }

    // Find the second max from given numbers below
    // [10, 100, 123, 507, 25] -> max 507
    // [5,5,5,5,5,5] -> null
    // [12] -> 12 print itself
    // [] -> null

    public static Integer secondMax(Integer[] arr){
      TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
     if(set.size() < 2) return null;
     set.pollLast(); // max removed
     return set.last();
    }
    public static Integer secondMin(Integer[] arr){
        TreeSet<Integer> set = new TreeSet<>(Arrays.asList(arr));
        if(set.size() < 2) return null;
        set.pollFirst(); // max removed
        return set.first();
    }

    // Find the nth max from given numbers below
    // [10, 100, 123, 507, 25], 4  -> 25
    // [10, 100, 123, 507, 25], 3  -> 100
    // [10, 100], 3 -> null

    public static Integer nthMax(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < nth) return null;
        // nth - 1 time poolFirst
        for(int i = 1; i <= nth - 1; i++){
            set.pollLast();
        }
        return set.last();
    }

    public static Integer nthMin(List<Integer> numbers, int nth){
        TreeSet<Integer> set = new TreeSet<>(numbers);
        if(set.size() < nth) return null;

        //nth-1 time pollFirst() and then return first()
        for (int i = 1; i <= nth-1; i++) {
            set.pollFirst();
        }
        return set.first();
    }



}
