package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class _01_Lists {
    public static void main(String[] args) {

        /*
        -They preserve insertion order
        -They allow duplicates
        -They allow null elements

        -Performance
        -Memory
        _Initial capacity
        -Load
        -The way they store the data
        */

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.offer("Orange"); // adding new element
        fruits.offerFirst("Pineapple"); // adding new element at the beginning

        System.out.println(fruits.element()); // retrieves first element but doesn't remove it

        System.out.println(fruits.getFirst()); // retrieves first element but doesn't remove it, just deque interface

        System.out.println(fruits); //[apple, apple, orange, , , null, null]

        fruits.clear();

        System.out.println(fruits.poll()); // give you null
        System.out.println(fruits.remove()); // exception
    }
}
