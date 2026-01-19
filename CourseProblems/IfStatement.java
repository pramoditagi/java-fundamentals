package CourseProblems;

public class IfStatement {
  public static void main(String[] args) {
    int a = 4;
    int b = 5;
    int c = 6;
    int d = 7;

    if (a + b > c +d) {
      System.out.println("a + b is greater than c + d");
    } else {
      System.out.println("c + d is greater than a + b");
    }
    int angle1 = 60;
    int angle2 = 70;
    int angle3 = 50;

    if (angle1 + angle2 + angle3 == 180) {
      System.out.println("It is a triangle");
    } else {
      System.out.println("It is not a triangle");
    }

    int number = 3;
    if (number % 2 == 0) {
      System.out.println("It is an even number");
    } else {
      System.out.println("It is an odd number");
    }
  }
}
