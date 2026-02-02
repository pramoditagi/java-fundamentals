package CodingExercises;

public class StringArray {
  public static void main(String[] args) {
    String[] days = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
    for (String day : days) {
      System.out.println(day);
    }

    String longestString = "";
    for (String day : days) {
      if (day.length() >= longestString.length()) {
        longestString = day;
      }
    }
    System.out.println("Longest String: " + longestString);

    for (int i = days.length - 1; i >= 0; i--) {
      System.out.println(days[i]);
    }
  }
}
