package casting;

public class ExplicitCasting {
    public static void main(String[] args) {

        // Explicit casting - narrowing - down-casting
        int age = 25;
        byte b = (byte) age;
        System.out.println(b);
        // but, we will lose data if bigger primitive holds a data that cannot be stored in the small one
        int num1  = 5000;
        byte num2 = (byte) num1; // it seems ok to compiler
        System.out.println(num2);






    }
}
