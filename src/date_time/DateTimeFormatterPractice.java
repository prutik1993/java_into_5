package date_time;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterPractice {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("MM/dd/yyyy"))); // 12/11/2022
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("EEE hh:mm a"))); // Sun 01:28 PM
        System.out.println(localDateTime.format(DateTimeFormatter.ofPattern("EEE HH:mm"))); // Sun 13:29
    }
}
