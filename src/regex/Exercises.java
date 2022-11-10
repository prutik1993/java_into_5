package regex;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.regex.Pattern;

public class Exercises {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[A-Za-z0-9_-]{8,15}", "JohnDoe_123"));
        System.out.println(Pattern.matches("[\\w\\-]{8,15}", "JohnDoe_123"));
        System.out.println(Pattern.matches("[\\d]{8,15}", "1236767676"));
        System.out.println(Pattern.matches("[\\D]{8,15}", "hfhhfhfhhf"));
        System.out.println(Pattern.matches(".+", "johndoeH888@"));

        // NNN-NN-NNNN
        System.out.println(Pattern.matches("[\\d]{3}-[\\d]{2}-[\\d]{4}", "654-87-6543"));

        // (NNN)-NNN-NNNN
        System.out.println(Pattern.matches("\\([\\d]{3}\\)-[\\d]{3}-[\\d]{4}", "(876)-000-0000"));

        System.out.println("\n=============Task===============\n");

        String str = "How much wood would a wood chuck chuck if a wood chuck could chuck wood";

        System.out.println(str.replaceAll("wood","****"));


        String str1 = "abc 123 $#^@_ ";

        System.out.println(str1.replaceAll("[\\W_]",""));
      System.out.println(str1.replaceAll("[^a-zA-Z0-9]",""));


        System.out.println(Pattern.matches("[A-Za-z]{2,}\\s[A-Za-z]{2,}", "John Doe"));
        System.out.println(Pattern.matches("[A-Z]{1}[a-z]+\\s[A-Z]{1}[a-z]+", "John Doe"));


        String str2 = "##A%1b2^C*7*3HH";
        //[1, 2, 7, 3];
        //[A, b, C, H, H];

        System.out.println(Arrays.toString(str2.replaceAll("[^A-Za-z]","").toCharArray()));
        System.out.println(Arrays.toString(str2.replaceAll("[\\D]","").split("")));








    }
}
