package loops.fori_loops;

import utilities.ScannerHelper;

public class Exercise06_printEvenNumbersUsingScanner {
    public static void main(String[] args) {
        int num1 = ScannerHelper.getANumber();
        int num2 = ScannerHelper.getANumber();
        int max = Math.max(num1, num2);
        int min = Math.min(num1, num2);
        for (int i = min; i <= max ; i++) {
            if(i % 2 == 0) System.out.println(i);
        }
    }
}
