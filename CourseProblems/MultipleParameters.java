package CourseProblems;

public class MultipleParameters {
  public static void main(String[] args) {
    int total = sum(5, 3);
    System.out.println("Total: " + total);

    // Call method
    sum(1, 2, 3);
  }

  // Multiple parameters and return
  // using int as a return type to return value
  static int sum(int a, int b) {
    return a + b;
  }

  // Using void as no values are getting returned
  static void sum(int a, int b, int c) {
    int sum = a + b + c;
    System.out.println(sum);
  }
}
