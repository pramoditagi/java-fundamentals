package CodingExercises;

public class NumberUtils {
  public int getLastDigit(int number) {
    // Write your code here
    if (number == 0) {
      return 0;
    }

    if (number < 0) {
      return -1;
    }

    return (number % 10);
  }

  public int getNumberOfDigits(int number) {
    if (number == 0) {
      return 1;
    }

    if (number < 0) {
      return -1;
    }

    int noOfDigits = 0;
    while (number > 0) {
      number /= 10;
      noOfDigits++;
    }
    return noOfDigits;
  }

  public int getSumOfDigits(int number) {
    if (number < 0) {
      return -1;
    }

    if (number == 0) {
      return 0;
    }

    int digit = 0;
    int sum = 0;
    while (number > 0) {
      digit = number % 10;
      sum += digit;
      number /= 10;
    }
    return sum;
  }

  public int reverseNumber(int number) {
    if (number == 0) {
      return 0;
    }

    if (number < 0) {
      return -1;
    }

    int reversedNum = 0;
    int digit;
    while (number > 0) {
      digit = number % 10;
      number /= 10;
      reversedNum = reversedNum * 10 + digit;
    }
    return reversedNum;
  }

  public static void main(String[] args) {
    NumberUtils numberUtils = new NumberUtils();
    System.out.println(numberUtils.getLastDigit(12345));
    System.out.println(numberUtils.getNumberOfDigits(6));
    System.out.println(numberUtils.getSumOfDigits(1234));
    System.out.println(numberUtils.reverseNumber(123456));
  }
}
