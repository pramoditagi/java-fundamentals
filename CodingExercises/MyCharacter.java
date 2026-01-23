package CodingExercises;

public class MyCharacter {

  private char ch;
  public MyCharacter(char ch) {
    this.ch = ch;
  }

  boolean isVowel() {
      return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'e' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
  }

  boolean isConsonant() {
    return (isAlphabet() && !isVowel());
  }

  // Tip: Use (int) 'A' or (int) 'a' to get ASCII number
  boolean isAlphabet() {
    return (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122); // Between "a" and "z" or "A" and "Z"
  }

  // Tip: Use (int) '1' to get ASCII number
  boolean isNumeric() {
    return (ch >= 48 && ch <= 57); // Between "0" and "9"
  }

  void printLowerCaseAlphabets() {
    for (char ch1 = 'a'; ch1 <= 'z'; ch1++) {
      System.out.println(ch1);
    }
  }

  void printUpperCaseAlphabets() {
    for (char ch1 = 'A'; ch1 <= 'Z'; ch1++) {
      System.out.println(ch1);
    }
  }
  

  public static void main(String[] args) {
      MyCharacter myChar = new MyCharacter('J');
      System.out.println(myChar.isVowel());
      System.out.println(myChar.isConsonant());
      System.out.println(myChar.isAlphabet());
      System.out.println(myChar.isNumeric());
      myChar.printLowerCaseAlphabets();
      myChar.printUpperCaseAlphabets();
  }
}
