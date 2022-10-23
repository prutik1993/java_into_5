package loops;

import java.util.Scanner;

public class Exercise01_SumOfNumbersByUsers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many numbers you want to enter");
        int num = input.nextInt();
        int sum1 = 0;
        for (int i = 1; i <= num; i++) {
             System.out.println("Please enter number " + i);
             sum1 += input.nextInt();
        }
        System.out.println(sum1);


        System.out.println("Please enter how many numbers you want to enter");
        int num2 = input.nextInt();
        int sum2 = 0;
        int start = 1;
        while(start <= num2){
            System.out.println("Please enter number " + start);
            sum2 += input.nextInt();
            start++;
        }

        System.out.println(sum2);
        }
    }

