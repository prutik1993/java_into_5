package arrays;

public class _10_Find_Longest_Shortest {
    public static void main(String[] args) {
        String[] colors = {"red", "blue", "yellow", "white"};
        longestShortest(colors);

    }

    /*
    create a public static method which will take a String array then it will print the longest and shortest
    string from that array.

    Example:
    Array ->  String[] colors = {"red", "blue", "yellow", "white"};

    Output:
        Shortest = red
        Longest = yellow

     */
    public static void longestShortest(String[] strings){
        String shortStr = strings[0];
        String longStr = strings[0];
        for(int i = 1; i < strings.length; i++){
           if(longStr.length() < strings[i].length())
              longStr = strings[i];
           if(shortStr.length() > strings[i].length())
               shortStr = strings[i];
        }
        System.out.println("The longest is = " + longStr);
        System.out.println("The shortest is = " + shortStr);
    }

}
