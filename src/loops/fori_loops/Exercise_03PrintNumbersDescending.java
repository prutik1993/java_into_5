package loops.fori_loops;

public class Exercise_03PrintNumbersDescending {
    public static void main(String[] args) {
        /*
        Write a Java program to print numbers backward starting from 100
        to 0 (100 and 0 are included)
         */
         for(int i = 100; i >= 0; i--){ // for(int i = 100; i != -1; i--)
             System.out.println(i);
         }
        System.out.println("End of the program!");
    }
}
