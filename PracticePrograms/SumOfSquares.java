package PracticePrograms;

public class SumOfSquares {
  public long calculateSumOfSquares(int n) {
    if (n < 0) {
      return -1;
    }
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += (i * i);
    }
    return sum;
  }

  public static void main(String[] args) {
    SumOfSquares sos = new SumOfSquares();
    System.out.println("Sum of squares: " + sos.calculateSumOfSquares(4));
  }
}
