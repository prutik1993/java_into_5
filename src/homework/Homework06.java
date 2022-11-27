package homework;

import java.util.Arrays;

public class Homework06 {
    public static void main(String[] args) {

        /*System.out.println("\n------------------------Task-1------------------------");

        int[] numbers = new int[10];

        numbers[2] = 23;
        numbers[4] = 12;
        numbers[7] = 34;
        numbers[9] = 7;
        numbers[6] = 15;
        numbers[0] = 89;
        System.out.println(numbers[3]);
        System.out.println(numbers[0]);
        System.out.println(numbers[9]);
        System.out.println(Arrays.toString(numbers));


        System.out.println("\n------------------------Task-2------------------------");

        String[] str = new String[5];

        str[1] = "abc";
        str[4] = "xyz";
        System.out.println(str[3]);
        System.out.println(str[0]);
        System.out.println(str[4]);
        System.out.println(Arrays.toString(str));


        System.out.println("\n------------------------Task-3------------------------");

        int[] ascending = {23, -34, -56, 0, 89, 100};

        System.out.println(Arrays.toString(ascending));
        Arrays.sort(ascending);
        System.out.println(Arrays.toString(ascending));


        System.out.println("\n------------------------Task-4------------------------");

        String[] countries = {"Germany", "Argentina", "Ukraine", "Romania"};

        System.out.println(Arrays.toString(countries));
        Arrays.sort(countries);
        System.out.println(Arrays.toString(countries));


        System.out.println("\n------------------------Task-5------------------------");

        String[] dogs = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};

        System.out.println(Arrays.toString(dogs));
        Arrays.sort(dogs);
        System.out.println(Arrays.binarySearch(dogs, "Pluto") >= 0);


        System.out.println("\n------------------------Task-6------------------------");

        String[] cats = {"Garfield", "Tom", "Sylvester", "Azrael"};

        Arrays.sort(cats);
        System.out.println(Arrays.toString(cats));
        System.out.println(Arrays.binarySearch(cats, "Garfield") >= 0 &&
                Arrays.binarySearch(cats, "Felix") >= 0);


        System.out.println("\n------------------------Task-7------------------------");

        double[] doubles = {10.5, 20.75, 70, 80, 15.75};

        System.out.println(Arrays.toString(doubles));
        for(double element : doubles){
            System.out.println(element);
        }




        System.out.println("\n------------------------Task-8------------------------");

        char[] characters = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};

        System.out.println(Arrays.toString(characters));
        int lower = 0;
        int upper = 0;
        int digits = 0;
        int special = 0;
        for(char character : characters){
            if(Character.isLowerCase(character)) lower++;
            else if(Character.isUpperCase(character)) upper++;
            else if(Character.isDigit(character)) digits++;
            else special++;
        }
        System.out.println("Letters = " + (upper + lower) +
                "\nUppercase letters = " + upper +
                "\nLowercase letters = " + lower +
                "\nDigits = " + digits +
                "\nSpecial characters = " + special);


        System.out.println("\n------------------------Task-9------------------------");

        String[] schoolStuff = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        System.out.println(Arrays.toString(schoolStuff));
        upper = 0;
        lower = 0;
        int startsBP = 0;
        int count = 0;

        for(String stuff : schoolStuff){
            if(Character.isUpperCase(stuff.charAt(0))) upper++;
            else if(Character.isLowerCase(stuff.charAt(0))) lower++;
            if(stuff.toLowerCase().startsWith("b") || stuff.toLowerCase().startsWith("p"))
                startsBP++;
            if(stuff.toLowerCase().contains("book") || stuff.toLowerCase().contains("pen"))
                count++;
        }
        System.out.println("Elements starts with uppercase = " + upper +
                "\nElements starts with lowercase = " + lower +
                "\nElements starting with B or P = " + startsBP +
                "\nElements having ”book” or “pen”= " + count);


        System.out.println("\n------------------------Task-10------------------------");

        int[] numbers3 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};
        System.out.println(Arrays.toString(numbers3));
        int more10 = 0;
        int less10 = 0;
        int is10 = 0;
        for(int number : numbers3){
            if( number == 10) is10++;
            else if(number > 10) more10++;
            else less10++;
        }
        System.out.println("Elements that are more than 10 = " + more10 +
                "\nElements that are less than 10 = " + less10 +
                "\nElements that are 10 = " + is10);


        System.out.println("\n------------------------Task-11------------------------");

        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};
        int[] third = new int[5];

        System.out.println("1st array is = " + Arrays.toString(first));
        System.out.println("2nd array is = " + Arrays.toString(second));
        for (int i = 0; i < first.length; i++) {
            third[i] = Math.max(first[i], second[i]);
        }
        System.out.println("3rd array is = " + Arrays.toString(third) );*/






    }
}
