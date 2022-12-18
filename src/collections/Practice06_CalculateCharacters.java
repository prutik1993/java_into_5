package collections;

import javax.xml.stream.events.Characters;
import java.util.*;

public class Practice06_CalculateCharacters {
    public static void main(String[] args) {
        /*
        you are giving a string as "banana"
        print all duplicated letters

        Expecteda
        a
        n
         */

        String str = "banana";
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        for (Character c : str.toCharArray()) {
            if(!map.containsKey(c))
                map.put(c,1);
            else map.put(c, map.get(c) + 1);
        }
        System.out.println(map);

        /*
        check the entry

         */

        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > 1) System.out.println(entry.getKey());
        }

        System.out.println("");

        System.out.println("------------TASK-2---------------");
        System.out.println(mostRepeated(null)); // []
        System.out.println(mostRepeated("")); // []
        System.out.println(mostRepeated("a")); // [a]
        System.out.println(mostRepeated("apple")); // [p]
        System.out.println(mostRepeated("banana")); // [a]
        System.out.println(mostRepeated("papa")); // [p, a]
        System.out.println(mostRepeated("abcabcabc")); //[a, b, c]
        System.out.println(mostRepeated("Maps are helpful but hard to learn :0")); //[ ]

    }
    /*
    Create method that takes a String as an argument
    and it returns the most occurred character in the String
    if there are more than one character that is counted the most, then return all
    If the String is empty or null just return nothing

    ""      -> []
    null    -> []
    "banana" -> [a]
    "apple"  -> [p]
    "papa"   -> [p, a]
    "abcabcabc" -> [a, b, c]
     */
       /*
   1. Count all the unique characters abcabcabc
       Key     values
       a       3
       b       3
       c       3
   2. Find the max occurrence // 3
   3. Find all the characters that has the max count, put them in a collection and return it back
    */
     public static Set<Character> mostRepeated(String str){

         Set<Character> result = new LinkedHashSet<>();
         if(str == null || str.isEmpty()) return result;
         LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
         for (Character c : str.toCharArray()) {
             if(map.containsKey(c))
                 map.put(c,map.get(c) + 1);
             else map.put(c,1);
         }
        int maxCount = new TreeSet<>(map.values()).last(); // 3
         for(Map.Entry<Character, Integer> entry : map.entrySet()){
             if(entry.getValue() == maxCount) result.add(entry.getKey());
         }
         return result;
    }



}
