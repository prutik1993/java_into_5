package loops.while_loops;

public class Exercise01_PrintOddNumbers {
    public static void main(String[] args) {
        int start = 1;
        while(start <= 10){
            if(start % 2 == 1) System.out.println(start);
            start++;
        }
    }
}
