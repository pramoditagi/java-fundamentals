package CourseProblems;

public class IfElseStatement {
  public static void main(String[] args) {
    int i = 3;

    // If/else statement
    if (i == 3) {
      System.out.println("i is equal to 3");
    } else {
      System.out.println("i is not equal to 3");
    }

    // If/else if/else statement
    if (i == 3) {
      System.out.println("i is equal to 3");
    } else if (i == 2) {
      System.out.println("i is equal to 2");
    } else {
      System.out.println("i is neither equal to 3 nor 2");
    }

    // ternary operator
    boolean res = (i == 3 ? true : false);
    System.out.println(res);
  }
}
