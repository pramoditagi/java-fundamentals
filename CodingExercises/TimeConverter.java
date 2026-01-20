package CodingExercises;

public class TimeConverter {
  public static int convertHoursToMinutes(int hours) {
        if (hours < 0) {
            return -1;
        }
        return hours * 60;
    }
    
    public static int convertDaysToMinutes(int days) {
        if (days < 0) {
            return -1;
        }
        return days * 24 * 60;
    }

    public static void main(String[] args) {
      System.out.println(TimeConverter.convertHoursToMinutes(55));
      System.out.println(TimeConverter.convertDaysToMinutes(2));
    }
}
