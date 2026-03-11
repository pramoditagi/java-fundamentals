package PracticePrograms;

public class LeapYearChecker {
  public boolean isLeapYear(int year) {
    if (year < 1) {
      return false;
    }

    if (year % 4 == 0) {
      if (year % 100 != 0) {
        return true;
      } else if (year % 400 == 0) {
        return true;
      } else {
        return false;
      }
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    LeapYearChecker leapYearChecker = new LeapYearChecker();
    System.out.println(leapYearChecker.isLeapYear(2100));
  }
}
