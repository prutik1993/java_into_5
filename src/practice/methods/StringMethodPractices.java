package practice.methods;

public class StringMethodPractices {
    public static void main(String[] args) {
        System.out.println(StringMethodPractices.isCharExisting("John", 'o', 1));
        System.out.println();

    }
    public static boolean isCharExisting(String str, char c, int index){
       return  str.charAt(index) == c;
    }
    public static boolean isCharContained(String str, char a){
        return str.contains(a + ""); // String.valueOf(a)
    }
   



}
