package print_statements;

import java.util.Scanner;

public class MePractice {
    public static void main(String[] args) {

        int num1, num2, num3;
        Scanner input = new Scanner(System.in);

        System.out.println("enter 3 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        System.out.println("The product of the numbers entered is = " + num1 * num2 * num3);



    }
}
