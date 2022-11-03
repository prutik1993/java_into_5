package practice.arrayListPractices;

import java.util.ArrayList;
import java.util.Arrays;

public class FindCommonElement {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(40, 60, 60, 30, 70, 80));
        ArrayList<Integer> numbers1 = new ArrayList<>(Arrays.asList(20, 60, 70, 100, 300));
        commonElements(numbers,numbers1);
    }
    public static void commonElements(ArrayList<Integer> numbers,ArrayList<Integer> numbers1){
        ArrayList<Integer> common = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = 0; j < numbers1.size(); j++) {
                if(numbers.get(i).equals(numbers1.get(j)) && !common.contains(numbers.get(i)))
                   common.add(numbers.get(i));

            }

        }
        if(common.isEmpty()) System.out.println("There is no matching elements");
        else common.forEach(System.out::println);

    }
}
