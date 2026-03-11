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
     * If condition is true, control goes inside the block and executes statement
     * if not, it will not enter the block
     * 
     * This statement is used to check the condition.
     * There will be 3 types:
     * 
     * 1. Simple if
     * 2. If/else
     * 3. Nested if (if/else if/else)
     * 4. Switch
     */

    /*
     * Simple if statement:
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

    // We can use logical operators as well (&&, ||, !, ^)
    if (i <= 5 && i > 0) {
      System.out.println("i is less than 5");
    }

    /*
     * if/else statement:
     * If condition is true, control goes to 1st block and execute statement 1
     * else, control goes to 2nd block and executes statement 2
     * 
     * Syntax: if (condition) {
     * statement 1;
     * } else {
     * statement 2
     * }
     * 
     */
    if (i <= 5) {
      System.out.println("i is less than 5");
    } else {
      System.out.println("i is greater than 5");
    }

    /*
     * Nested if/else statement:
     * 
     * If 1st condition is true, control goes to 1st block and execute statement 1
     * else, it moves to 2nd condition and checks. If condition is true, it executes
     * statement 2. Else it moves to last statement and executes that.
     * 
     * We can have as many else if conditions. Note that if we have else condition
     * at the end and control goes inside of this loop, if none of the condition
     * matches, it executes else condition before coming out of loop
     * 
     * Note that, else condition is not mandatory. But best practice is to have else
     * condition. It won't break the code
     * 
     * Nested if/else should be used if conditions are minimal
     * 
     * Syntax: if (condition 1) {
     * statement 1;
     * } else if (condition 2) {
     * statement 2;
     * } else {
     * statement 3;
     * }
     * 
     */
    if (i <= 5) {
      System.out.println("i is less than 5");
    } else if (i >= 10) {
      System.out.println("i is greater than 5");
    } else {
      System.out.println("i is neither less than 5 nor greater than 10");
    }

    /*
     * Note: in the condition, the value which we are checking should be "boolean"
     * always.
     * Example:
     * int i = 1;
     * if(i) {
     * System.out.println("True");
     * }
     * 
     * Throws an error as condition is not a boolean value
     */

    /*
     * Switch:
     * Switch is the simpler version of nested if/else
     * It is more easier to read and we can have many conditions
     * 
     * Syntax:
     * switch(value) {
     * case 1: System.out.println("1"); break;
     * case 2: System.out.println("2"); break;
     * case 3: System.out.println("3"); break;
     * default: System.out.println("default"); break;
     * }
     * 
     * The flow is, in switch(), whatever the variable is passed, it will try to
     * check the value with case value.
     * Example:
     * int i = 1;
     * switch(i) <- when we pass i value, it will try to evaluate with all the cases
     * case 1: System.out.println("1"); break;
     * case 2: System.out.println("2"); break;
     * 
     * If any case matches, it will execute that statement. Break will move out of
     * the switch condition.
     * 
     * Its like i == 1, i == 2 and so on.
     * 
     * If no cases matches, default will get executed.
     * 
     * Note: If we use return in switch, break is not required
     * Note: default can be at any place. If none of the condition matches, default
     * will get executed
     * 
     */
    int num = 1;
    switch (num) {
      case 1:
        System.out.println("1");
        break;
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      default:
        System.out.println("default");
        break;
    }

    // Note: if break is not provided after every case, then the result will
    // fall through
    // Example:
    switch (num) {
      case 1:
        System.out.println("1");
      case 2:
        System.out.println("2");
        break;
      case 3:
        System.out.println("3");
        break;
      default:
        System.out.println("default");
        break;
    }

    // If the condition matches at case 1 as num has value 1. But as it doesn't have
    // break, it will fall through and at the end default will get executed. Hence,
    // we will be able to see "1" and "default" values both

    /*
     * Note: Only integer, byte, short, enum, chars, strings are allowed in switch.
     * long l = 15;
     * switch(l) {
     * } -> throws error as long is not supported
     * 
     * Expressions are not supported
     * int number = 15;
     * switch (number * 15) {
     * } -> Doesn't work
     */

    /*
     * Ternary operator:
     * This operator can be used as an simple if else statement in a single line.
     * Here we can check the condition and assign the value to a variable
     * 
     * Syntax:
     * type variable = condition ? "true" : "false"
     * 
     * here the condition will be checked first. If condition is true,
     * "true" will be returned and assigned to a variable.
     * If false, "false" will be returned and assigned to a variable.
     * 
     * Note: Both types should be same of what the variable type is defined.
     * We cannot have different types
     * 
     */
    int number = 15;
    String result = number > 15 ? "true" : "false";
    System.out.println(result);

    // same as

    if (number > 15) {
      result = "true";
    } else {
      result = "false";
    }
  }
}
