package arraylist_linkedlist_vectors;

import java.util.Arrays;
import java.util.Vector;

public class Exercise04_CountElements {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>(Arrays.asList(10, 15, 20, 25, 30));

//        Vector<Integer> numbers1 = numbers;
//        numbers1.removeIf(x -> x % 2 == 1);
//        System.out.println(numbers1.size());

                  /*
          Count evens -> 3
          Count odds -> 2
          Count numbers that are more than 15 -> 3
          Count numbers that are more than or less than 20 -> 4
           */

        System.out.println("Even numbers " + numbers.stream().filter(x -> x % 2 == 0).count()); // 3
        System.out.println("Odd numbers " + numbers.stream().filter(x -> x % 2 == 1).count()); //2
        System.out.println("More than 15 " + numbers.stream().filter(x -> x > 15).count()); //3
        System.out.println("More than 20 or less than 20 " +
                numbers.stream().filter(x -> x != 20).count()); // 4

    }
}
