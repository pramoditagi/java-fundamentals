package PracticePrograms;

public class IfStatementPrograms {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;
    int d = 40;

    if (a + b > c + d) {
      System.out.println("a + b is greater than c + d");
    }

    int angle1 = 60;
    int angle2 = 30;
    int angle3 = 90;

    // Note: to form a triangle, sum of three angles should be 180.
    if (angle1 + angle2 + angle3 == 180) {
      System.out.println("These angles form a triangle");
    }

    int number = 4;
    if (number % 2 == 0) {
      System.out.println("Number is an even number");
    }
  }
}
