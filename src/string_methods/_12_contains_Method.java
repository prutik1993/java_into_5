package string_methods;

public class _12_contains_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. return boolean
        3. non-static
        4. takes one arg as charSequence same like a String

         */
        String s = "TechGlobal School";
        System.out.println(s.contains("Tech")); // true
        System.out.println(s.contains("School")); // true
        System.out.println(s.contains("a")); // true
        System.out.println(s.contains("E")); // false

        //IMPORTANT
        System.out.println(s.contains("")); // always true
        System.out.println(s.contains(s));// true
        System.out.println(s.contains("Education")); // false


    }
}
