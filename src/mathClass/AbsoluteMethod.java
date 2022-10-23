package mathClass;

import java.util.Scanner;

public class AbsoluteMethod {
    public static void main(String[] args) {
        System.out.println("Difference between your numbers is " + Math.abs(10 - 14));
        System.out.println("Difference between your numbers is " + (10 - 14));
        System.out.println("Difference between your numbers is " + Math.abs(14 - 10));

        Scanner input = new Scanner(System.in);
        int age1, age2;
        System.out.println("Please enter firs age: ");
        age1 = input.nextInt();
        System.out.println("Please enter second age: ");
        age2 = input.nextInt();
        System.out.println("Difference between your ages is " + Math.abs(age1 - age2));
        System.out.println("Max of the ages is " + Math.max(age1, age2));
        System.out.println("Min of the ages is " + Math.min(age1, age2));




    }
}
