package string_methods;

import utilities.ScannerHelper;

import java.util.Arrays;

public class Exercise06_MiddleCharOrChars {
    public static void main(String[] args) {


        /*
        olena -> s.charAt(s.length()/2) middle latter
        abdallah -> s.substring(s.length()/2 - 1, s.length()/2 + 1)
         */

        String name = ScannerHelper.getAName();
        if (name.length() % 2 == 0) {
            System.out.println("Middle chars are =  " + name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
        } else {
            System.out.println("Middle chars are = " + name.charAt(name.length() / 2));
        }






    }
}