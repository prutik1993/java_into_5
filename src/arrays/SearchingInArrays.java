package arrays;

import sun.util.resources.cldr.et.TimeZoneNames_et;

import java.util.Arrays;

public class SearchingInArrays {
    public static void main(String[] args) {

        //Search for 7 and return true if it exists in this array, return false otherwise -> false

        int[] numbers = {3, 5, 8, 10};
        boolean has7 = false;
                for(int number : numbers){
                    if(number == 7) {
                        has7 = true;
                        break;
                    }
                }
        System.out.println(has7);

        //Search for 5 and return true if it exists in this array, return false otherwise -> true
                boolean has5 = false;
        for (int number : numbers) {
            if(number == 5) {
                has5 = true;
                break;
            }
        }
        System.out.println(has5);

        System.out.println("\n-------------Binary search in arrays--------------\n");
        // NOTE binary search can be used if the array is sorted only other ways you will get a wrong result
        // binary search returns the index of the element if  found
        // 3, 5, 8, 10
        // if the index returned is zero or positive, it means the element exist
        // if index returned is negative, it means the element doesn't exist
        // if two element exist then method  returns the las index

        Arrays.sort(numbers);
        System.out.println(Arrays.binarySearch(numbers, 5)); // 1
        System.out.println(Arrays.binarySearch(numbers, 10)); // 3
        System.out.println(Arrays.binarySearch(numbers, 7)); // -something


    }
}
