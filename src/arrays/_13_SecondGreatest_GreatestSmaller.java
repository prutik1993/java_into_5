package arrays;

public class _13_SecondGreatest_GreatestSmaller {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 7, 1, 1, 7};
        findMinAndMaxAndSecondMinAndMax(numbers);

    }

    /*
create a public static method which will take an int array, find the max, second max and min, second min
from that array then print them out.

Hint: Find the max and min FIRST.

Note: Do it with sort and without sort.

Example:
   Array -> int[] numbers = {2, 3, 7, 1, 1, 7};

Output:
    max = 7
    second max = 3
    min = 1
    second min= 2
 */


    public static int findMax(int[] numbers){
        int max = Integer.MIN_VALUE;
        for(int n : numbers) {
            if (max < n)
                max = n;
        }
        return max;
    }
    public static int findMin(int[] numbers){
        int min = Integer.MAX_VALUE;
        for(int n : numbers) {
            if (min > n)
                min = n;
        }
        return min;
    }

    public static void findMinAndMaxAndSecondMinAndMax(int[] numbers){
        int secondMax = Integer.MIN_VALUE;
        int secondMin = Integer.MAX_VALUE;
        for(int n : numbers){
            if(n > secondMax && n < findMax(numbers))
                secondMax = n;
            if(n < secondMin && n > findMin(numbers))
                secondMin = n;
        }
        System.out.println("The first max is " + findMax(numbers));
        System.out.println("The first min is " + findMin(numbers));
        System.out.println("The second max is " + secondMax);
        System.out.println("The second min is " + secondMin);

    }

}
