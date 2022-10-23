package loops;

public class Exercise02_PrintNumbersAscending {
    public static void main(String[] args) {
        int start = 1;
        while(start <= 10){
            if(start != 10) System.out.print(start + " - ");
            else System.out.println(start);
            start++;
        }

           String result = "";
           for(int i = 1; i <= 10; i++){
               result += i + " - ";
           }
        System.out.println(result.substring(0, result.length()-3));
    }
}
