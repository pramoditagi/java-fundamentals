package CoursePrograms;

public class Variables {
  public static void main(String[] args) {
    /*
     * Variable: Variable is the one which can hold a value and can be used in
     * program multiple times and it can change it's value during the execution of
     * the program. At different stages, variables have different values.
     */

    // Syntax:
    // type variableName = value;

    /*
     * Declaration:
     * type: integer (int)
     * variableName: number
     * value: 10
     */
    int number = 10;
    int i = 1;
    System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    i = 2;
    System.out.printf("%d * %d = %d", 5, i, 5 * i).println();

    /*
     * Assignment:
     * Here number value got changed from 10 to 20 and a variable 'number' will hold
     * 20 as the value. 10 got discarded
     */
    number = 20;

    /*
     * If we try to use the undeclared variable in the program, it will throw an
     * error
     * Example: undeclaredVariable = 20
     * Error: Cannot find symbol
     */

    /*
     * If a variable is not initialized with any value, it will throw an error.
     * In JShell, it will hold value as 0
     */
    int newVariable;
    // newVariable = newVariable + 1;
    // Error: newVariable is not initialized with any value

    /*
     * Note: Java is Strongly typed language. We need to specify the type for the
     * variable and same type of value has
     * to be passed to the variable. Otherwise it will throw an error.
     * Example: int number = 5.5;
     * Error: We cannot store double value in integer
     */

    /*
     * We can create new variable by using existing variable
     * Here number2 will have value of number
     */
    int number2 = number;
    System.out.println(number2);

    /* How variables are stored in memory */

    // int variable1 = 10;
    // int variable2 = 20;

    /*
     * When variables are declared and initialized with values, in computer memory,
     * variable name variable1 gets stored in Variable column and value (20) gets
     * stored in Value column at one of the memory location. Lets say 5006 location
     * 
     * Same applies for variable2. In computer memory, variable name variable2 gets
     * stored in Variable column and value (10) gets stored in Value column at one
     * of the memory location. Lets say 5010 location
     * 
     * When we try to update the variable value, variable1= 50;
     * Then a value gets updated in memory location where variable1 is referenced
     * 
     * +------------------+--------+
     * | Memory | Value | Variable |
     * +------------------+--------+
     * | 5006 | 50 | variable1 |
     * | 5010 | 15 | variable2 |
     * +------------------+--------+
     * 
     * If we say int variable3 = variable1;
     * then value of variable1 gets copied into variable variable3 like below
     * 
     * Memory location value variable Name
     * +------------------+--------+
     * | Memory | Value | Variable |
     * +------------------+--------+
     * | 5006 | 50 | variable1 |
     * | 5010 | 15 | variable2 |
     * | 5014 | 50 | variable3 |
     * +------------------+--------+
     * 
     */

    // Note: We cannot remember memory locations where our value gets stored. Hence,
    // we use variables which can hold value and we can give name to memory location
    // so that we can access the value easily.

    // Note 2: Type of the variable cannot be changed during execution of the
    // program. Whatever has been defined initially, it will remain same.

    /*
     * Variable naming convention
     * 1. Variables can hav only alphabets, numbers, $ and underscore (_)
     * 2. Variable name should not start with numbers
     * int 2numbers = 10 -> Error
     * int number = 10 -> Correct
     * 3. Variable name should not be a key word
     * Example: int for = 0, int static = 10; etc
     * 4. There is no restriction on length of the variable
     * 5. Variable name should be a camelCase
     * Example: int veryBigNumber = 10000022;
     * 6. Variable name should have a meaning
     * Example: int s = 0; -> No error but not a good practice
     * int score = 0; -> Valid one
     */
  }
}
