package collections;

import java.util.TreeSet;

public class Practice03_SubSet {
    public static void main(String[] args) {
        /*
        create a collection to store below numbers

        3, 2, 7, 10, 15, 20, 7, 5

        Find all the numbers more 7 -> [10, 15, 20]
        Find all the elements less than or equal to 5 -> [2, 3, 5]
        Find all the elements between 5 and 15 both inclusive -> [5, 7, 10, 15]
         */

        TreeSet<Integer> nums = new TreeSet<>();
        nums.add(3);
        nums.add(2);
        nums.add(7);
        nums.add(10);
        nums.add(15);
        nums.add(20);
        nums.add(7);
        nums.add(5);
        System.out.println(nums.tailSet(7, false)); // [10, 15, 20]
        System.out.println(nums.headSet(5,true)); // [2, 3, 5]
        System.out.println(nums.subSet(5,true,15,true)); // [5, 7, 10, 15]
        System.out.println(nums.subSet(5,15)); // [5, 7, 10]
    }
}
