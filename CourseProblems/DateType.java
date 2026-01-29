package CourseProblems;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateType {
  public static void main(String[] args) {
    // LocalDate
    LocalDate now = LocalDate.now();
    System.out.println(now);
    System.out.println(now.getYear());
    System.out.println(now.getDayOfWeek());
    System.out.println(now.getDayOfMonth());
    System.out.println(now.getMonth());
    System.out.println(now.isLeapYear());
    // To add days to current date
    System.out.println(now.plusDays(100));

    // LocalDateTime
    LocalDateTime localDateTime = LocalDateTime.now();
    System.out.println(localDateTime);

    // LocalTime
    LocalTime localTime = LocalTime.now();
    System.out.println(localTime);

    // Setting date manually
    LocalDate yesterday = LocalDate.of(2026, 01, 28);
    System.out.println(yesterday);
  }
}
