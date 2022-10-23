package homework;

import utilities.ScannerHelper;

public class Homework04 {
    public static void main(String[] args) {

        System.out.println("\n--------------------TASK-1--------------------");
        String name = ScannerHelper.getAName();
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(name.length() - 1));
        System.out.println(name.substring(0,3));
        System.out.println(name.substring(name.length() - 3));
        String name1 = name.toLowerCase();
        if(name1.startsWith("a")){
            System.out.println("You are in the club!");
        }
        else{
            System.out.println("Sorry, you are not in the club");
        }


        System.out.println("\n--------------------TASK-2--------------------");
        String address = ScannerHelper.getAnAddress();
        String address1 = address.toLowerCase();
        if(address1.contains("chicago")){
            System.out.println("You are in the club");
        }
        else if(address1.contains("des plaines")){
            System.out.println("You are welcome to join to the club");
        }
        else{
            System.out.println("Sorry, you will never be in the club");
        }


        System.out.println("\n--------------------TASK-3--------------------");
        String favColors = ScannerHelper.get4FavColors();
        if(favColors.toLowerCase().contains("green") && favColors.toLowerCase().contains("red"))
            System.out.println("Green and red are in the list");
        else if(favColors.toLowerCase().contains("red"))
            System.out.println("Red is in the list");
        else if (favColors.toLowerCase().contains("green"))
            System.out.println("Green is in the list");
        else System.out.println("Green and red are not in the list");


        System.out.println("\n--------------------TASK-4--------------------");
        String s = "    Java is Fun     ";
        s = s.trim().toLowerCase();
        String s1 = s.substring(0,s.indexOf(" "));
        String s2 = s.substring(s.indexOf(" ") + 1, s.lastIndexOf(" "));
        String s3 = s.substring(s.lastIndexOf(" ") + 1);
        System.out.println("The first word in the str is = " + s1);
        System.out.println("The second word in the str is = " + s2);
        System.out.println("The third word in the str is = " + s3);

    }
}
