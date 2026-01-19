package CourseProblems;

public class Multiplication {
  public static void main(String[] args) {
    // 5 table
    int number = 5;
    for (int i = 1;i <= 10; i++) {
      System.out.printf("%d * %d = %d", number, i, number * i).println();
    }

    // 7 table
    number = 7;
    for (int i = 1;i <= 10; i++) {
      System.out.printf("%d * %d = %d", number, i, number * i).println();
    }

    // 6 table
    number = 6;
    for (int i = 1;i <= 10; i++) {
      System.out.printf("%d * %d = %d", number, i, number * i).println();
    }

    // 10 table
    for (int i = 1;i <= 10; i++) {
      System.out.printf("%d * %d = %d", number, i, number * i).println();
    }

    // Print numbers from 1 to 10
    for (int i = 1;i <= 10; i++) {
      System.out.println(i);
    }

    // Print numbers from 10 to 1
    for (int i = 10;i >= 1; i--) {
      System.out.println(i);
    }

    // Print squares of first 10 even numbers
    for (int i = 2;i <= 20; i+=2) {
      System.out.println(i);
    }

    // Print squares of first 10 odd numbers
    for (int i = 1;i <= 20; i+=2) {
      System.out.println(i);
    }

    // Empty statement
    int j = 2;
    int i = 1;
    for (i = 2, j = 2;i <= 20; i++, j++);
  }
}
