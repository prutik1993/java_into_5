package practice.variablesPractice;

import java.util.Scanner;

public class PracticeForMe {
    public static void main(String[] args) {
        /*
// Scanner//
Is it raining (true/false)
Do you have umbrella? (true/false)
c

// if else //
it is raining -> it is raining outside
    if you have umbrella -> you can go outside
    otherwise -> you stay home

it is not raining -> it is not raining outside
    if you are hungry -> you go to chick-fil-a
    otherwise -> you are riding a bike
 */

       /* Scanner input = new Scanner(System.in);
        boolean itIsRaining, youHaveUmbrella, youHungry;

        System.out.println("Is it raining? (true/false)");
        itIsRaining = input.nextBoolean();

        System.out.println("Do you have umbrella? (true/false)");
        youHaveUmbrella = input.nextBoolean();

        System.out.println("Are you hungry? (true/false)");
        youHungry = input.nextBoolean();

        if(itIsRaining){
            System.out.println("it is raining outside");
            if(youHaveUmbrella){
                System.out.println("you can go outside");
            }else{
                System.out.println("you stay at home");
            }
        }else{
            System.out.println("it is not raining outside");
            if(youHungry){
                System.out.println("you can go eat");
            }else{
                System.out.println("go biking");
            }
        } */

        int num1 = (int)(Math.random() * 10) + 1;
        int num2 = (int)(Math.random() * 10) + 1;
        System.out.println(num1);
        System.out.println(num2);
        int minNum = num1 < num2 ? num1 : num2;
        System.out.println(minNum);








    }
}
