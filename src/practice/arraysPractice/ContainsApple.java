package practice.arraysPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class ContainsApple {
    public static void main(String[] args) {

        ArrayList<String> fruits1 = new ArrayList<>(Arrays.asList("Banana", "Orange", "Kiwi", "Apple"));
        ArrayList<String> fruits2 = new ArrayList<>(Arrays.asList("Banana", "Orange", "Kiwi", "Strawberry"));
        System.out.println(containsApple(fruits1));
        System.out.println(containsApple(fruits2));
        System.out.println(containsAppleEasier(fruits1));
        System.out.println(containsAppleEasier(fruits2));

    }

    public static boolean containsApple(ArrayList<String> fruits){
        for (String fruit : fruits) {
           if(fruit.toLowerCase().contains("apple")) return true;
        }
        return false;
    }

    public static boolean containsAppleEasier(ArrayList<String> fruits){
        return fruits.contains("apple") || fruits.contains("Apple");
    }

    public static boolean containsApple3(ArrayList<String> fruits){
        for (int i = 0; i < fruits.size(); i++) {
            if(fruits.get(i).equalsIgnoreCase("apple")) return true;
        }
        return false;
    }





}
