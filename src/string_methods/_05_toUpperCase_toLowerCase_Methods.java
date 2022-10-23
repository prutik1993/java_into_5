package string_methods;

public class _05_toUpperCase_toLowerCase_Methods {
    public static void main(String[] args) {

        /*
        1. return type
        2. Returns String
        3. non-static
        4. the one we use does not take any argument - there are overloaded methods
         */

        String name = "John";
        System.out.println(name.toLowerCase()); // john
        System.out.println(name.toUpperCase());

        System.out.println("HELLO".toLowerCase());
        System.out.println("hello".toUpperCase());


    }
}
