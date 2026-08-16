package dateAndTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);

        LocalDate date1=LocalDate.of(2000,05,12);
        System.out.println(date1);
        LocalDate date2=LocalDate.parse("2000-12-05");
        System.out.println(date2);

        /////instance methods:
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.isLeapYear());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.plusDays(10));
        System.out.println(date.minusMonths(4));
        System.out.println(date.withDayOfMonth(4));


        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate=date.format(formatter);
        System.out.println("Formatted date - "+formattedDate);

        System.out.println("formatted one line - "+ date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }
}
