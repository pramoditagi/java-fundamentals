package PracticePrograms;

public class MyChar {

  private char ch;

  public MyChar(char ch) {
    this.ch = ch;
  }

  boolean isVowel() {
    return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
  }

  boolean isConsonant() {
    return isAlphabet() && !(isVowel());
  }

  boolean isNumber() {
    return ch >= 48 && ch <= 57;
  }

  boolean isAlphabet() {
    return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122);
  }

  // Note: If we are not using any data from the object, we can create method
  // as static.
  // For static, we need to use ClassName to call a method.
  // Example: MyChar.printLowerCaseAlphabets()
  static void printLowerCaseAlphabets() {
    for (char ch = 97; ch <= 122; ch++) {
      System.out.println(ch);
    }
  }

  static void printUpperCaseAlphabets() {
    for (char ch = 65; ch <= 90; ch++) {
      System.out.println(ch);
    }
  }

  public static void main(String[] args) {
    MyChar myChar = new MyChar('c');
    System.out.println(myChar.isVowel());
    System.out.println(myChar.isConsonant());
    System.out.println(myChar.isNumber());
    System.out.println(myChar.isAlphabet());
    MyChar.printLowerCaseAlphabets();
    MyChar.printUpperCaseAlphabets();
  }
}
