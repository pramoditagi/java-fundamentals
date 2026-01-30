package CourseProblems;

public class PrintfFunction {
  public static void main(String[] args) {
    // Printf function used to format the values
    // Used to print calculated values
    // Returns string with PrintStream
    System.out.printf("5 * 2 = 10");

    // Append println to print just like println function
    System.out.printf("5 * 2 = 10").println();

    // Example:
    // %d for numeric values
    // One value
    System.out.printf("5 * 2 = %d", 5 * 2).println();

    // 3 %d values
    System.out.printf("%d * %d = %d", 5, 7, 5 * 7).println();

    // 4 %d values
    System.out.printf("%d + %d + %d = %d", 5, 6, 7, 5 + 6 + 7).println();

    // %s for String
    System.out.printf("Hello %s", "Pramod").println();

    // %f for floating point values
    System.out.printf("%f + %f = %f", 5.2, 5.1, 5.2 + 5.1).println();

    // %.2f for floating point values up to 2 digits after decimal
    System.out.printf("%.2f + %.2f = %.2f", 5.2, 5.1, 5.2 + 5.1).println();
  }
}
