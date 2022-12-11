package date_time;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class DurationAndPeriod {
    public static void main(String[] args) {

        // how many days passed since you were born
        // currentDate - dateOfBirth

        LocalDate today = LocalDate.now();
        LocalDate dateOfBirth = LocalDate.of(1993, Month.OCTOBER,7);
        System.out.println(today);
        System.out.println(dateOfBirth);
        System.out.println(Period.between(dateOfBirth,today).getYears()); // 29
        System.out.println(Period.between(dateOfBirth,today).getMonths()); // 2
        System.out.println(Period.between(dateOfBirth,today).getDays()); // 4

        // using ChronoUnit

        System.out.println(ChronoUnit.YEARS.between(dateOfBirth, today)); // 29
        System.out.println(ChronoUnit.MONTHS.between(dateOfBirth, today)); // 350
        System.out.println(ChronoUnit.WEEKS.between(dateOfBirth, today)); // 1522
        System.out.println(ChronoUnit.DAYS.between(dateOfBirth, today)); // 10657

        LocalTime localTime1 = LocalTime.of(12,44,15);
        LocalTime localTime2 = LocalTime.of(13,45,45);

        System.out.println(Duration.between(localTime1, localTime2).getSeconds());

        //ChronoUnit

        System.out.println(ChronoUnit.HOURS.between(localTime1, localTime2)); // 1
        System.out.println(ChronoUnit.MINUTES.between(localTime1, localTime2)); // 61
        System.out.println(ChronoUnit.SECONDS.between(localTime1, localTime2));  // 3690




    }
}
