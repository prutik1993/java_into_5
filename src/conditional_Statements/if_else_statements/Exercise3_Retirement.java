package conditional_Statements.if_else_statements;

import java.util.Scanner;

public class Exercise3_Retirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age = input.nextInt();
        if(age >= 55){   // if(age > 54)
            System.out.println("It is your time to get retired!");
        }
        else{

            System.out.println("You have " + (55 - age) + " years to be retired");
        }
        System.out.println("End of the program!");
    }    /* public class Exercise3_Retirement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age?");
        int age = input.nextInt();
        if(age >= 55){
            System.out.println("It is your time to get retired!");
        }
        else{
            System.out.println("You have " + (55 - age) + " years to be retired"); */

}
