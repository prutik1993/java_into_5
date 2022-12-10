package exception_handling.try_catch;

import com.sun.corba.se.impl.encoding.CDROutputObject;
import utilities.ScannerHelper;

public class TryCatch_Practice02 {
    public static void main(String[] args) {

        int n1 = ScannerHelper.getANumber();
        int n2 = ScannerHelper.getANumber();
        try{
            System.out.println(n1 / n2);
        }
        catch(ArithmeticException e){
            e.printStackTrace();
        }
        System.out.println("End of the program!");
    }
}
