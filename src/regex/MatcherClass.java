package regex;

import utilities.ScannerHelper;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatcherClass {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("SDET");
        Matcher matcher = pattern.matcher("TechGlobal provides students a complete educational program to be a competitive SDET in the professional IT field. With the course, students learn all the fundamental technologies needed to become an SDET professional and how important testing is in the Software Development Life Cycle (SDLC)… Learn more about the technologies that TechGlobal provides to its participants below and feel free to reach out to us with any questions.");

        System.out.println(matcher.matches()); // false


      //        System.out.println(matcher.group());
      //        System.out.println("Starting index: " + matcher.start());
      //        System.out.println("Ending index: " + matcher.end());
      //
      //        System.out.println(matcher.find());
      //        System.out.println(matcher.group());
      //        System.out.println("Starting index: " + matcher.start());
      //        System.out.println("Ending index: " + matcher.end());

        int count = 0;
        while(matcher.find()){
            count++;
            System.out.println(matcher.group());
            System.out.println("Starting index: " + matcher.start());
            System.out.println("Ending index: " + matcher.end());
        }
        System.out.println("SDET appears " + count + " times");


      Scanner input = new Scanner(System.in);
        pattern = Pattern.compile("[A-Za-z]{1,}");
        System.out.println("Please enter a sentence");
        String sentence = input.nextLine();
        matcher = pattern.matcher(sentence);

        int wordCounter = 0;

       while(matcher.find()){
           System.out.println(matcher.group());
           wordCounter++;
       }
        System.out.println("This sentence contains " + wordCounter + " words");





    }
}
