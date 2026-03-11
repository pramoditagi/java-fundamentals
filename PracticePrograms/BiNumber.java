package PracticePrograms;

public class BiNumber {

  private int number1, number2;

  public BiNumber(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  int add() {
    return number1 + number2;
  }

  int multiply() {
    return number1 * number2;
  }

  void doubleNumbers() {
    this.number1 = 2 * number1;
    this.number2 = 2 * number2;
  }

  int getNumber1() {
    return number1;
  }

  int getNumber2() {
    return number2;
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
