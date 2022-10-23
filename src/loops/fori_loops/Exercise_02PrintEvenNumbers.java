package loops.fori_loops;

public class Exercise_02PrintEvenNumbers {
    public static void main(String[] args) {
        /*
        Write a Java program to print only even numbers from bt 0 to 10 (0
        and 10 are included)
         */
        for (int i = 0; i <= 10; i++){ //(int i = 0; i <= 10; i+=2) -> not recommended
            if(i % 2 == 0) System.out.println(i);

        }
    }
}
