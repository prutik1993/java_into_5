package methods;

import utilities.RandomNumberGenerator;

public class RandomNumberPractices {
    public static void main(String[] args) {

        int random = RandomNumberGenerator.getARandomNumber(5, 15);
        int random2 = RandomNumberGenerator.getARandomNumber(25, 40);
        int random3= RandomNumberGenerator.getARandomNumber(65, 15);
        System.out.println(random);
        System.out.println(random2);
        System.out.println(random3);
    }
}
