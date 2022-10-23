package mathClass;

public class MinAndMaxMethod {
    public static void main(String[] args) {
        int maxNumber = Math.max(80, 27); // 80
        System.out.println(maxNumber);
        int maxNumber2 = Math.max(maxNumber, 45);
        System.out.println(maxNumber2);
        int maxNumber3 = Math.max(maxNumber2, 625);
        System.out.println(maxNumber3);

        int minNumber2 = Math.min(Math.min(80, 27), 2);
        System.out.println(minNumber2);
        int minOfTwoNeg = Math.min(-40, -60);
        System.out.println(minOfTwoNeg);
        double maxOfDecimals = Math.max(1.7, 6.5);
        System.out.println(maxOfDecimals);
        double maxOfTwoDecimalNeg = Math.max(-5.4, -27.2);
        System.out.println(maxOfTwoDecimalNeg);

        int maxOfTwoNumbers = Math.max(6, 9);
        System.out.println("maxOfTwoNumbers = " + maxOfTwoNumbers); // System.out.println("Max is " + Math.max(6, 9));
        int maxOfTwoNumbers2 = Math.max(17, 49);
        System.out.println("maxOfTwoNumbers2 = "+ maxOfTwoNumbers2);
        double maxOfTwoNumbers3 = Math.max(34.2, 12.5);
        System.out.println("maxOfTwoNumbers3 = " + maxOfTwoNumbers3);
        int maxOfTwoNumbers4 = Math.max(-14, -32); //System.out.println("Max is " + Math.max(34.2, 12.5));
        System.out.println("maxOfTwoNumbers4 = " + maxOfTwoNumbers4);
        int maxOfTwoNumbers5 = Math.max(Math.max(17, 49), 125);
        System.out.println("maxOfTwoNumbers5 = " + maxOfTwoNumbers5);


        System.out.println("min is " + Math.min(6, 9));
        System.out.println("min is " + Math.min(17, 49));
        System.out.println("mim is " + Math.min(34.2, 12.5));
        System.out.println("min is " + Math.min(-14, -32));
        System.out.println("min is " + Math.min(Math.min(17, 49), 125));
        System.out.println("min is " + Math.min(Math.min(Math.min(45,32),56),89));

















    }
}
