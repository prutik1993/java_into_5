package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListPractice {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        System.out.println(numbers);
        System.out.println("1. " + numbers);
        System.out.println("2. " + numbers);
        System.out.println("3. " + numbers);

        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.get(i) == 2) numbers.set(i, 7);
        }

        Iterator<Integer> numberIterator = numbers.iterator();
        while(numberIterator.hasNext()){
            Integer num = numberIterator.next();
            if(num % 2 == 0) numberIterator.remove();
        }

        for (int i = 0; i < 3; i++) {
            numbers.add(10);
        }
        System.out.println(numbers);
    }
}
