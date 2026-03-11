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

  public int calculateLCM() {
    if (number1 < 0 || number2 < 0)
      return -1;

    if (number1 == 0 || number2 == 0)
      return 0;

    int max = Math.max(number1, number2);
    int lcm = max;

    while (lcm % number1 != 0 || lcm % number2 != 0) {
      lcm += max;
    }
    return lcm;
  }

  public int calculateGCD() {
    if (number1 < 0 || number2 < 0)
      return 1;

    if (number1 == 0 || number2 == 0)
      return 0;

    if (number1 == number2)
      return number1;

    int smallest = Math.min(number1, number2);
    int gcd = 0;

    for (int i = smallest; i > 1; i--) {
      if (number1 % i == 0 && number2 % i == 0) {
        gcd = i;
        break;
      }
    }
    return gcd;
  }

  public static void main(String[] args) {
    BiNumber biNumber = new BiNumber(48, 18);
    System.out.println(biNumber.calculateLCM());
    System.out.println(biNumber.calculateGCD());

    System.out.println(biNumber.add());
    System.out.println(biNumber.multiply());

    biNumber.doubleNumbers();

    System.out.println(biNumber.getNumber1());
    System.out.println(biNumber.getNumber2());
  }
}
