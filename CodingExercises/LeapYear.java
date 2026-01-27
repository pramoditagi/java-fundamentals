package CodingExercises;

public class LeapYear {
  public boolean isLeapYear(int year) {
       if (year <=0)
        return false;  
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
      LeapYear leapYear = new LeapYear();
      System.out.println(leapYear.isLeapYear(2100));
  }  
}
