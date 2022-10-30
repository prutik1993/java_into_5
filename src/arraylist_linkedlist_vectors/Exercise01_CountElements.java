package arraylist_linkedlist_vectors;

import java.util.ArrayList;
import java.util.Arrays;

public class Exercise01_CountElements {
    public static <Arraylist> void main(String[] args) {

        /*
      Create an ArrayList and store below colors
      Blue
      Brown
      Pink
      Yellow
      Red
      Purple

      Print the ArrayList
      Print the size
      Print each element separately

      EXPECTED:
      [Blue, Brown, Pink, Yellow, Red, Purple]
      6
      Blue
      Brown
      Pink
      Yellow
      Red
      Purple
       */

        System.out.println("\n------TASK-1-------\n");

        // String[] elements = {"Blue", "Brown", "Pink", "Yellow", "Red","Purple"};
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Blue", "Brown", "Pink", "Yellow", "Red","Purple"));
       // ArrayList<String> colors = new ArrayList<>(Arrays.asList(elements));
       //  colors.add("Blue");
       //  colors.add("Brown");
       //  colors.add("Pink");
       //  colors.add("Yellow");
       //  colors.add("Red");
       //  colors.add("Purple");

        System.out.println(colors);
        System.out.println(colors.size());
        for (String color : colors) {
            System.out.println(color);
        }

        System.out.println("\n------TASK-2-------\n");

        /*
        How many elements has length of 6
         */
        System.out.println("for-each loop");

        int has6 = 0;
        for (String color : colors) {
            if(color.length() == 6)
                has6++;
        }

        System.out.println(has6);

        System.out.println("fori loop");

        int has6again = 0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).length() == 6) has6again++;
        }
        System.out.println(has6again);


        System.out.println("\n------TASK-3-------\n");

        /*
        Count elements has "o"
         */

        System.out.println("for-each loop");
        int hasO = 0;
        for (String color : colors) {
            if(color.toLowerCase().contains("o")) hasO++;
        }
        System.out.println(hasO);

        System.out.println("fori loop");
         int hasOAgain = 0;
        for (int i = 0; i < colors.size(); i++) {
            if(colors.get(i).toLowerCase().contains("o")) hasOAgain++;
        }
        System.out.println(hasOAgain);
    }
}
