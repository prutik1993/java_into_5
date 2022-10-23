package arrays;

public class _04_CountElementsInIntArrays {
    public static void main(String[] args) {
        int[] numbers = {-1, 3, 0, 5, -7, 10, 8, 0, 10, 0};
         /*
         negatives: 2
         positive: 5
         neutral or zero: 3

         even: 6
         odd: 4

         max: 10
         min: -7

         sum: 28
         average of the numbers: 2
         how many of those numbers are represented in fibonacci: 6
         how many unique numbers: 7
         prime numbers: 2
         how many numbers can be divided by 5: 6
         absolute difference between max and min: 17
         closest number to 9: 8
         */

        int negatives = 0;
        for(int number : numbers){
            if(number < 0) negatives++;
        }
        System.out.println("There are " + negatives + "  negative numbers in this array.");

        int positives = 0;
        for(int number : numbers){
            if(number > 0) positives++;
        }
        System.out.println("There are " + positives + "  positive numbers in this array.");

        /*
        count how many even numbers
        expected: 6
         */

        int even = 0;
        for (int number : numbers) {
            if(number % 2 == 0) even++;
        }
        System.out.println(even);

        even = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 2 == 0) even++;
        }
        System.out.println(even);

    }
}
