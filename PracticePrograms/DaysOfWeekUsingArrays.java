package PracticePrograms;

public class DaysOfWeekUsingArrays {
  String mostOfNumberLettersInDay(String[] daysOfWeek) {
    String longestDay = "";
    for (String day : daysOfWeek) {
      if (day.length() > longestDay.length()) {
        longestDay = day;
      }
    }
    return longestDay;
  }

  static void printDaysBackwards(String[] daysOfWeek) {
    for (int i = daysOfWeek.length - 1; i >= 0; i--) {
      System.out.println(daysOfWeek[i]);
    }
  }

  public static void main(String[] args) {
    String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    DaysOfWeekUsingArrays daysOfWeekUsingArrays = new DaysOfWeekUsingArrays();
    System.out.println(daysOfWeekUsingArrays.mostOfNumberLettersInDay(daysOfWeek));

    DaysOfWeekUsingArrays.printDaysBackwards(daysOfWeek);
  }
}
