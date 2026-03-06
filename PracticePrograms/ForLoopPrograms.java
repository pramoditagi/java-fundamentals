package PracticePrograms;

public class ForLoopPrograms {
  public static void main(String[] args) {
    // Multiplication table for 7
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 7, i, 7 * i).println();
    }

    // Multiplication table for 6
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 6, i, 6 * i).println();
    }

    // Multiplication table for 10
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 10, i, 10 * i).println();
    }

    // Print numbers from 1 to 10
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }

    // Print numbers from 10 to 1
    for (int i = 10; i >= 1; i--) {
      System.out.println(i);
    }

    // Print squares of first 10 numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println(i * i);
    }

    // Print squares of first 10 even numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println((2 * i) * (2 * i));
    }

    // Print squares of first 10 odd numbers
    for (int i = 1; i <= 10; i++) {
      System.out.println(((2 * i) - 1) * ((2 * i) - 1));
    }
  }
}
