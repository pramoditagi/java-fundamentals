package CodingExercises;

public class LongestWord {

  public String longestWordString(String sentence) {
    if (sentence.isEmpty()) {
      return "";
    }

    String[] polishedString = sentence.trim().split(" ");
    String longestString = "";
    for (String newString : polishedString) {
      if (newString.length() > longestString.length()) {
        longestString = newString;
      }
    }
    return longestString;
  }

  public static void main(String[] args) {
    LongestWord longestWord = new LongestWord();
    System.out.println(longestWord.longestWordString("java is an object oriented programming language"));
    System.out.println(longestWord.longestWordString(""));
    System.out.println(longestWord.longestWordString("   Pramod is   a good guy"));
  }
}
