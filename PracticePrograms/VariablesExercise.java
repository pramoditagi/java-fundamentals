package PracticePrograms;

public class VariablesExercise {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    int c = 30;

    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // update a
    a = 50;
    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();

    // update b
    b = 60;
    System.out.printf("%d + %d + %d = %d", a, b, c, a + b + c).println();
  }
}
