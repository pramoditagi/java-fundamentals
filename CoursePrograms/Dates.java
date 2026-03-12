package CoursePrograms;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {
  public static void main(String[] args) {
    /*
     * These are the classes used for the dates. These are immutable classes
     * 
     * To use them, we need to import below package
     * java.time.LocalDate;
     * java.time.LocalTime;
     * 
     * LocalDate -> Date
     * LocalDateTime -> Date and Time
     * LocalTime -> Time
     */

    /*
     * LocalDate:
     * This class is used to work on "only dates" and it can be used to get current
     * date
     */
    LocalDate now = LocalDate.now();
    System.out.println(now);
    // 2026-03-12
    System.out.println(now.getYear()); // 2026
    System.out.println(now.getMonth()); // MARCH

    LocalDate yesterday = LocalDate.of(2026, 03, 12);
    System.out.println(yesterday);

    /*
     * LocalTime:
     * This class is used to work on "only time" and it can be used to get current
     * time
     */
    LocalTime now1 = LocalTime.now();
    System.out.println(now1);
    // 23:59:24.996954

    /*
     * LocalDateTime:
     * This class is used to work on "date and time" and it can be used to get
     * current date and time
     */
    LocalDateTime now2 = LocalDateTime.now();
    System.out.println(now2);
    // 2026-03-13T00:04:48.696211
  }
}
