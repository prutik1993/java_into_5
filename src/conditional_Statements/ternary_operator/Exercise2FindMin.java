package conditional_Statements.ternary_operator;

import java.util.Random;

public class Exercise2FindMin {
    public static void main(String[] args) {

        Random random = new Random();
        int num1 = random.nextInt(10) + 1;
        int num2 = random.nextInt(10) + 1;
        System.out.println(num1);
        System.out.println(num2);
        int min = num1 < num2 ? num1 : num2;
        System.out.println(min);


        /*   int num1 = (int)(Math.random() * (10 - 1 + 1) + 1);
             int num2 = (int)(Math.random() * (10 - 1 + 1) + 1);
             System.out.println(num1);
             System.out.println(num2);
             int min = num1 < num2 ? num1 : num2;
             System.out.println(min);  */
    }
}
