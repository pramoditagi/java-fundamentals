package CourseProblems;

public class Variables {
  public static void main(String[] args) {
    int a = 5;
    int b = 6;
    int c = 7;

    System.out.printf("Sum of %d, %d and %d = %d", a, b, c, a + b + c).println();

    // change the value of a
    a = 10;
    System.out.printf("a value changed to: %d", a).println();
    System.out.printf("Sum of %d, %d and %d = %d", a, b, c, a + b + c).println();

    // change the value of b
    b = 12;
    System.out.printf("b value changed to: %d", b).println();
    System.out.printf("Sum of %d, %d and %d = %d", a, b, c, a + b + c).println();
  }
}
