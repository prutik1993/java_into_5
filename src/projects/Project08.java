package projects;

import java.util.Arrays;

public class Project08 {
    //////////////////////////Task-1//////////////////////////
    public static int  findClosestDistance(int[] numbers){
        int answer = Integer.MAX_VALUE;
        if(numbers.length < 2) return -1;
        for (int i = 0; i < numbers.length-1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if(Math.abs(numbers[i] - numbers[j]) < answer)
                    answer = Math.abs(numbers[i] - numbers[j]);
            }
        }
     return answer;
    }
    //////////////////////////Task-2//////////////////////////
     public static int lonelyInteger(int[] numbers) {
         for (int i = 0; i < numbers.length; i++) {
             int count = 0;
             for (int j = 0; j < numbers.length; j++) {
                  if(numbers[i] == numbers[j])
                      count++;
             }
             if(count == 1) return numbers[i];
         }
         return -1;
     }
     //////////////////////////Task-3//////////////////////////
    public static char findFirstUniqueCharacter(String str){

        for (int i = 0; i < str.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < str.length(); j++) {
                if( i != j && str.charAt(i) == str.charAt(j)){
                    unique = false;
                break;
                }
            }
            if(unique)
                return str.charAt(i);
        }
        return ' ';

    }
    //////////////////////////Task-4//////////////////////////
    public static int  findMissingNumber(int[] numbers){
        Arrays.sort(numbers);
         int answer = 0; //{4, 7, 8, 6}
        for (int i = 0; i < numbers.length-1; i++) {
            if(Math.abs(numbers[i]-numbers[i+1]) == 2) answer = numbers[i]+1;
        }
        return answer;
    }


    public static void main(String[] args) {

        System.out.println("\n_________________Task-1_________________\n");

        //int[] numbers1 = {4};
        //int[] numbers1 = {4, 8, 7, 15};
        //int[] numbers1 = {10, -5, 20, 50, 100};
        int[] numbers1 = {10, -5, 20, 50, 100, 11};

        System.out.println(findClosestDistance(numbers1));


        System.out.println("\n_________________Task-2_________________\n");

        int[] numbers2 = {5, 3, -1, 3, 5, 7, -1};
        //int[] numbers2 = {2};

        System.out.println(lonelyInteger(numbers2));


        System.out.println("\n_________________Task-3_________________\n");

        //String str3 = "Hello";
        String str3 = "aabbc";

        System.out.println(findFirstUniqueCharacter(str3));


        System.out.println("\n_________________Task-4_________________\n");

        //int[] numbers4 = {4, 7, 8, 6};
        int[] numbers4 = {2, 3, 1, 5};

        System.out.println(findMissingNumber(numbers4));
    }
}
