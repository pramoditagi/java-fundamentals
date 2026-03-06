package CoursePrograms;

public class AssignmentOperator {
  public static void main(String[] args) {
    /*
     * = is used as an assignment operator
     * It is used to copy the value from right to left
     * Left hand side should be a variable
     * Right hand side can be a variable which is having value or a number or an
     * expression
     * Example: 10 = i => this won't work
     */

    // Number
    int i = 10;
    int j = 20;
    // j value (20) gets copied into i. Previous value 10 will get lost

    // Variable
    i = j;
    System.out.println(i);
    System.out.println(j);

    // Expression
    // Here j * 2 gets calculated and gets stored in i
    i = j * 2;

    // Increment value
    i = i + 1;

    // Decrement value
    i = i - 1;

    /*
     * Increment and decrement operator (++, --)
     * These operators are used to increment and decrement value by 1
     * There are 2 types:
     * 1. Pre Increment
     * 2. Post Increment
     * 
     * Same for decrement:
     * 1. Pre Decrement
     * 2. Post Decrement
     */

    /*
     * Pre Increment
     * Value gets incremented first and returns new value
     */
    int num = 1;
    ++num;
    System.out.println(num);

    /*
     * Post Increment
     * Returns old value and then gets incremented
     */
    int num1 = 1;
    num1++; // same as (num1 = num1 + 1)
    System.out.println(num1);

    /*
     * Pre Decrement
     * Value gets decremented first and returns new value
     */
    int num2 = 1;
    --num2;
    System.out.println(num2);

    /*
     * Post Increment
     * Returns old value and then gets incremented
     */
    int num3 = 1;
    num3--; // same as (num3 = num3 - 1)
    System.out.println(num3);

    /*
     * Compound assignment
     * It's a mix of two operators. If we are using same variable on both sides
     * this compound assignment method can be used
     */

    // Instead of
    num = num + 2;

    // We can use (Shortcut)
    num += 2;

    // Same thing can be applied for all operators
    num *= 2;
    num /= 2;
    num -= 2;
    num %= 2;
  }
}
