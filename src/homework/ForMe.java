package homework;

import java.util.Scanner;

public class ForMe {
    public static void main(String[] args) {

        int n1, n2, n3, n4, n5;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 numbers between 1 to 10:");
        n1 = input.nextInt();
        n2 = input.nextInt();
        n3 = input.nextInt();
        n4 = input.nextInt();
        n5 = input.nextInt();



        char a1 = '8';
        if(a1 >= 65 && a1 <= 90 || a1 >= 97 && a1 <= 122){
            System.out.println("Character ia a letter");
        }else if(a1 >= 48 && a1 <= 57) {
            System.out.println("Character ia a digit");
        }else{
            System.out.println("Character not letter or digit");
        }

        




    }
}
