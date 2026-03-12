package PracticePrograms;

public class StringMagic {
  public int countUppercaseLetters(String str) {
    if (str.isEmpty()) {
      return 0;
    }

    int count = 0;
    char ch;
    for (int i = 0; i < str.length(); i++) {
      ch = str.charAt(i);
      if (Character.isUpperCase(ch)) {
        count++;
      }
    }
    return count;
  }

  public boolean hasConsecutiveDuplicates(String str) {
    if (str.isEmpty())
      return false;

    int previous = 0;
    int current = 1;
    while (current != str.length()) {
      if (str.charAt(previous) == str.charAt(current)) {
        return true;
      } else {
        current++;
        previous++;
      }
    }
    return false;
  }

  public int getRightmostDigit(String str) {

    if (str.isEmpty())
      return -1;

    int number = 0;
    for (int i = str.length() - 1; i >= 0; i--) {
      if (Character.isDigit(str.charAt(i))) {
        number = Character.getNumericValue(str.charAt(i));
        return number;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    StringMagic stringMagic = new StringMagic();
    int uppercaseLetters = stringMagic.countUppercaseLetters("Hello WORLd");
    System.out.println(uppercaseLetters);

    System.out.println(stringMagic.hasConsecutiveDuplicates("Hello"));
    System.out.println(stringMagic.getRightmostDigit("I bought 5 apples, 4 bananas, and 3 oranges"));
  }
}
