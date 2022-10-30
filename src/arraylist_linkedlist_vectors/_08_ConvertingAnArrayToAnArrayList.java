package arraylist_linkedlist_vectors;

import java.util.*;

public class _08_ConvertingAnArrayToAnArrayList {
    public static void main(String[] args) {


        System.out.println("\n------WAY-1 with Arrays.asList() method-----\n");
        String[] arr1 = {"Tokyo", "Berlin", "Moscow", "Denver"};
        ArrayList<String> cities = new ArrayList<>(Arrays.asList(arr1));
        System.out.println(cities);



        System.out.println("\n-------------Way-2 with loops Manual Way-------------\n");
        char[] arr2 = {'A', '#', '5', '+'};
        LinkedList<Character> characters = new LinkedList<>();

        for(char c : arr2){
            characters.add(c);
        }
        System.out.println(characters);


        System.out.println("\n------WAY-3 with Collections.addAll() method-----\n");
        Integer[] arr3 = {1, 2, 2, 7, 10};
        Vector<Integer> numbers = new Vector<>();
        Collections.addAll(numbers, arr3);

        System.out.println(numbers); // [1, 2, 2, 7, 10]


    }
}
