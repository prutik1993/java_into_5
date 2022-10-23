package arrays;

import java.util.Arrays;

public class SearchingInAStringArray {
    public static void main(String[] args) {

        System.out.println("\n--------------With loop-----------------");
        String[] objects = {"Remote", "Mouse", "Mouse", "Keyboard", "iPad"};
        boolean hasMouse = false;
        for(String element : objects){
            if(element.equals("Mouse")){
                hasMouse = true;
                break;
            }
        }
        System.out.println(hasMouse);

        System.out.println("\n--------------With binery search-----------------");
        Arrays.sort(objects);
        System.out.println(Arrays.binarySearch(objects, "Mouse") >= 0);
        System.out.println(Arrays.binarySearch(objects, "Computer") >= 0);
        System.out.println(Arrays.binarySearch(objects, "iPad") >= 0);
    }
}
