package CoursePrograms;

public class ForLoop {
  public static void main(String[] args) {
    /*
     * For loop
     * This loop is used to repeat the steps by updating the initial value until
     * certain condition becomes false.
     * Syntax:
     * for (initialization; condition; increment/decrement) {
     * statements;
     * }
     * 
     * {} -> Block
     * 
     * initialization: Setting initial value before starting the loop
     * condition: Check the initial value condition. If condition is true, for loop
     * executes. If false, it comes out of the loop
     * increment/decrement: update the initial value after executing the statements
     * 
     */

    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }

    /*
     * Flow is, first initialization is executed. Then condition is checked. If
     * condition is true, statement gets executed. Then increment is executed.
     * 
     * Same flow continues till condition becomes false
     * 
     * First time:
     * Initialization -> Condition -> Statement -> Update
     * 
     * Next time:
     * Condition -> Statement -> Update
     * 
     * Initialization is executed only once
     * Condition is checked always
     * 
     */

    // This is an infinite loop. If we don't provide anything inside the for loop.
    // It runs continuously unless we stop the execution manually
    // If we provide ; after for(), it's called as empty statement

    // for (;;);

    // For loop can be empty. We need to have 2 semi colons inside the loop.

    // for (i = 1, j = 2; i <= 10; i++, j++)
    // We can have multiple initialization and update statements. But condition will
    // be only one
  }
}
