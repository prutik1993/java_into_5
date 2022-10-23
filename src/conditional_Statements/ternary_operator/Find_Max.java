package conditional_Statements.ternary_operator;

public class Find_Max {
    public static void main(String[] args) {
        int num1 =(int)(Math.random() * 25) + 1;
        int num2 =(int)(Math.random() * 25) + 1;
        System.out.println("The random number 1 = " + num1);
        System.out.println("The random number 1 = " + num2);
        System.out.println("------Solution with Math Class---------");
        int max1 = Math.max(num1, num2);
        System.out.println(max1);

        System.out.println("------Solution with if-else-----------");
        int max2 = Integer.MIN_VALUE;
       // System.out.println(max2);

        if(num1 > num2) max2 = num1;
        else max2 = num2;
        System.out.println(max1);

        System.out.println("------Solution with ternary-----------");

        int max3 = num1 > num2 ? num1 : num2;
        System.out.println(max3);


    }
}
