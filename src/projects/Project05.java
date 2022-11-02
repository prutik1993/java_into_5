package projects;

import java.util.Arrays;

public class Project05 {
    public static void main(String[] args) {

        System.out.println("\n------------Task-1------------");
        int[] numbers = {10, 7, 7, 10, -3, 10, -3};
        findGreatestAndSmallestWithSort(numbers);

        System.out.println("\n------------Task-2------------");
        findGreatestAndSmallest(numbers);

        System.out.println("\n------------Task-3------------");
        int[] numbers1 = {10, 5, 6, 7, 8, 5, 15, 15};
        int[] numbers2 = {10};
        findSecondGreatestAndSmallestWithSort(numbers1);
        findSecondGreatestAndSmallestWithSort(numbers2);

        System.out.println("\n------------Task-4------------");
        findSecondGreatestAndSmallest(numbers1);

        System.out.println("\n------------Task-5------------");
        String[] words = {"foo", "bar", "Foo", "bar", "6", "abc", "6", "xyz"};
        findDuplicatedElementsInAnArray(words);

        System.out.println("\n------------Task-6------------");
        String[] things = {"pen", "eraser", "pencil", "pen", "123", "abc", "pen", "eraser"};
        findMostRepeatedElementInAnArray(things);

    }

    ////////////////////////Task-1////////////////////////
    public static void findGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);
        System.out.println("Smallest = " + numbers[0]);
        System.out.println("Greatest = " + numbers[numbers.length - 1]);
    }

    ////////////////////////Task-2////////////////////////
    public static void findGreatestAndSmallest(int[] numbers) {

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (n > max)
                max = n;
            if (n < min)
                min = n;
        }
        System.out.println("Smallest = " + min);
        System.out.println("Greatest = " + max);
    }

    ////////////////////////Task-3////////////////////////
    public static void findSecondGreatestAndSmallestWithSort(int[] numbers) {
        Arrays.sort(numbers);

        if(numbers.length > 1){
            int min = numbers[0];
            int max = numbers[numbers.length - 1];
            int secondMax = Integer.MIN_VALUE;
            int secondMin = Integer.MAX_VALUE;

            for (int i = 0; i < numbers.length - 1; i++) {
                if (numbers[i] > secondMax && numbers[i] != max)
                    secondMax = numbers[i];
                if (numbers[i] < secondMin && numbers[i] != min)
                    secondMin = numbers[i];
            }
            System.out.println("Second smallest = " + secondMin);
            System.out.println("Second greatest = " + secondMax);
        }else System.out.println("Array is invalid");
    }

    ////////////////////////Task-4////////////////////////

    public static int findMax(int[] numbers) {
        int max = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (max < n)
                max = n;
        }
        return max;
    }

    public static int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        for (int n : numbers) {
            if (min > n)
                min = n;
        }
        return min;
    }

    public static void findSecondGreatestAndSmallest(int[] numbers) {
        int secondMin = Integer.MAX_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int n : numbers) {
            if (n > secondMax && n < findMax(numbers))
                secondMax = n;
            if (n < secondMin && n > findMin(numbers))
                secondMin = n;
        }
        System.out.println("Second Smallest = " + secondMin);
        System.out.println("Second Greatest = " + secondMax);
    }

    ////////////////////////Task-5////////////////////////

    public static void findDuplicatedElementsInAnArray(String[] words) {
        String str = "";
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (str.contains(words[i] + "")) break;
                if (words[i].equals(words[j]))
                    str += words[j] + "\n";
            }
        }
        System.out.println(str.substring(0, str.length()-1));
    }

    ////////////////////////Task-6////////////////////////

    public static void findMostRepeatedElementInAnArray(String[] things) {
        String mostRepeated = "";
        int rep = 0;
        int count = 0;
        for (int i = 0, j = i + 1; i < things.length - 1; i++, j++) {
            if (things[i].equals(things[j])) {
                    count++;
                }
                if (count >= rep) {
                    mostRepeated = things[i];
                    rep = count;
                }

        }
        System.out.println(mostRepeated);
    }


}






