package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _03_IntegerArrayList {
    public static void main(String[] args) {

       /*
       Create an ArrayList to store below numbers
       10
       15
       20
       10
       20
       30

       Print the ArrayList
       Print the size

       EXPECTED:
       [10, 15, 20, 10, 20, 30]
       6
        */
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println(numbers);
        System.out.println(numbers.size());

        // numbers.remove(10) -> wont work out of boundary. It will want to move an index
       // numbers.remove((Integer)10); // convert into integer
        System.out.println(numbers);

       //        while(numbers.contains(10)){
       //            numbers.remove((Integer)10);
       //        }
       //        System.out.println(numbers);


        System.out.println("\n------------Contains() method-----------------\n");

        System.out.println(numbers.contains(10)); // true
        System.out.println(numbers.contains(12)); // false
        System.out.println(numbers.contains(20)); // true
        System.out.println(numbers.contains(22)); // false

        System.out.println("\n------------indexOf() method-----------------\n");

        System.out.println(numbers.indexOf(15)); // 1
        System.out.println(numbers.indexOf(25)); // -1
        System.out.println(numbers.indexOf(20)); // 2

        System.out.println("\n------------lastIndexOf() method-----------------\n");

        System.out.println(numbers.lastIndexOf(30)); // 5
        System.out.println(numbers.lastIndexOf(35)); // -1
        System.out.println(numbers.lastIndexOf(10)); // 3

        System.out.println("\n------------Retrieving each element with fori loop-----------------\n");

        for (int i = 0; i < numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

        System.out.println("\n------------Retrieving each element with for each loop-----------------\n");
        for (Integer number : numbers) {
            System.out.println(number);
        }


    }
}
