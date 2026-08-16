package dateAndTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Challenge1 {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int year=sc.nextInt();
        int year = 2026;
        int month = 4;
        LocalDate date = LocalDate.of(year, month, 1);
        System.out.println(" " + date.getMonth() + " " + date.getYear());
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        DayOfWeek dayOfWeek = date.getDayOfWeek();
        int value = dayOfWeek.getValue(); // 1 (Mon) to 7 (Sun)
        int start = value % 7;

//        System.out.println(start);
        for (int i = 0; i < start; i++) {
            System.out.print("    "); // FIXED (print instead of println)
        }

        int totalDays = date.lengthOfMonth();
        for (int day = 1; day <= totalDays; day++) {
            System.out.printf("%3d ", day);

            if ((day + start) % 7 == 0) {
                System.out.println();
            }


        }
    }
}

