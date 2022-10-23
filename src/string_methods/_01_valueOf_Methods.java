package string_methods;

public class _01_valueOf_Methods {
    public static void main(String[] args) {
        /*
          1. return type
          2. returns a String
          3. static
          4. takes arguments - there are many overloaded valueOf() methods
        */

        int num = 125;
         String numString = String.valueOf(num);
        System.out.println(num + 5); // number
        System.out.println(numString + 5); // text
    }
}
