package utilities;

public class MathHelper {
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(Math.max(num1, num2), num3);
    }

    public static int minOfThree(int num1, int num2, int num3) {
        return Math.min(Math.min(num1, num2), num3);
    }

    public static int middleOfThree(int num1, int num2, int num3) {
        int max = maxOfThree(num1, num2, num3);
        int min = minOfThree(num1, num2, num3);
         /*
         if(num1 != min && num1 != max) return num1;
        else if(num2 != min && num2 != max) return num2;
        else return num3;   */
        return num1 + num2 + num3 - min - max; //return middle number
    }

    public static boolean isEven(int num) {
         return num % 2 == 0; // boolean even = num % 2 == 0 ? true : false
                               /*  if(num % 2 == 0) return true;
                               else return false;
                                */
    }

    public static boolean isOdd(int num){
        return num % 2 != 0; //return num % 2 == 1;
    }

    public static int sum(int num1, int num2){
         int sum = num1 + num2; // return num1 + num2;
        return sum;
    }
      // overloading method
      public static int sum(int num1, int num2, int num3){
          return num1 + num2 + num3;

      }
    public static double sum(double num1, double num2){
        return num1 + num2;

}
}