package arrays;

import java.util.Arrays;

public class _01_StringArray {
    public static void main(String[] args) {

        // 1. Declare String Array called as countries and assign size of 3
        String[] countries = new String[3];

        // 2. Assigning values to specific indexes
        countries[1] = "Spain";

        // 3. Print specific index an array
        System.out.println(countries[0]); // null
        System.out.println(countries[1]); // Spain

        // 4. Printing an Array
        System.out.println(Arrays.toString(countries)); // [null, Spain, null]


        // 5. Assign Belgium to index of 2 and print the array
        countries[2] = "Belgium";
        System.out.println(Arrays.toString(countries)); // [null, Spain, Belgium]

        // 6. Update existing element
        countries[1] = "France";
        System.out.println(Arrays.toString(countries));

        // 7. Getting thr length of the array - how many elements - 3
        int i = countries.length;
        //System.out.println(countries.length); // 3
        System.out.println(i);

        // Note!! Arrays size can not be modified

        // 8. Printing each element separate
        System.out.println((countries[0]));
        System.out.println((countries[1]));
        System.out.println((countries[2]));
        for (int j = 0; j <= 2; j++) {
            System.out.println("Country at index of " + j + " is = " + countries[j]);
        }
        System.out.println("Hello World!!");

    }
}
