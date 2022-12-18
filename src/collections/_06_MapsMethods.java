package collections;

import java.util.*;

public class _06_MapsMethods {
    public static void main(String[] args) {

        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("France", "Paris");

        System.out.println(capitals); // {France=Paris}

        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Spain", "Madrid");

        System.out.println(capitals); //{Italy=Rome, France=Paris, Germany=Berlin, Spain=Madrid}

        System.out.println("\n_______Retrieve values  with their keys__________\n");

        System.out.println(capitals.get("Spain")); // Madrid
        System.out.println(capitals.get("Belgium")); // null
        System.out.println(capitals.getOrDefault("Belgium","Does not exist!")); // Does not exist!

        System.out.println("\n_______Check if Map contains given key or value__________\n");

        System.out.println(capitals.containsKey("Germany")); // true
        System.out.println(capitals.containsKey("Portugal")); // false
        System.out.println(capitals.containsKey("Ankara")); // false
        System.out.println(capitals.containsValue("Berlin")); // true

        System.out.println("\n_______Update the value for the specified key__________\n");

        System.out.println(capitals.replace("Ukraine", "Kiev")); //null
        System.out.println(capitals.replace("Germany","berlin","Munich")); // false
        System.out.println(capitals.replace("Germany","Berlin","Munich")); // false
        System.out.println(capitals); // {Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        capitals.put("Turkey", "Ankara");
        System.out.println(capitals); // {Turkey=Ankara, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        capitals.put("Turkey","Istanbul"); // updating existing one
        System.out.println(capitals); //{Turkey=Istanbul, Italy=Rome, France=Paris, Germany=Munich, Spain=Madrid}

        System.out.println("\n_______Remove some entries__________\n");

        capitals.remove("France");
        System.out.println(capitals);
        capitals.remove("US");  // null
        System.out.println(capitals);
       capitals.remove("Germany","Stuttgart"); // false
        System.out.println(capitals);
        System.out.println(capitals.remove("Germany","Munich")); // true
        System.out.println(capitals); // {Turkey=Istanbul, Italy=Rome, Spain=Madrid}

        System.out.println("\n_______Advanced Map methods__________\n");

        // Keys: Turkey, Italy, Spain
        // Values: Istanbul, Rome, Madrid

        Set<String> set = capitals.keySet();
        System.out.println(set); // [Turkey, Italy, Spain]
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet); //[Italy, Spain, Turkey]

        Collection<String> collection = capitals.values();
        System.out.println(collection); // [Istanbul, Rome, Madrid]
        ArrayList<String> list = new ArrayList<>(collection);
        System.out.println(list); //[Istanbul, Rome, Madrid]

        System.out.println("\n_______Iterating key and values__________\n");

        System.out.println("---Keys---");

        for (String s : capitals.keySet()) {
            System.out.println(s);
        }

        System.out.println("---Values---");

        for (String value : capitals.values()) {
            System.out.println(value);
        }

        System.out.println("\n____________Getting all the entries____________\n");

        Set<Map.Entry<String,String>> entries = capitals.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry);
            System.out.println("Key = " + entry.getKey() + " Value = " + entry.getValue());
        }


    }
}
