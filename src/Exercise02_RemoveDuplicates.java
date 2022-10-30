import java.util.ArrayList;
import java.util.Arrays;

public class Exercise02_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<>(Arrays.asList("Java", "JavaScript", "Ruby", "Go", "Java","Ruby", "Java"));
        ArrayList<String> uniques = new ArrayList<>();

        for(String language : languages){
            if(!uniques.contains(language))
                uniques.add(language);
        }
        System.out.println(uniques);
    }
}
