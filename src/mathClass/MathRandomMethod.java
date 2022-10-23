package mathClass;

public class MathRandomMethod {
    public static void main(String[] args) {
        double myRandom = Math.random();
        int myRandomBetween0to10 = (int)(Math.random() * 10);
        // System.out.println("Random number is = " + Math.random());
        System.out.println("Random number is = " + myRandom);
        System.out.println("Random number between 1 to 10 = " + myRandomBetween0to10);

        int myRandomNumberBetween20to40 = (int)(Math.random() * (40 - 20 +1) + 20);
        System.out.println("My random number is " + myRandomNumberBetween20to40);
        //(int)(randomNumber * (big point - small point + 1) + small point)



    }
}
