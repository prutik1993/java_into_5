package practice.arrayListPractices;

public class FooBarPractice {
    public static void main(String[] args) {

        printLucky();
        fooBar();

    }

    public static void printLucky(){
        for (int i = 1; i <= 10 ; i++) {
            if(i % 3 == 0) System.out.println("Lucky");
            else System.out.println(i);
        }
    }

    public static void fooBar(){
        for (int i = 1; i <= 10; i++) {
            if(i % 5 == 0 && i % 2 == 0) System.out.println("FooBar");
            else if(i % 5 == 0) System.out.println("Bar");
            else if( i % 2 == 0) System.out.println("Foo");
            else System.out.println(i);
        }
    }


}
