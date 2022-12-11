package date_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatDates {
    public static void main(String[] args) {

        System.out.println("\n____________Formatting Date_____________\n");
        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:34:44 CST 2022 EEEE MMM dd hh:mm:ss z yyyy  default format


        // Print the date in the format MM/dd/yyyy 12/11/2022
        SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(formatter.format(date)); //12/11/2022

        // print the date in the format yyyy 2022
        System.out.println(new SimpleDateFormat("yyyy").format(date)); // simplify
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(date)); // 11 o'clock AM, Central Standard Time
    }
}
