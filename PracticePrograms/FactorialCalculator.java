package PracticePrograms;

public class FactorialCalculator {
  public int calculateFactorial(int number) {
    if (number < 0)
      return -1;
    int fact = 1;
    while (number > 0) {
      fact *= number;
      number--;
    }
    return fact;
  }

  public static void main(String[] args) {
    FactorialCalculator factorialCalculator = new FactorialCalculator();
    System.out.println(factorialCalculator.calculateFactorial(0));
  }
}
