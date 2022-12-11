package recursion;

import utilities.ScannerHelper;

public class understandingRecursion {

    public static void print(){
        System.out.println("Hello");
        print();
    }

    // create a method that prints number from 1 to given positive number - iterative way
    public static void printNumbers(int end){
        for (int i = 1; i <= end; i++) {
            System.out.println(i);
        }
    }

    public static void printNumbersRecursively(int end){
        if(end == 0) return;
        printNumbersRecursively(end - 1);
    }

    public static void main(String[] args) {
        //print(); // StackOverFlowError

        printNumbers(5);
        printNumbersRecursively(5);


    }
}
