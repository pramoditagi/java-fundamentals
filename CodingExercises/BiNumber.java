package CodingExercises;

public class BiNumber {
  private int num1, num2;

  public BiNumber(int num1, int num2) {
    this.num1 = num1;
    this.num2 = num2;
  }

  int add() {
    return num1 + num2;
  }

  int multiply() {
    return num1 * num2;
  }

  void doubleNumbers() {
    num1 *= 2;
    num2 *= 2;
  }

  int getNumber1() {
    return num1;
  }

  int getNumber2() {
    return num2;
  }

  public static void main(String[] args) {
    BiNumber biNumber = new BiNumber(2, 3);
    System.out.println(biNumber.add());
    System.out.println(biNumber.multiply());

    biNumber.doubleNumbers();

    System.out.println(biNumber.getNumber1());
    System.out.println(biNumber.getNumber2());
  }
}
