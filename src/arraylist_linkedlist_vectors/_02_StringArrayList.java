package arraylist_linkedlist_vectors;

import java.util.ArrayList;

public class _02_StringArrayList {
    public static void main(String[] args) {

        System.out.println("\n--------------Task-1------------\n");
        /*
         Create an ArrayList and store below cities in it
         Chicago
         Berlin
         Miami

         Print the size of the ArrayList
         Print the ArrayList

         EXPECTED:
         3
         [Chicago, Berlin, Miami]
          */
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Chicago");
        cities.add("Berlin");
        cities.add("Miami");
        System.out.println(cities.size());
        System.out.println(cities);

        System.out.println("\n--------------Task-2------------\n");
        // update Miami with Evanston
        cities.set(2, "Evanston");
        System.out.println(cities);

        System.out.println("\n--------------Task-3------------\n");

        // delete Berlin and update it with Evanston
        // cities.remove(1);
        //System.out.println(cities);

        cities.remove("Berlin");
        System.out.println(cities);
        System.out.println(cities.size());
        System.out.println(cities.remove(0));
        System.out.println(cities.remove("evanston")); // false
        System.out.println(cities.size()); // 1
        System.out.println(cities);


        System.out.println("\n--------------Task-4------------\n");
        /*
        TASK
        Add below cities to ArrayList
        New York
        Rome
        Gent

        Print the ArrayList
        Print the size

        EXPECTED:
        [Evanston, New York, Rome, Gent]
        4
         */
        cities.add("New York");
        cities.add("Rome");
        cities.add("Ghent");

        System.out.println(cities);
        System.out.println(cities.size());

        System.out.println("\n--------------Task-5------------\n");

        // Remove all elements

        cities.clear();

        // cities.removeAll(cities);

        System.out.println(cities);
        System.out.println(cities.size());








    }
}
