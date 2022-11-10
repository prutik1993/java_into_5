package projects;

import utilities.RandomNumberGenerator;
import utilities.ScannerHelper;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Project04 {
    public static void main(String[] args) {

        System.out.println("\n-----------------------Task-1-----------------------");
        String str = ScannerHelper.getAString();
        if (str.length() >= 8) {
            System.out.println(str.substring(str.length() - 4) + str.substring(4, str.length() - 4)
                    + str.substring(0, 4));
        } else System.out.println("This String does not have 8 characters");



        System.out.println("\n-----------------------Task-2-----------------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a sentence:");
        String sentence = input.nextLine();
        sentence = sentence.trim();
        if (sentence.contains(" ")) {
            System.out.println(sentence.substring(sentence.lastIndexOf(" ") + 1) +
                    sentence.substring(sentence.indexOf(" "), sentence.lastIndexOf(" ") + 1) +
                    sentence.substring(0, sentence.indexOf(" ")));
        } else System.out.println("This sentence does not have 2 or more words to swap");



        System.out.println("\n-----------------------Task-3-----------------------");

        String str1 = "These books are so stupid";
        String str2 = "I like idiot behaviors";
        String str3 = "I had some stupid t-shirts in the past and also some idiot look shoes";

        // if (str1.contains("idiot") || str1.contains("stupid"))
       //     str1 = str1.replaceAll("idiot", "nice");
       // if (str1.contains("stupid"))
       //     System.out.println(str1.replaceAll("stupid", "nice"));
       // else System.out.println(str1);
       // if (str2.contains("idiot"))
       //     str2 = str2.replaceAll("idiot", "nice");
       // if (str2.contains("stupid"))
       //     System.out.println(str2.replaceAll("stupid", "nice"));
       // else System.out.println(str2);
       // if (str3.contains("idiot"))
       //     str3 = str3.replaceAll("idiot", "nice");
       // if (str3.contains("stupid"))
       //     System.out.println(str3.replaceAll("stupid", "nice"));
       // else System.out.println(str3);
//

        str1 = str1.replace("idiot", "nice").replace("stupid", "nice");
        str2 = str2.replace("idiot", "nice").replace("stupid", "nice");
        str3 = str3.replace("idiot", "nice").replace("stupid", "nice");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);

        System.out.println("\n-----------------------Task-4-----------------------");

        String name = ScannerHelper.getAName();
        if (name.length() > 2) {
            if (name.length() % 2 == 0)
                System.out.println(name.substring(name.length() / 2 - 1, name.length() / 2 + 1));
            else System.out.println(name.charAt(name.length() / 2));
        } else System.out.println("Invalid input!!!");


        System.out.println("\n-----------------------Task-5-----------------------");


        System.out.println("Please enter a country:");
        String country = input.nextLine();
        if (country.length() > 5) System.out.println(country.substring(2, country.length() - 2));
        else System.out.println("Invalid input!!!");


        System.out.println("\n-----------------------Task-6-----------------------");

        String address = ScannerHelper.getAnAddress();

       //for (int i = 0; i < address.length(); i++) {
       //    if (address.charAt(i) == 'a' || address.charAt(i) == 'A')
       //        address = address.replace(address.charAt(i), '*');
       //    else if (address.charAt(i) == 'e' || address.charAt(i) == 'E')
       //        address = address.replace(address.charAt(i), '#');
       //    else if (address.charAt(i) == 'i' || address.charAt(i) == 'I')
       //        address = address.replace(address.charAt(i), '+');
       //    else if (address.charAt(i) == 'u' || address.charAt(i) == 'U')
       //        address = address.replace(address.charAt(i), '$');
       //    else if (address.charAt(i) == 'o' || address.charAt(i) == 'O')
       //        address = address.replace(address.charAt(i), '@');
       //}
        address = address.replace('a','*').replace('A','*')
                .replace('e','#').replace('E','#')
                .replace('i','+').replace('I','+')
                .replace('u','$').replace('U','$')
                .replace('o','@').replace('O','@');
        System.out.println(address);

        System.out.println("\n-----------------------Task-7-----------------------");

        int num1 = RandomNumberGenerator.getARandomNumber(0, 25);
        int num2 = RandomNumberGenerator.getARandomNumber(0, 25);
        System.out.println(num1);
        System.out.println(num2);
        String counter = "";
        for (int i = Math.min(num1, num2); i <= Math.max(num1, num2); i++) {
            if (i % 5 != 0)
                counter += i + " - ";
        }
        System.out.println(counter.substring(0, counter.length() - 3));


        System.out.println("\n-----------------------Task-8-----------------------");

        System.out.println("Please enter a sentence:");
        str = input.nextLine();
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ')
                count++;
        }
        if (count > 0) System.out.println("This sentence has " + (count + 1) + " words.");
        else System.out.println("This sentence does not have multiple words");


        System.out.println("\n-----------------------Task-9-----------------------");

        System.out.println("Please enter a positive number:");
        int number = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= number; i++) {
            if (i % 6 == 0) System.out.println("Foobar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 3 == 0) System.out.println("Bar");
            else System.out.println(i);
        }




        System.out.println("\n-----------------------Task-10-----------------------");

        System.out.println("Please enter a word:");
        String word = input.nextLine();
        word = word.toLowerCase();
        String reverse = "";
        for (int i = word.length()-1 ; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        if(word.length() == 0) System.out.println("This word does not have 1 or more characters");
        else if(word.equals(reverse)) System.out.println("This word is palindrome");
        else System.out.println("This word is not palindrome");



        System.out.println("\n-----------------------Task-11-----------------------");

        System.out.println("Please enter a sentence:");
        sentence = input.nextLine();
        String newSentence = sentence.toLowerCase();
        int countA = 0;
        if (newSentence.length() > 0) {
            for (int i = 0; i < newSentence.length(); i++) {
                if (newSentence.charAt(i) == 'a')
                    countA++;
            }
            System.out.println("This sentence has " + countA + " a or A letters");

        } else System.out.println("This sentence does not have any characters");
    }

}

