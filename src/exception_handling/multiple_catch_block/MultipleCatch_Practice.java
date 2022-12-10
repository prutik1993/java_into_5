package exception_handling.multiple_catch_block;

public class MultipleCatch_Practice {
    public static void main(String[] args) {
        String name = null;
        int age = 25;
        /*
        get the first character from the name and print it
        divide tha age by 0 and print the result
        Print{name}'s age is {age}
        null's age is 25
         */

        try{
            System.out.println(name.charAt(0));
            System.out.println(age/0);
        }
        catch(NullPointerException | ArithmeticException e){
            e.printStackTrace();
        }


        System.out.println(name + "'s age is " + age + ".");



    }
}
