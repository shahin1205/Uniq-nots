package dateAndTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodAndDuration {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2023,12,13);
        LocalDate date1=LocalDate.of(2024,11,10);

        Period out=Period.between(date,date1);
        System.out.println(out.getDays());
        System.out.println(out.getMonths());
        System.out.println(out.getYears());

        LocalTime time=LocalTime.of(12,30);
        LocalTime time1=LocalTime.of(3,30);

        Duration out1=Duration.between(time,time1);
        System.out.println(out1.toHours());
        System.out.println(out1.toMinutes());
    }
}
