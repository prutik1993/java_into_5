package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Practice07_ProductPrice {
    public static void main(String[] args) {

        /*
        iPhone -> 1000
        Macbook Pro -> 1300
        iMac -> 1500
        Airpods -> 200
        iPod -> 700

        Expected:
        iMac is the most expensive with the price of $1500

        Task 1:
        find the most expensive product and print as below
         */

        HashMap<String,Double> items = new HashMap<>();
        items.put("Iphone",1000.0);
        items.put("Macbook Pro",1300.0);
        items.put("iMac",1500.0);
        items.put("Airpods",200.0);
        items.put("iPod",700.0);

        double maxPrice = new TreeSet<>(items.values()).last();

        for (Map.Entry<String, Double> entry : items.entrySet()) {
            if(entry.getValue() == maxPrice){
                System.out.println(entry.getKey() +
                 " is the most expensive with the price $ " +
                    entry.getValue());
                break;
            }
        }







    }
}
