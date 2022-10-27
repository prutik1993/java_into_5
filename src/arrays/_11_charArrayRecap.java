package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class _11_charArrayRecap {
    public static void main(String[] args) {
        char[] nameLetters = new char [3];
        nameLetters[0] = 'A';
        nameLetters[1] = 'n';
        nameLetters[2] = 'a';
        char[] name2 = {'A', 'n', 'a'};

        System.out.println(Arrays.toString(nameLetters));
        System.out.println(Arrays.toString(name2));

        // nameLetters[0] = 'a';
        // nameLetters[1] = nameLetters[2];
        // System.out.println(Arrays.toString(nameLetters));

        for(char element : nameLetters){
            System.out.print(element);
        }
        System.out.println("\n------for i loop-----------");
        for (int i = 0; i < nameLetters.length; i++) {
            System.out.print(nameLetters[i]);
        }










    }
}
