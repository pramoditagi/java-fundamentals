package CoursePrograms;

public class Loops {
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

    /*
     * While loop:
     * While loop is similar to simple if condition but slightly different.
     * But functionality wise, it is same as for loop but differs in one thing.
     * 
     * type variable = value;
     * Syntax: while (condition) {
     * statement;
     * variable++ or variable--
     * }
     * 
     * Important thing to note here is, until condition is true, the loop keeps on
     * executing. While executing, variable is also gets updated.
     * 
     * Once the condition becomes false, control comes out of the loop.
     * 
     * Note: Increment/decrement should happen in while loop otherwise loop enters
     * into infinite loop
     */

    int i = 1; // initialize
    while (i < 5) { // while condition is true
      System.out.println(i); // execute statement
      i++; // increment value
    }

    /*
     * Important: While loop should be used when we don't know the limit or how many
     * executions will occur. In that case use while loop.
     * 
     * In the above example, we are not sure how many values we will get. Based on
     * condition, we are incrementing values to reach the limit and condition
     */

    /*
     * Do while loop
     * This is similar to the while loop. But there are few differences.
     * 1. while (condition) will be at the bottom
     * 2. This do while will be used when we want to execute the statement at least
     * once. This is because condition check will happen at the end.
     * 
     * In while loop, condition check occurs at first. If condition fails, it won't
     * execute any statements
     * 
     * Syntax:
     * type variable = value;
     * do {
     * statement;
     * value increment/decrement;
     * } while (condition)
     * 
     */

    int number2 = 10;
    do {
      System.out.println(number2); // execute statement first
      number2++; // increment value
    } while (number2 < 15); // check condition

    // Suppose
    int number3 = 16;
    do {
      System.out.println(number3); // execute statement first
      number3++; // increment value
    } while (number3 < 15); // check condition

    // The above code prints value as 16 as statement is executed first and
    // condition check happens later

    /*
     * Break
     * break keyword is used to come out of the loop or block.
     * 
     * If any result matches, we don't need to go through rest of the cases. That's
     * when break can be used to come out of the block
     */
    for (int j = 1; j <= 10; j++) {
      if (j == 5)
        break;
      System.out.print(j + " "); // 1, 2, 3, 4
    }

    // The above code will print only 1, 2, 3, 4 numbers as for the j = 5, condition
    // matches and break will quit the execution and comes out of the block

    /*
     * Continue
     * This is used to continue to the next iteration when continue is used. After
     * continue, whatever the statements are there, they will be skipped and moves
     * to next iteration
     */
    for (int j = 1; j <= 10; j++) {
      if (j == 5)
        continue;
      System.out.print(j + " "); // 1, 2, 3, 4, 6, 7, 8, 9, 10
      // 5 value is skipped due to continue
    }
  }
}
