package collections;

import java.util.*;

public class Practice05_Map {
    public static void main(String[] args) {

        HashMap<String, String> favorites = new HashMap<>();
        favorites.put("Day", "Friday");
        favorites.put("Color", "Black");
        favorites.put("City", "Chicago");
        favorites.put("Car", "Lexus");
        favorites.put("Pet", "Turtle");

        // Keys: Day, Color, City, Car, Pet
        // Values: Friday, Black, Chicago, Lexus, Turtle
        /*
        Get keys and print them
        [Car, Color, City, Day, Pet]
         */

        System.out.println("-------Get keys and print them-------");
        Set<String> keys = favorites.keySet();
        TreeSet<String> keys1 = new TreeSet<>(keys);
        System.out.println(keys1);
        for (String k : keys1) {
            System.out.println(k);
        }

        System.out.println("-------Get values and print them-------");
        Collection<String> values = favorites.values();
        ArrayList<String> values1 = new ArrayList<>(values);
        System.out.println(values1);
        for (String v : values1) {
            System.out.println(v);
        }

        System.out.println("\n____________Getting all the entries and print them____________\n");

        Set<Map.Entry<String,String>> entries = favorites.entrySet();
        int i = 1;
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(i++ + ". key = " + entry.getKey() + " and value for it = " + entry.getValue());
        }




    }
}
