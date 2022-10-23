package character_Class;

public class EasyMethodPractices {
    public static void main(String[] args) {
        String s1 = "8903 Lamon ave Skokie IL";
        System.out.println("String: " + s1 + " has " + countLetters(s1) + " letters");
         String s2 = "12334 @!#$!@ TechGlobal";
        System.out.println(countUpperCases(s2));
        printStringAttributes(s2);


    }
    public static int countLetters(String s){
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if(Character.isLetter(s.charAt(i)))
            counter++;
        }
          return counter;

    }

    /*
      Create a public static method named as countUpperCases() which will take a String
      and counts the upper case letters then returns it
       */
      //"12334 @!#$!@ TechGlobal" -> 2
      //"TeChGloBal" -> 4
      //"123123 TeChGloBal #$%#$%" -> 4
    public static int countUpperCases(String str){
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i)))
            counter++;
        }
        return counter;
    }
      /*
Create public static method named as printStringAttributes() takes a String as parameter
and prints the message dynamically for the string

Print output -> "Given "(string)" has:
                x amount of upper cases
                x amount of lower cases
                x amount of letters
                x amount of digits
                x amount of spaces
                x amount of specials"


   Example Output:
   Given "12345 @!#$!@ TechGlobal" has:
         2 amount of upper cases
         8 amount of lower cases
         10 amount of letters
         5 amount of digits
         2 amount of spaces
         6 amount of specials
 */
    public static void printStringAttributes(String s){
        int upper = 0;
        int lower = 0;
        int letter = 0;
        int digit = 0;
        int spaces = 0;
        int specials = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                letter++;
                if (Character.isUpperCase(s.charAt(i)))
                    upper++;
                else lower++;
            }
            else if (Character.isDigit(s.charAt(i)))
                digit++;
            else if (Character.isWhitespace(s.charAt(i)))
                spaces++;
            else specials++;
        }
        System.out.println("Given \"" + s +  "\"has:\n"
                + upper + " amount of upper cases\n"
                + lower + " amount of lower cases\n"
                + letter + " amount of letters\n"
                + digit + " amount of digits\n"
                + spaces + " amount of spaces\n"
                + specials + " amount of special characters.");


    }

}
