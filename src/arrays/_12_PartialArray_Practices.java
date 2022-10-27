package arrays;

public class _12_PartialArray_Practices {
    public static void main(String[] args) {
        int[] numbers = {10, -3, -7, 0, 0, 7, 22};
        System.out.println(sum(numbers));
        System.out.println(sumOfLast(numbers));
    }

    public static int sum(int[] numbers){
        int sum = 0;
       for(int i = 0; i <= 2; i++){
           sum += numbers[i];
       }
       return sum;
    }


    /*
    create a public static method which will take an int array then it will get the
    sum of last 5 elements and return it.

    Note: Given array should be at least 5 elements
    Note2: Use LOOPS

    Example:
    Array -> int[] numbers = {10, -3, -7, 0, 0, 7, 22};

    Return:
    22

    Example2:
    Array -> int[] numbers = {10, -3, 7, 1, 22};

    Return2:
    38
     */
    public static int sumOfLast(int[] numbers){
        int sum1 = 0;
        for (int i = numbers.length-1; i > numbers.length-6; i--) {
            sum1 += numbers[i];
        }
        return sum1;
        //        for (int i = nums.length - 5; i < nums.length; i++) {
        //            sum += nums[i];
    }
}
