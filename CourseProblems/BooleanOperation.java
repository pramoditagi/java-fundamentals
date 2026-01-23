package CourseProblems;

public class BooleanOperation {
  public static void main(String[] args) {
      // && AND operator -> True of both are true. Otherwise false
      int i = 10;
      System.out.println(i > 5 && i < 10);

      // || OR -> True if either one is true or both are true. Otherwise false
      System.out.println(i > 5 || i < 10);

      // ! NOT -> Reverses value
      System.out.println(!(i < 5));

      // ^ XOR -> True if both are different from each other. If both are same, then false
      System.out.println(i > 5 ^ i < 10);

      // & -> Checks for both conditions
      System.out.println(i > 5 & i < 10);

      // | -> Checks for both conditions
      System.out.println(i > 5 | i < 10);
  }
}
