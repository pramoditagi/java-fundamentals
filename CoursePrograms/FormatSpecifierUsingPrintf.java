package CoursePrograms;

public class FormatSpecifierUsingPrintf {
  public static void main(String[] args) {
    /*
     * printf: This can be used for format specifiers. If we want to
     * calculate anything and print the values, we can use printf
     * Note that printf doesn't have new line character like println
     */
    System.out.printf("5 * 2 = 10").println();

    /*
     * We need to use modifiers to print calculated values or to specify numbers in
     * printf statement
     * For integers: %d
     * For floating point values: %f
     * For Strings: %s
     * Note: Format specifiers passed and parameters passed must be same.
     * Otherwise it will throw an error (MissingFormatArgumentException)
     * (If Extra parameters passed than the mentioned format specifiers, then it
     * won't throw error. Just skip the extra ones)
     */

    /*
     * Note: Mentioned format specifiers and passed values must of same type.
     * Otherwise, it will throw IllegalFormatException
     * Example: System.out.printf("%d * %d = %d", 5.2, 2.2, 5.2 * 2.2).println();
     * This will throw error as format specifiers mentioned are %d for integer
     * but passed values are floating values
     */
    System.out.printf("%d * %d = %d", 5, 2, 5 * 2).println();

    // String
    System.out.printf("Print %s", "Hello").println();

    // Float
    // This will print 6 decimal values.
    System.out.printf("%f * %f = %f", 5.0, 2.0, 5.0 * 2.0).println();

    // To make it short, use below
    // %.2f => 2 decimal values
    System.out.printf("%.2f * %.2f = %.2f", 5.0, 2.0, 5.0 * 2.0).println();
    // %.3f => 3 decimal values
    System.out.printf("%.3f * %.3f = %.3f", 5.0, 2.0, 5.0 * 2.0).println();
  }
}
