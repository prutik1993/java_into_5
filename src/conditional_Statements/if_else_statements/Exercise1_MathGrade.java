package conditional_Statements.if_else_statements;

import java.util.Scanner;

public class Exercise1_MathGrade {
    public static void main(String[] args) {
        Scanner inout = new Scanner(System.in);
        System.out.println("Hey David! Please enter your math grade?");
        int examResult = inout.nextInt();
        if(examResult >= 60){
            System.out.println("Awesome! You passed the math class!");
        }
        else {
            System.out.println("Sorry! You failed!");
        }
        System.out.println("End of the program!");
    }
}
