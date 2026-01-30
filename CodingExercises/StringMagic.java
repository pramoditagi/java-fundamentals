package CodingExercises;

public class StringMagic {
  public int countUppercaseLetters(String str) {
    if (str == "") {
      return 0;
    }

    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i))) {
        count++;
      }
    }
    return count;
  }

  public boolean hasConsecutiveDuplicates(String str) {
    if (str.isEmpty() || str.length() == 1) {
      return false;
    }
    char previous = str.charAt(0);
    boolean bool = false;
    for (int i = 1; i < str.length(); i++) {
      if (previous == str.charAt(i)) {
        bool = true;
        break;
      } else {
        previous = str.charAt(i);
      }
    }
    return bool;
  }

  public int getRightmostDigit(String str) {
    boolean digit;
    int digitValue = 0;
    for (int i = str.length(); i >= 1; i--) {
      digit = Character.isDigit(str.charAt(i - 1));
      if (digit) {
        digitValue = Character.getNumericValue(str.charAt(i - 1));
        return digitValue;
      }
    }

    if (digitValue <= 0) {
      return -1;
    } else {
      return digitValue;
    }
  }

  public static void main(String[] args) {
    StringMagic sm = new StringMagic();
    System.out.println(sm.countUppercaseLetters("Hello WORLd"));
    System.out.println(sm.hasConsecutiveDuplicates("World"));
    System.out.println(sm.getRightmostDigit("5"));
  }
}
