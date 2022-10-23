package conditional_Statements.if_else_statements;

import java.util.Scanner;

public class Exercise2_EvenOrOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Hey user enter the number:");
        int num = input.nextInt();
        if(num % 2 == 0){ // ( num % 2 != 1)
            System.out.println("The number you enter is even!");
        }
        else{
            System.out.println("The number you enter is odd!");
        }
        System.out.println("End of the program!");
    }
}
