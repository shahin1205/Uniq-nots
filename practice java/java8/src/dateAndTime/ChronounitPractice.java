package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChronounitPractice {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2023,12,13);
        LocalDate date1=LocalDate.of(2024,11,10);
        long s= ChronoUnit.MONTHS.between(date,date1);
        long s1=ChronoUnit.DAYS.between(date,date1);
        long s2=ChronoUnit.YEARS.between(date,date1);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);

        LocalDate date2=LocalDate.now();
        LocalDate res=date.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(res);

    }
}
