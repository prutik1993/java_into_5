package methods;

public class MethodPracticesAtClass {
    public static void main(String[] args) {
//        methodPractice("John");
//        System.out.println();
//        methodPractice("");
//        System.out.println();
//        methodPractice("JavaScript");
//        System.out.println();
//        methodPractice("JvScrpt");
//        middleCharacter("Johny");
//        middleCharacter("anasta");
        //halfGiven("anta");
        lastTwoSame("xdyuxd");


    }

    public static void methodPractice(String str) {
        if (str.length() == 0) {
            System.out.println("Length is zero");
        } else {
            System.out.println("Length is = " + str.length() +
                    "\nFirst char is = " + str.charAt(0) + "\nLast char is = " + str.charAt(str.length() - 1));

           if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                   || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
              System.out.println("This String has a vowel");
           }else{
               System.out.println("This String doesn't have vowel");
            }


        }
    }

    public static void printHasVowel(String str){
        if (str.toLowerCase().contains("a") || str.toLowerCase().contains("e") || str.toLowerCase().contains("i")
                || str.toLowerCase().contains("o") || str.toLowerCase().contains("u")) {
            System.out.println("This String has a vowel");
        }else{
            System.out.println("This String doesn't have vowel");
        }
    }

    public static void middleCharacter(String str){
        int l = str.length()/2;
        if(str.length() < 3)
            System.out.println("Length is less then 3");
        else if(str.length() % 2 == 0)
            System.out.println(str.substring(l -1, l +1)); // civic-> v-2 == length 5 | length/2
        else System.out.println(str.charAt(l)); //toyota -> yo == length 6 | length/2-1=2

        //  System.out.println(str.length() % 2 == 0 ? (str.substring(l -1, l +1) : str.charAt(l));
    }
    public static void halfGiven(String str){
        if(str.length() < 4)
            System.out.println("INVALID INPUT");
        else{
            System.out.println("First 2 characters are = " + str.substring(0,2));
            System.out.println("Last 2 characters are = " + str.substring(str.length()-2));
            System.out.println("The other characters are = " + str.substring(2,str.length()-2));
        }

    }
    public static void lastTwoSame(String str){
//        if(str.length() < 2) System.out.println("Length is less than 2");
//        else{
//            if(str.substring(0,2).equals(str.substring(str.length()-2)))
//                System.out.println("true");
//            else System.out.println("false");
//        }
        System.out.println(str.length() < 2 ? "Length is less than 2" :
                str.substring(0,2).equals(str.substring(str.length()-2)));
    }

}