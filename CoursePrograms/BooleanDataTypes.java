package CoursePrograms;

public class BooleanDataTypes {
  public static void main(String[] args) {
    /*
     * Boolean (boolean):
     * 
     * It is used to store boolean values (true or false)
     * Only 2 values it will store.
     * It is case sensitive
     * By default it will be false
     * 
     * Logical operators: The operators which can be used with boolean
     * 
     * Example:
     * && -> AND
     * || -> OR
     * ! -> NOT
     * ^ -> XOR
     * 
     * We can combine two or more conditions using logical operators
     * Logical operators will be performed on boolean values. Boolean values which
     * we get it from conditions
     */

    /*
     * AND (&&):
     * If both the operands are "true", returns "true". Otherwise "false"
     * - true && true -> true
     * - true && false -> false
     * - false && true -> false
     * - false && false -> false
     */
    int i = 17;
    if (i >= 15 && i <= 25) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    /*
     * OR (||):
     * If one of the operand is "true", result is "true". Otherwise, it's "false"
     * - true || true -> true
     * - true || false -> true
     * - false || true -> true
     * - false || false -> false
     */

    if (i >= 15 || i <= 25) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    /*
     * XOR (^):
     * If both operands are different from each other, then the result is "true"
     * Otherwise it's "false"
     * 
     * - true ^ true -> false
     * - true ^ false -> true
     * - false ^ true -> true
     * - false ^ false -> false
     */

    if (i >= 15 ^ i <= 25) {
      System.out.println("true");
    } else {
      System.out.println("false");
    }

    /*
     * NOT (!):
     * It returns the opposite of the operand
     * 
     * - !true -> false
     * - !false -> true
     */
    if (!false) {
      System.out.println("It's true as it's a negate");
    }

    // Note: Short circuit operator (&&, ||)
    /*
     * & and | (Single AND and Single OR)
     * This will evaluate both the operands and returns result
     * 
     * While
     * 
     * && and || checks for the first operand.
     * If result of first operand is false in case of "&&", it won't check further
     * If result of first operand is true in case of "||" it won't check further
     */
    int a = 5;

    if (a > 3 | a++ > 10) {
      System.out.println(a);
    }

    if (a < 3 & a++ > 10) {
      System.out.println(a);
    }
  }
}
