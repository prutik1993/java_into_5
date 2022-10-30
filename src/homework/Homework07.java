package homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class Homework07 {
    public static  void main(String[] args) {

        System.out.println("\n----------------------Task-1----------------------\n");

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);
        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("\n----------------------Task-2----------------------\n");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Brown");
        colors.add("Red");
        colors.add("White");
        colors.add("Black");
        colors.add("Purple");
        System.out.println(colors.get(1));
        System.out.println(colors.get(3));
        System.out.println(colors.get(5));
        System.out.println(colors);


        System.out.println("\n----------------------Task-3----------------------\n");

        ArrayList<Integer> numbers3 = new ArrayList<>();
        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);
        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println(numbers3);


        System.out.println("\n----------------------Task-4----------------------\n");

        ArrayList<String> cities = new ArrayList<>();
        cities.add("Istanbul");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Paris");
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);


        System.out.println("\n----------------------Task-5----------------------\n");

        ArrayList<String> superHeroes = new ArrayList<>();
        superHeroes.add("Spider Man");
        superHeroes.add("Iron Man");
        superHeroes.add("Black Panter");
        superHeroes.add("Deadpool");
        superHeroes.add("Captain America");
        System.out.println(superHeroes);
        System.out.println(superHeroes.contains("Wolwerine"));


        System.out.println("\n----------------------Task-6----------------------\n");

        ArrayList<String>  avengersCharacters = new ArrayList<>(Arrays.asList("Hulk", "Black Widow", "Captain America", "Iron Man"));
        Collections.sort(avengersCharacters);
        System.out.println(avengersCharacters);
        System.out.println(avengersCharacters.contains("Hulk") && avengersCharacters.contains("Iron Man"));


        System.out.println("\n----------------------Task-7----------------------\n");

        ArrayList<Character> characters = new ArrayList<>(Arrays.asList('A', 'x', '$', '%', '9', '*', '+', 'F', 'G'));
        System.out.println(characters);
        for(char element : characters){
            System.out.println(element);
        }

        System.out.println("\n----------------------Task-8----------------------\n");

        ArrayList<String> stuff = new ArrayList<>(Arrays.asList("Desk", "Laptop", "Mouse", "Monitor", "Mouse-Pad", "Adapter"));
        System.out.println(stuff);
        Collections.sort(stuff);
        System.out.println(stuff);
        int startsM = 0;
        int noAorE = 0;
        for(String element : stuff){
            if(element.toLowerCase().startsWith("m")) startsM++;
            if(!element.toLowerCase().contains("e") && !element.toLowerCase().contains("a")) noAorE++;
        }
        System.out.println(startsM);
        System.out.println(noAorE);

        System.out.println("\n----------------------Task-9----------------------\n");

        ArrayList<String> kitchenObjects = new ArrayList<>(Arrays.asList("Plate", "spoon", "fork", "Knife", "cup", "Mixe"));
        System.out.println(kitchenObjects);
        int upper = 0;
        int lower = 0;
        int hasP = 0;
        int startOrEndsWithP = 0;
        for (String element : kitchenObjects) {
            if(Character.isUpperCase(element.charAt(0))) upper++;
            if(Character.isLowerCase(element.charAt(0))) lower++;
            if(element.toLowerCase().contains("p")) hasP++;
            if(element.toLowerCase().startsWith("p") || element.toLowerCase().endsWith("p")) startOrEndsWithP++;
        }
        System.out.println("Elements starts with uppercase = " + upper);
        System.out.println("Elements starts with lowercase = " + lower);
        System.out.println("Elements having P or p = " + hasP);
        System.out.println("Elements starting or ending with P or p = " + startOrEndsWithP);


        System.out.println("\n----------------------Task-10----------------------\n");

        ArrayList<Integer> numbers10 = new ArrayList<>(Arrays.asList(3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78));
        System.out.println(numbers10);

        int dividedBy10 = 0;
        int greaterThan15 = 0;
        int lessThan20 = 0;
        int less15Greater50 = 0;

        for(int n : numbers10){
            if(n % 10 == 0) dividedBy10++;
            if(n % 2 == 0 && n > 15) greaterThan15++;
            if(n % 2 == 1 && n < 20) lessThan20++;
            if(n < 15 || n > 50) less15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + dividedBy10);
        System.out.println("Elements that are even and greater than 15 = " + greaterThan15);
        System.out.println("Elements that are odd and less than 20 = " + lessThan20);
        System.out.println("Elements that are less than 15 or greater than 50 = " + less15Greater50);










    }
}
