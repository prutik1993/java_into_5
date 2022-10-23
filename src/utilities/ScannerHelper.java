package utilities;

import java.util.Scanner;

public class ScannerHelper {
    /*
    create a method that ask user to enter a name and return it
     */

    public static String getAName() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        return name;
    }
    /*
    create a method that ask user to enter an age and return it
     */
       public static int getAnAge(){
           Scanner input = new Scanner(System.in);
           System.out.println("Please enter your age:");
           int age = input.nextInt();
           input.nextLine();
           return age;

    }

    public static String getAnAddress(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full address:");
        String address = input.nextLine();
        return address;
    }

    public static String getALastName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your last name:");
        String lastName = input.nextLine();
        return lastName;
    }
    public static String getAFullName(){
           Scanner input = new Scanner(System.in);
        System.out.println("Please enter your full name:");
           String fullName = input.nextLine();
           return fullName;
    }
    public static String getAString(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a String:");
        String s1 = input.nextLine();
        return s1;
       }
       public static String get4FavColors(){
           Scanner input = new Scanner(System.in);
           System.out.println("Please enter  4 or more of your favorite colors:");
           String colors = input.nextLine();
           return colors;
       }
    public static int getANumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int number = input.nextInt();
        input.nextLine();
        return number;
       }





}
