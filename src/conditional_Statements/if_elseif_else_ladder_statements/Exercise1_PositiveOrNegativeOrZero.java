package conditional_Statements.if_elseif_else_ladder_statements;



import java.util.Scanner;

public class Exercise1_PositiveOrNegativeOrZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hey user enter the number: ");
        int num = input.nextInt();
        if(num > 0) {
            System.out.println("POSITIVE");
        }
            else if (num < 0){
                System.out.println("NEGATIVE");
            }

        else {
            System.out.println("ZERO");
        }
        System.out.println("End of the program!");


    }
}
