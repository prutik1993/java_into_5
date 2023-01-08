package homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework13 {

    //////////////////Task-1//////////////////
    public static boolean hasLowerCase(String str){
//        boolean hasLower = false;
//        for (int i = 0; i < str.length(); i++) {
//            if(Character.isLowerCase(str.charAt(i)))
//               hasLower = true;
//            break;
//        }
//        return hasLower;

        for (int i = 0; i < str.length(); i++) {
           if(Character.isLowerCase(str.charAt(i)))
               return true;
        }
        return false;
    }

    //////////////////Task-2//////////////////
    public static ArrayList<Integer> noZero(ArrayList<Integer> numbers){
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) == 0) {
//                numbers.remove(i);
//                i--;
//            }
//
//        }
//       return  numbers;
//        ArrayList<Integer> answer = new ArrayList<>();
//        for (Integer number : numbers) {
//            if(number != 0)
//                answer.add(number);
//        }
//        return answer;
        numbers.removeIf(e -> e == 0);
        return numbers;
    }

    //////////////////Task-3//////////////////
    public static int[][] numberAndSquare(int [] array){
        int[][] result = new int[array.length][2];
        for (int i = 0; i < array.length; i++) {
            result[i][0] = array[i];
            result[i][1] = array[i] * array[i];
        }
        return result;
    }

    //////////////////Task-4//////////////////
    public static boolean containsValue(String[] words, String str){
//        for (String word : words) {
//            if(word.equals(str))
//                return true;
//        }
//        return false;
       Arrays.sort(words);
       return Arrays.binarySearch(words,str) >= 0;

       // return Arrays.asList(words).contains(str);
    }

    //////////////////Task-5//////////////////
    public static String reverseSentence(String str){
        String[] array = str.split(" ");
        if(array.length < 2) return "There is not enough words!";
        StringBuilder sb = new StringBuilder();

        sb.append(array[array.length - 1].substring(0, 1).toUpperCase());
        sb.append(array[array.length - 1].substring(1));

        for(int i = array.length - 2; i > 0; i--){
            sb.append(" ");
            sb.append(array[i]);
        }
        sb.append(" ");
        sb.append(array[0].substring(0,1).toLowerCase());
        sb.append(array[0].substring(1));
        return sb.toString();

//        String reversedSent = "";
//        String[] arr = str.toLowerCase().split(" ");
//        if(arr.length < 2) return "There is not enough words!";
//        for (int i = arr.length-1; i >= 0; i--) {
//            reversedSent += arr[i] + " ";
//        }
//        return reversedSent.substring(0,1).toUpperCase() + reversedSent.substring(1, reversedSent.length()-1);
    }

    //////////////////Task-6//////////////////
    public static String removeStringSpecialsDigits(String str){
        str = str.replaceAll("[^A-Za-z ]","");
        return str;
    }

    //////////////////Task-7//////////////////
    public static String[] removeArraySpecialsDigits(String[] array){
       // String[] answer = new String[array.length];
        for (int i = 0; i < array.length; i++) {
           array[i] = removeStringSpecialsDigits(array[i]);
            //answer[i] = removeStringSpecialsDigits(array[i]);
        }
        return array;
    }

    //////////////////Task-8//////////////////
    public static ArrayList<String> removeAndReturnCommons(ArrayList<String> list, ArrayList<String> array){
        ArrayList<String> answer = new ArrayList<>();
        for (String l : list) {
            for (String a : array) {
                if(l.equals(a) && !answer.contains(l))
                    answer.add(l);
            }
        }
        return answer;
    }

    //////////////////Task-9//////////////////
    public static ArrayList<String> noXInVariables(ArrayList<String> arr){
        ArrayList<String> answer = new ArrayList<>();
        for (String s : arr) {
           String check = s.replaceAll("[xX]","");
            if (!check.isEmpty()) {
                answer.add(check);
            }
        }
        return answer;
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i).replaceAll("[xX]", "").equals("")){
//                arr.remove(i);
//                i--;
//            } else arr.set(i, arr.get(i).replaceAll("[xX]",""));
//        }
//        return arr;
    }

    public static void main(String[] args) {

        System.out.println("\n__________________Task-1__________________\n");

        String str1 = "";
        System.out.println(hasLowerCase(str1));
        str1 = "JAVA";
        System.out.println(hasLowerCase(str1));
        str1 = "123$";
        System.out.println(hasLowerCase(str1));
        str1 = "hello";
        System.out.println(hasLowerCase(str1));

       System.out.println("\n__________________Task-2__________________\n");

       ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1));
       System.out.println(noZero(numbers2));
       numbers2 = new ArrayList<>(Arrays.asList(1,1,10));
       System.out.println(noZero(numbers2));
       numbers2 = new ArrayList<>(Arrays.asList(0, 1, 10));
       System.out.println(noZero(numbers2));
       numbers2 = new ArrayList<>(Arrays.asList(0, 0, 0));
       System.out.println(noZero(numbers2));

       System.out.println("\n__________________Task-3__________________\n");

       int[] numbers3 = {1, 2, 3};
       System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
       numbers3 = new int[]{0, 3, 6};
       System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));
       numbers3 = new int[]{1,4};
       System.out.println(Arrays.deepToString(numberAndSquare(numbers3)));

       System.out.println("\n__________________Task-4__________________\n");

       String[] words4 = {"abc", "foo", "java"};
       System.out.println(containsValue(words4,"hello"));
       words4 = new String[]{"abc", "def", "123"};
       System.out.println(containsValue(words4,"Abc"));
       words4 = new String[]{"abc", "def", "123","Java", "Hello"};
       System.out.println(containsValue(words4,"123"));

       System.out.println("\n__________________Task-5__________________\n");

       String str5 = "Hello";
       System.out.println(reverseSentence(str5));
       str5 = "Java is fun";
       System.out.println(reverseSentence(str5));
       str5 = "This is a sentence";
       System.out.println(reverseSentence(str5));

       System.out.println("\n__________________Task-6__________________\n");

       String str6 = "123Java #$%is fun";
       System.out.println(removeStringSpecialsDigits(str6));
       str6 = "Selenium";
       System.out.println(removeStringSpecialsDigits(str6));
       str6 = "Selenium 123#$%Cypress";
       System.out.println(removeStringSpecialsDigits(str6));

       System.out.println("\n__________________Task-7__________________\n");

       String[] array = {"123Java", "#$%is", "fun"};
       System.out.println(Arrays.toString(removeArraySpecialsDigits(array)));
       array = new String[]{"Selenium", "123$%", "###"};
       System.out.println(Arrays.toString(removeArraySpecialsDigits(array)));
       array = new String[]{"Selenium", "123#$%Cypress"};
       System.out.println(Arrays.toString(removeArraySpecialsDigits(array)));

       System.out.println("\n__________________Task-8__________________\n");

       ArrayList<String> words7 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
       ArrayList<String> list7 = new ArrayList<>(Arrays.asList("abc", "xyz", "123"));
       System.out.println(removeAndReturnCommons(words7,list7));
       words7 = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
       list7 = new ArrayList<>(Arrays.asList("Java", "C#", "Python"));
       System.out.println(removeAndReturnCommons(words7,list7));
       words7 = new ArrayList<>(Arrays.asList("Java", "C#", "C#"));
       list7 = new ArrayList<>(Arrays.asList("Python", "C#", "C++"));
       System.out.println(removeAndReturnCommons(words7,list7));

       System.out.println("\n__________________Task-9__________________\n");

       ArrayList<String> arr = new ArrayList<>(Arrays.asList("abc", "123", "#$%"));
       System.out.println(noXInVariables(arr));
       arr = new ArrayList<>(Arrays.asList("xyz", "123", "#$%"));
       System.out.println(noXInVariables(arr));
       arr = new ArrayList<>(Arrays.asList("x", "123", "#$%"));
       System.out.println(noXInVariables(arr));
       arr = new ArrayList<>(Arrays.asList("xyXyxy", "Xx", "ABC"));
       System.out.println(noXInVariables(arr));
   }

}
