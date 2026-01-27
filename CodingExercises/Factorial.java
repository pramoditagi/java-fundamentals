package CodingExercises;

public class Factorial {
  public int calculateFactorial(int number) {
    if (number < 0) {
      return -1;
    }

    int fact = 1;
    while (number > 0) {
      fact *= number;
      number--;
    }
    return fact;
  }

  public static void main(String[] args) {
    Factorial factorial = new Factorial();
    System.out.println(factorial.calculateFactorial(1));
  }
}
