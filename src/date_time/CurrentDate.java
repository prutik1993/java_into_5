package date_time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class CurrentDate {
    public static void main(String[] args) {

        System.out.println("\n__________Date Class__________\n");

        Date date = new Date();
        System.out.println(date); // Sun Dec 11 11:13:21 CST 2022

        System.out.println("\n__________LocalDate Class__________\n");

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate); //2022-12-11 yyyy-MM-dd format of local date
        System.out.println(localDate.plusDays(7));

        System.out.println("\n__________LocalTime Class__________\n");

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime); // 11:18:46.643  hh:mm:ss.SSS

        System.out.println("\n__________LocalDateTime Class__________\n");

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime); // 2022-12-11T11:22:00.455  yyyy-MM-ddThh:mm:ss.SSS







    }
}
