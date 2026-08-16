package dateAndTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Time {
    public static void main(String[] args) {
        LocalTime time=LocalTime.now();
        System.out.println(time);
//        LocalTime time=LocalTime.of(4,30,23);
//        System.out.println(time);
//        LocalTime time=LocalTime.parse("04:30:23.654");
//        System.out.println(time);

        System.out.println(time.format(DateTimeFormatter.ofPattern("hh-mm-s a")));

    }
}
