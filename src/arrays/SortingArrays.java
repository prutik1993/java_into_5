package arrays;

import java.util.Arrays;

public class SortingArrays {
    public static void main(String[] args) {
        int[] numbers ={5, -1, 3, 10};
        String[] object = {"remote", "computer", "Cup", "Phone"};

        System.out.println("\n------------Before sort--------------\n");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(object));

        System.out.println("\n------------After sort--------------\n");
        Arrays.sort(numbers);
        Arrays.sort(object);
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(object));

    }
}
