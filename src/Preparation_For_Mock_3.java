import java.util.*;

public class Preparation_For_Mock_3 {
    public static void main(String[] args) {

//        Integer[] nums = {4,6,8,7,7,4,23,45,23};
//       System.out.println(max(nums));
//        System.out.println(min(nums));
//
//        System.out.println(nthMax(new ArrayList<Integer>(Arrays.asList(4,6,7,8,3,9)),3));
//        System.out.println(nthMin(new ArrayList<Integer>(Arrays.asList(4,6,7,8,3,9)),3));
//        System.out.println(Arrays.toString(nums));

        int[] n = {2,5,0,4};
        System.out.println(Arrays.toString(multiply2(n)));

        ArrayList<Integer> num = new ArrayList<>(Arrays.asList(-20,35, 70,4,5));
        System.out.println(max(num));

//
//
//        String[] arr = {"Java", "JavaScript", "Ruby", "Go", "Java","Ruby", "Java"};
//        System.out.println(Arrays.toString(remDuplicates(arr)));
       // System.out.println(Arrays.toString(removeDuplicates(arr)));

//        String str = "Java   is   fun  ";
//        System.out.println(removeExtraSpaces(str));
//
//        String str2 = "Hello";
//        System.out.println(replaceFirstLast(str2));
//
//        String[] str3 = {"Java","Apple","Book","apron"};
//        System.out.println(Arrays.toString(noA(str3)));
//
//        Integer[] numbers = {10, 11, 12, 13, 14, 15};
//        System.out.println(Arrays.asList(no3or5(numbers)));

//        String str = "abc123";
//        System.out.println(sumDigits(str));


    }
    ///////////////////removeDuplicates Looping Characters/////////////////////
    public static String[] removeDuplicates(String[] str) {
        ArrayList<String> unique = new ArrayList<>();
        for (String s : str) {
            if (!unique.contains(s))
                unique.add(s);
        }
        return unique.toArray(new String[0]);
    }
    ///////////////////removeDuplicates Looping Numbers/////////////////////
    public static Integer[] noNumberDuplicates(Integer[] nums){
        ArrayList<Integer> unique = new ArrayList<>();
        for (Integer num : nums) {
            if(!unique.contains(num))
                unique.add(num);
        }
        return unique.toArray(new Integer[0]);
    }
    ///////////////////removeDuplicates LinkedHashSet Numbers/////////////////////
    public static Integer[] noNumberDuplicates2(Integer[] nums){
        LinkedHashSet<Integer> unique = new LinkedHashSet<>(Arrays.asList(nums));
        return unique.toArray(new Integer[0]);
    }
    ///////////////////removeDuplicates LinkedHashSet Characters/////////////////////
    public static String[] remDuplicates(String[] str){
        LinkedHashSet<String> unique = new LinkedHashSet<>(Arrays.asList(str));
        return unique.toArray(new String[0]);
    }
    ///////////////////max TreeSet/////////////////////
    public static Integer max(Integer[] nums){
        TreeSet<Integer> max = new TreeSet<>(Arrays.asList(nums));
        return max.pollLast();
    }
    ///////////////////min TreeSet/////////////////////
    public static Integer min(Integer[] nums){
        TreeSet<Integer> min = new TreeSet<>(Arrays.asList(nums));
        return min.pollFirst();
    }

     ///////////////////Remove Extra Spaces/////////////////////
    public static String removeExtraSpaces(String str){
    return str.replaceAll("\\s+"," ").trim();
    }

     ///////////////////Replace first and last/////////////////////
    public static String replaceFirstLast(String str){
        return str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0);
    }
    ///////////////////Has Vowels/////////////////////
    /*
    Create a method called noA()
    -This method will take a String array argument and it
    will return a new array with all elements starting with A
    or a replaced with “###”
     */
    public static String[] noA(String[] str){
        String[] arr = new String[str.length];
        for(int i = 0; i < str.length; i++){
            if(str[i].toLowerCase().startsWith("a"))
                arr[i] = "XXX";
            else arr[i] = str[i];
        }
        return arr;
    }
    /*
    Create a method called no3or5()
    -This method will take an int array argument and it will
    return a new array with some elements replaced as below
    If element can be divided by 5, replace it with 99
    If element can be divided by 3, replace it with 100
    If element can be divided by both 3 and 5, replace it with
    101
     */
    public static Integer[] no3or5(Integer[] numbers){
        Integer[] arr = new Integer[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] % 15 == 0) arr[i] = 101;
            else if(numbers[i] % 5 == 0) arr[i] = 99;
            else if(numbers[i] % 3 == 0) arr[i] = 100;
            else arr[i] = numbers[i];
        }
        return arr;
    }

    ///////////////////Second Max/////////////////////
    public static Integer secondMax(Integer[] numbers){
        TreeSet<Integer> secondMax = new TreeSet<>(Arrays.asList(numbers));
        if(numbers.length < 2) return null;
        secondMax.pollLast();
        return secondMax.last();
    }
    ///////////////////Sum digits in String/////////////////////
    public static int sumDigits(String str){
        char[] c = str.toCharArray();
        int sum = 0;
        for (char element : c) {
            if(Character.isDigit(element))
                sum += Character.getNumericValue(element);
            // sum += Integer.parseInt(String.valueOf(element));
        }
        return sum;
    }

    ///////////////////nth max and min/////////////////////
    public static Integer nthMax(List<Integer> list, int nth){
        TreeSet<Integer> nums = new TreeSet<>(list);
        if(nums.size() < nth) return null;

        for (int i = 1; i <= nth-1; i++) {
            nums.pollLast();
        }
        return nums.last();
    }

    public static Integer nthMin(List<Integer> list, int nth){
        TreeSet<Integer> numbers = new TreeSet<>(list);
        if(numbers.size() < nth) return null;

        for (int i = 1; i <= nth-1; i++) {
            numbers.pollFirst();
        }
        return numbers.first();
    }

    public static int[] multiply2(int[] nums){
        for (int i = 0; i < nums.length; i++) {
            nums[i] *= 2;
        }
        return nums;
    }

    public static Integer max(ArrayList<Integer> nums){
        TreeSet<Integer> max = new TreeSet<>(nums);
        return max.pollLast();
    }







}
