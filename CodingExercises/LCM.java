package CodingExercises;

public class LCM {
  private int number1;
  private int number2;

  public LCM(int number1, int number2) {
    this.number1 = number1;
    this.number2 = number2;
  }

  public int getNumber1() {
    return number1;
  }

  public int getNumber2() {
    return number2;
  }

  public int calculateLCM() {
    if (number1 < 0 || number2 < 0) {
      return -1;
    }

    if (number1 == 0 || number2 == 0) {
      return 0;
    }

    int max = Math.max(number1, number2);
    int lcm = max;
    if (max % number1 == 0 && max % number2 == 0) {
      return lcm;
    }

    while (lcm % number1 != 0 || lcm % number2 != 0) {
      lcm += max;
    }
    return lcm;
  }

  public static void main(String[] args) {
    LCM lcm = new LCM(8, 6);
    System.out.println(lcm.calculateLCM());
  }
}
