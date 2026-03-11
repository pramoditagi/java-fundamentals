package PracticePrograms;

public class NumberUtils {
  public int getLastDigit(int number) {
    if (number < 0)
      return -1;
    return number % 10;
  }

  public int getNumberOfDigits(int number) {
    if (number == 0)
      return 1;

    if (number < 0)
      return -1;

    int count = 0;
    while (number > 0) {
      count++;
      number /= 10;
    }
    return count;
  }

  public int getSumOfDigits(int number) {
    if (number < 0)
      return -1;

    if (number == 0)
      return 0;

    int sum = 0;
    int lastDigit = 0;
    while (number > 0) {
      lastDigit = number % 10;
      sum += lastDigit;
      number /= 10;
    }
    return sum;
  }

  public int reverseNumber(int number) {
    if (number < 0)
      return -1;

    if (number == 0)
      return 0;

    int lastDigit;
    int reversedNumber = 0;
    while (number > 0) {
      lastDigit = number % 10;
      number /= 10;
      reversedNumber = reversedNumber * 10 + lastDigit;
    }
    return reversedNumber;
  }

  public static void main(String[] args) {
    NumberUtils numberUtils = new NumberUtils();
    System.out.println(numberUtils.getLastDigit(123456));
    System.out.println(numberUtils.getNumberOfDigits(123456));
    System.out.println(numberUtils.getSumOfDigits(10203));
    System.out.println(numberUtils.reverseNumber(10203));
  }
}
