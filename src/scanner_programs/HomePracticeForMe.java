package scanner_programs;


import java.util.Scanner;

public class HomePracticeForMe {
    public static void main(String[] args){
        double number1 = (Math.random() * 101);
        double number2 = (Math.random() * 101);
        double number3 = (Math.random() * 101);
        System.out.println((int)number1);
        System.out.println((int)number2);
        System.out.println((int)number3);

        if((int)number1 > 25 && (int)number2 > 25 && (int)number3 > 25){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        System.out.println("End of the program!");


        Scanner input = new Scanner(System.in);
        System.out.println("enter 5 numbers ");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
        int n4 = input.nextInt();
        int n5 = input.nextInt();

        System.out.println(Math.min(Math.min(n1, n2), n3));
        System.out.println(Math.max(Math.max(n1, n2), Math.max(n3, n4)));
        System.out.println(Math.min(Math.min(n1, n2), Math.min(Math.min(n3, n4), n5)));
        System.out.println(Math.max(Math.max(n1, n2),Math.max(Math.max(n3,n4), n5)));


        double random1 = Math.random() * (150 - 50 + 1) + 50;
        double random2 = Math.random() * (150 - 50 + 1) + 50;
        double random3 = Math.random() * (150 - 50 + 1) + 50;
        double sumRandom = random1 + random2 + random3;
        System.out.println("Number 1 = " + (int)random1);
        System.out.println("Number 2 = " + (int)random2);
        System.out.println("Number 3 = " + (int)random3);
        System.out.println("Sum of the numbers = " + (int)sumRandom);


        int num1 = (int)(Math.random() * (100 - 50 + 1) + 50);
        double num2 = (int)(Math.random() * (100 - 50 + 1) + 50);
        double num3 = (int)(Math.random() * (100 - 50 + 1) + 50);
        /* System.out.println((int)num1);
        System.out.println((int)num2);
        System.out.println((int)num3); */
        if(num1 > 25 && num2 > 25 && num3 > 25){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }


        int a1 = (int)(Math.random() * 101);
        int a2 = (int)(Math.random() * 101);
        int a3 = (int)(Math.random() * 101);
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        boolean a4 = (a1 > 25 && a2 > 25 && a3 > 25);





    }
}
