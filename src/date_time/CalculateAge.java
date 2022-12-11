package date_time;

import utilities.ScannerHelper;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class CalculateAge {
    public static void main(String[] args) {

        // Ask user to enter their age and find their date of birth
        int age = ScannerHelper.getAnAge();

        System.out.println("Your year of birth is = " + LocalDate.now().minus(age, ChronoUnit.YEARS).getYear());

        System.out.println("Your year of birth is = " + LocalDate.now().minusYears(age).getYear());

        System.out.println(LocalDate.now().getYear() - age);

        // ask user to enter their year of birth
        // calculate their age

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your date of year:");
        int dateOfYear = scanner.nextInt();

        System.out.println(LocalDate.now().getYear() - dateOfYear);


    }
}
