package exception_handling.try_catch;

public class TryCatch_Practice03 {
    public static void main(String[] args) {

        // find the 6th number from array, multiply it with 5 ang print the result

        int[] numbers = {1,2,3,5};
        try{
            System.out.println(numbers[5] * 5);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("End of the program");
    }
}
