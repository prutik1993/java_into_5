package arrays;

public class _08_Find_First_Even_Odd {
    public static void main(String[] args) {
        int[] numbers = {5, 3, 7};
        printFirstEvenOdd(numbers);
        String[] words = { "123", "!@#"};
        firstWithA(words);
    }
    /*
       create a public static method that will take an int array then
       it will print out the first even and firs odd
        */
    public static  void  printFirstEvenOdd(int[] numbers){
        int even = 0;
        int odd = 0;
        boolean isEven = false;
        boolean isOdd = false;
        for(int n : numbers){
            if(!isEven &&  n % 2 == 0) { // if first even is not found and the number is even
                even = n;
                isEven = true; // marking flag as true so next time you will know even has found
            }
            else if(!isOdd && n % 2 == 1){ // if first odd not found and number is odd
                odd = n;
                isOdd = true; // marking flag as true so next time you will know odd has found
            }

        }

        //if(isEven){
       //System.out.println("Firs even " + even);
       //}
       //else
       //{
       //    System.out.println("There is not even numbers");
       //}

        System.out.println((isEven) ? "Firs even " + even : "There is not even numbers");
        System.out.println((isOdd) ? "First odd " + odd : "There is not odd numbers");

       // if(isOdd){
       //     System.out.println("First odd " + odd);
       // }
       // else{
       //     System.out.println("There is not odd numbers");
       // }

    }
    /*
    Create a public static method which will take a String array then it will
    print out the first String starting with "a", NOT CASE SENSITIVE
    If there is not a String which is starting with "a" print -> 'No String starting with "a"'

    Example1:
    - array =  {"ABCD", "abcd", "123", "!@#"}

    Output1:
        First string with "a" = "ABCD"

    Example2:
    - array =  {"abcd", "123", "!@#"}

    Output2:
        First string with "a" = "abcd"

    Example3:
    - array =  {"123", "!@#"}

    Output3:
        No String starting with "a"
     */

    public static void firstWithA(String[] str) {
        boolean startA = false;
        for (String element : str) {
            if (!startA && (element.startsWith("a") || element.startsWith("A"))) {
                System.out.println(element);
                startA = true;
            }
        }
        if (!startA) {
            System.out.println("No String starting with \"a\"");

        }
    }


}
