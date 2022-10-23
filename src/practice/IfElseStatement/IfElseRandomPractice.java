package practice.IfElseStatement;

public class IfElseRandomPractice {
    public static void main(String[] args) {
        int num1 = (int) (Math.random() * 51);
        System.out.println(num1);
        if(num1 > 9 && num1 < 26){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        boolean f1 = num1 > 9 && num1 < 26;
        System.out.println(f1);

        System.out.println((num1 > 9 && num1 < 26) ? "true" : "false");



        System.out.println("\nTask2\n");

        int random = (int)(Math.random() * (100) + 1);
        if(random >= 1 && random <= 25){
            System.out.println("1st quarter");
        }
        else if(random >= 26 && random <= 50){
            System.out.println("2nd quarter");
        }
        else if(random >= 51 && random <= 75){
            System.out.println("3rd quarter");
        }
        else{
            System.out.println("4th quarter");
        }


         if(random >= 1 && random <= 50){
            System.out.println("1st half");
        }
        else {
            System.out.println("2nd half");
        }


    }
}
