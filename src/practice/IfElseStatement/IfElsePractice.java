package practice.IfElseStatement;

public class IfElsePractice {
    public static void main(String[] args) {
        /*int myInt = 55;
        if(myInt >= 0 && myInt <= 24){
            System.out.println("first quarter");
        }
        else if(myInt >= 25 && myInt <= 49){
            System.out.println("second quarter");
        }
        else if(myInt >= 50 && myInt <= 74){
            System.out.println("third quarter");
        }
        else {
            System.out.println("wrong number");
        }*/


        int num2 = 2;
        if(num2 < 0 && num2 >= -50){
            System.out.println("number is in negative part");
        }
        else if(num2 == 0){
            System.out.println("number is zero");
        }
        else if(num2 > 0 && num2 <= 50){
            System.out.println("number is in positive part");
        }
        else{
            System.out.println("ouside of range");
        }


    }
}
