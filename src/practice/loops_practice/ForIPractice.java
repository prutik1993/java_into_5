package practice.loops_practice;

public class ForIPractice {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++){ /// 1, 2, 3, 4, 5
            System.out.println("Number " + (i + 1));
        }
        System.out.println("Number " + "1");
        System.out.println("Number " + "-1");

        System.out.println("Number " + "2");
        System.out.println("Number " + "-2");

        System.out.println("Number " + "3");
        System.out.println("Number " + "-3");

        System.out.println("Number " + "4");
        System.out.println("Number " + "-4");

        System.out.println("Number " + "5");
        System.out.println("Number " + "-5");

        for (int i = 1, j = -1; i < 6 && j > -6; i ++, j --){
             System.out.println("Number " + i);
             System.out.println("Number " + j);
         }

    }
}
