package conditional_Statements.if_else_statements;

import java.util.Scanner;

public class ShortsIfElse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        if(num1 > num2 )System.out.println(num1 + " is the greatest");
        else System.out.println(num2 + " is the greatest"); // only if one statement we can delete {{{{

        System.out.println("End of the program!");

    }
}
