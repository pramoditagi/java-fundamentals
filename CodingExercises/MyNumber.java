package CodingExercises;

public class MyNumber {

  private int number;

  public MyNumber(int number) {
    this.number = number;
  }

  public int sumUptoN() {
    return (number * (number + 1) / 2);
  }

  public int sumOfDivisors() {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        sum += i;
      }
    }
    return sum;
  }

  public boolean isPrime() {
    if (number <= 1) {
      return false;
    }
    int count = 0;
    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        count++;
      }
    }
    return count == 2;
  }

  public void printANumberTriangle() {
    for (int i = 1; i <= number; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print(j + " ");
      }
      System.out.println("");
    }
  }

  public static void main(String[] args) {
    MyNumber myNumber = new MyNumber(5);
    System.out.println(myNumber.isPrime());

    int sum = myNumber.sumUptoN();
    System.out.println("Sum: " + sum);

    int sumOfDivisors = myNumber.sumOfDivisors();
    System.out.println("Sum of divisors: " + sumOfDivisors);

    myNumber.printANumberTriangle();
  }
}
