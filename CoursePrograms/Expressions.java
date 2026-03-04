package CoursePrograms;

public class Expressions {
  public static void main(String[] args) {

    // Comment: They are used for information purpose in code. They do not render on
    // screen or as an output in the console

    // Single line comment -> Used for single lines

    /*
     * These are
     * Multi line
     * comments
     */

    /*
     * Expression: Expression has operator and operands
     * Example: 5 * 6
     * Here 5 and 6 are operands and * is an operator
     * is multiplication operator
     * 5 and 6 are Literals or Constants
     */

    /*
     * Literals: Literals also called as constants which do not change their value
     * Integer numbers are whole numbers consists of positive and negative numbers
     * including 0
     */

    /*
     * Operators:
     * + Addition
     * - Subtraction
     * * Multiplication
     * / Division
     * % Modulus (Provides remainder)
     */

    // Note: For % calculation if dividend (top) is less than divisor (bottom),
    // the result will be dividend (top) value. If not, it will provide actual
    // remainder value
    // Example 1: 2 % 3 => 2
    // Example 2: 5 % 2 => 1 (Remainder)

    // Stores value as 2 as both divisor and dividend are integers
    // 5 / 2

    // To get decimal value, one of the operand should be a
    // decimal or floating point value
    // 5.0 / 2.0 or 5.0 / 2 => both results provide 2.5 as result

    // End results of integer and floating point calculations
    /*
     * integer / integer => integer
     * integer / float => float
     * float / integer => float
     * float / float => float
     */

    // Precedence: Order how the expressions are evaluated
    // * / % > + -
    // Note: Multiplication, division, mod have highest precedence than addition and
    // subtraction
    // * / % will be executed first and then + -

    // 5 + 5 * 6 => 30
    // Brackets or Parentheses(): If we want to evaluate an expression which is at
    // the beginning first or on priority, then we can use brackets as expressions
    // in the brackets will be executed first irrespective of operator precedence
    // Example: (5 + 5) * 6
  }
}
