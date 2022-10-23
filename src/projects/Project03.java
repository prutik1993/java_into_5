package projects;

import mathClass.MathRandomMethod;

public class Project03 {
    public static void main(String[] args) {


        System.out.println("\n--------------------Task-1--------------------\n");

        String s1 = "24", s2 = "5";
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);

        System.out.println("The sum of " + s1 + " and " + s2 + " = " + (n1 + n2) +
                "\nThe subtraction of " + s1 + " and " + s2 + " = " + (n1 - n2) +
                "\nThe division of " + s1 + " and " + s2 + " = " + (double)n1 / (double)n2 +
                "\nThe multiplication of " + s1 + " and " + s2 +  " = " + (n1 * n2) +
                "\nThe remainder of " + s1 + " and " + s2 + " = " + n1 % n2);


        System.out.println("\n--------------------Task-2--------------------\n");

        int random = (int)(Math.random() * (35 - 1 + 1) + 1);
        System.out.println(random);
        switch(random){
            case 2:
            case 3:
            case 5:
            case 7:
            case 11:
            case 13:
            case 17:
            case 19:
            case 23:
            case 29:
            case 31:
                System.out.println("THE NUMBER IS A PRIME NUMBER");
                break;
            default:
                System.out.println("THE NUMBER IS NOT A PRIME NUMBER");
        }


        System.out.println("\n--------------------Task-3--------------------\n");

        int random1 = (int)(Math.random() * (50 - 1 + 1) + 1);
        int random2 = (int)(Math.random() * (50 - 1 + 1) + 1);
        int random3 = (int)(Math.random() * (50 - 1 + 1) + 1);
        System.out.println("Random number 1 = " + random1);
        System.out.println("Random number 2 = " + random2);
        System.out.println("Random number 3 = " + random3);
        int max = Math.max(Math.max(random1, random2), random3);
        int min = Math.min(Math.min(random1, random2), random3);
        System.out.println("Lowest number is = " + min);
        if(random1 < max && random1 > min){
            System.out.println("Middle number is = " + random1);
        }
        else if(random2 < max && random2 > min){
            System.out.println("Middle number is  = " + random2);
        }
        else{
            System.out.println("Middle number is = " + random3);
        }
        System.out.println("Greatest number is = " + max);



        System.out.println("\n--------------------Task-4--------------------\n");

        char a1 = 'a';
        if(a1 >= 65 && a1 <= 90){
            System.out.println("The letter is uppercase");
        }
        else if(a1 >= 97 && a1 <= 122){
            System.out.println("The letter is lowercase");
        }
        else{
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("End of the program!");



        System.out.println("\n--------------------Task-5--------------------\n");

        char b1 = 'O';
        if(b1 >= 65 && b1 <= 90 || b1 >= 97 && b1 <= 122){
            if(b1 == 65 || b1 == 69 || b1 == 73 || b1 == 79 || b1 == 85 || b1 == 89 ||
            b1 == 97 || b1 == 101 || b1 == 105 || b1 == 111 || b1 == 117 || b1 ==121){
                System.out.println("The letter is vowel");
            }else{
                System.out.println("The letter is consonant");
            }
        }else{
            System.out.println("Invalid character detected!!!");
        }
        System.out.println("End of the program!");


        System.out.println("\n--------------------Task-6--------------------\n");

        char c1 = '@';
        if(c1 >= 65 && c1 <= 90 || c1 >= 97 && c1 <= 122 || c1 >= 48 && c1 <= 57){
            System.out.println("Invalid character detected!!!");
        }
        else{
            System.out.println("Special character is = " + c1);
        }
        System.out.println("End of the program!");


        System.out.println("\n--------------------Task-7--------------------\n");

        char d1 = '8';
        if(d1 >= 65 && d1 <= 90 || d1 >= 97 && d1 <= 122) {
            System.out.println("Character is a letter");
        }
        else if(d1 >= 48 && d1 <= 57){
            System.out.println("Character is a digit");
        }
        else{
            System.out.println("Character is a special character");
        }
        System.out.println("End of the program!");

    }
}
