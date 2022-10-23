package string_methods;

public class _11_srartsWith_endWith_Methods {
    public static void main(String[] args) {
        /*
        1. return
        2. return boolean
        3.non-static
        4. there are overloaded methods but we will use always one arg as String
         */

        String s = "TechGlobal";
        System.out.println(s.startsWith("T")); // true
        System.out.println(s.startsWith("t"));// true
        System.out.println(s.startsWith("Tech"));// true
        System.out.println(s.endsWith("Global"));// true

        // important
        String city = "Chicago";
        System.out.println(city.startsWith(city)); // true
        System.out.println(city.endsWith(city)); // true
        System.out.println(city.startsWith("")); // true
        System.out.println(city.endsWith("")); // true

        System.out.println(city.startsWith("M")); //false
        System.out.println(city.endsWith("lin")); // false


    }
}
