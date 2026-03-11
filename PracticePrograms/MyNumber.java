package PracticePrograms;

public class MyNumber {

  private int number;

  public MyNumber(int number) {
    this.number = number;
  }

  boolean isPrime() {
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }

  int sumUpToN() {
    return number * (number + 1) / 2;
  }

  // Excluding 1 and number
  int sumOfDivisors() {
    int sum = 0;
    for (int i = 2; i < number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  void printANumberTriangle() {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    MyNumber myNumber = new MyNumber(1);
    System.out.println(myNumber.isPrime());
    int sum = myNumber.sumUpToN();
    System.out.println("Sum: " + sum);

    int sumOfDivisors = myNumber.sumOfDivisors();
    System.out.println("Sum of divisors: " + sumOfDivisors);
    myNumber.printANumberTriangle();
  }
}
