package CoursePrograms;

public class ConditionalStatement {
  public static void main(String[] args) {
    /*
     * Conditional operators are used to check the condition
     * and it returns boolean values like true or false.
     * 
     * Based on the result, the execution of the flow can be controlled
     * 
     * Conditional operators are:
     * >, <, >=, <=, ==, !=
     */
    int i = 4;
    // i >= 4; Condition

    /*
     * If statement:
     * This statement is used to check the condition.
     * There will be 3 types:
     * 
     * 1. Simple if
     * 2. If/else
     * 3. Nested if (if/else if/else)
     */

    /*
     * Simple if statement
     * Syntax: if (condition) {
     * statement;
     * }
     * 
     * If condition is true, statement is executed. Else, control will not go
     * inside of the if statement and skips the statement
     */
    if (i <= 5) {
      System.out.println("i is less than 5");
    }

    // If we are executing only 1 statement, then we can skip {} braces
    if (i <= 5)
      System.err.println("i is less than 5");
  }
}
