package practice;

public class ReturnMethodPractices {
    public static void main(String[] args) {

        System.out.println(ReturnMethodPractices.findDifference(9, 57));
        System.out.println(ReturnMethodPractices.findDifference(57.9, 53.7));
        System.out.println(ReturnMethodPractices.isIncluded("John", "John Doe"));

    }
   public static  int findDifference(int n1, int n2){
        return Math.abs(n1 - n2);
   }
    public static  double findDifference(double n1, double n2){
        return Math.abs(n1 - n2);
    }
    public static boolean isIncluded(String str1, String str2){
        if(str1.length()>str2.length()) return str1.contains(str2);
        return str2.contains(str1); // return str1.contains(str2) || str2.contains(str1)

        }
    }




