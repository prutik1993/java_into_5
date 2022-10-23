package loops;

import utilities.ScannerHelper;

import java.util.Scanner;

public class Exercise04_ReverseAString {
    public static void main(String[] args) {
        String name = ScannerHelper.getAName();
        String nameReverse = "";
        for (int i = name.length()-1; i >= 0; i--) {
            nameReverse += name.charAt(i);
        }
        System.out.println("The reversed name is = " + nameReverse);

        String name1 = ScannerHelper.getAName();
        String reverse = "";
        for(int i = name1.length()-1; i >= 0; i--){
            reverse += name.charAt(i);
        }
        System.out.println("The reverse name is " + reverse);

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a name:");
        String newName = input.nextLine();
        String reverseName = "";
        for(int i = newName.length()-1; i >= 0; i--){
            reverseName += newName.charAt(i);
        }
        System.out.println(reverseName);

        String myName = "Anastasiya";
        String myNewName = "";
        for(int i = myName.length()-1; i >= 0; i--){
            myNewName += myName.charAt(i);
        }
        System.out.println(myNewName);



    }

}
