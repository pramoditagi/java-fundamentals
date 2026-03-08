package CoursePrograms;

public class Methods {

  // Define a method: without parameter
  // Note: Using static as we are not calling this using object
  static void printHelloWorldTwice() {
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  // Define a method: with parameter
  static void printHelloWorld(int times) {
    for (int i = 1; i <= times; i++) {
      System.out.println("Hello World!");
    }
  }

  static void printHelloWorld() {
    System.out.println("Hello World!");
  }

  static int sum(int number1, int number2) {
    int sum = number1 + number2;
    return sum;
  }

  public static void main(String[] args) {
    /*
     * Methods: Method is a block which has set of instructions which will perform
     * certain task when they are called using method name.
     * 
     * Method can be used anywhere by just calling the method name.
     * Before that, we need to define a method
     * 
     * Syntax to define a method: without parameter
     * 
     * If we are returning something, then based on the type of the return value,
     * we need to specify the return type during method definition
     * 
     * returnType NameOfTheMethod() {
     * statements;
     * }
     * 
     * Example:
     * 
     * void: if we are not returning any value
     * 
     * int: if we are returning any integer value
     * boolean: if we are returning true or false value
     * char: if we are returning character value
     * String: if we are returning string
     * double: if we are returning decimal value
     * 
     * Call a method: without parameter
     * NameofTheMethod()
     * 
     * /*
     * Method naming convention
     * 1. Method can hav only alphabets, numbers, $ and underscore (_)
     * 2. Method name should not start with numbers
     * int 2numbers() -> Error
     * int number() -> Correct
     * 3. Method name should not be a key word
     * Example: int for(), int static(); etc
     * 4. There is no restriction on length of the method
     * 5. Method name should be a camelCase
     * Example: void printHelloWorldTwice() {}
     * 6. Method name should have a meaning
     * Example: void s() -> No error but not a good practice
     * void printHelloWorldTwice() {} -> Valid one
     */

    // Call/invoking a method using method name
    printHelloWorldTwice();

    /*
     * Syntax to define a method: With parameter
     * returnType NameOfTheMethod(type parameterName) {
     * statements;
     * }
     * 
     * Call a method: with parameter
     * NameofTheMethod(argument)
     * 
     * Argument: Actual argument or value which we are passing while calling a
     * method
     * 
     * Parameter: Placeholder or parameter which we are declaring while defining a
     * method
     * 
     * Note: Passed argument type and parameter type should be same. Otherwise it
     * will throw an error (Incompatible types)
     */

    // Call/invoking a method using method name by passing argument
    printHelloWorld(4);

    /*
     * Method overloading: Method having same name but differ in parameters
     */

    // Example:
    // We can see that printHelloWorld method name is same but differ in parameters
    // Advantage of this is, for different situations, we can use these methods
    printHelloWorld();
    printHelloWorld(3);

    /*
     * Actual arguments: The parameters which are passed in method call
     * Example: sum(2, 3) -> 2, 3 are actual arguments
     * Formal arguments: The parameters which are defined in method definition
     * Example: void sum(int a, int b) -> a, b are formal arguments
     */

    /*
     * Return value from method:
     * 
     * When we want to return any value from the method, returnType should be type
     * of the value which we are returning from method.
     * Also, we need to use 'return' keyword to return the value
     * 
     * Syntax: returnType nameOfTheMethod(parameters) {
     * statements;
     * return value;
     * }
     * 
     * While calling a method
     * datatype variableName = nameOfTheMethod(parameter)
     * 
     * variableName will hold the value which is returned from the method and can be
     * used for further calculations
     * 
     * Note: If we want to return any value, we should not use void as returnType
     */

    // Call a method to get sum value from the method
    // We can store the value in variable called sumOfTwoNumbers and
    // use it for further calculations or printing
    int sumOfTwoNumbers = sum(10, 6);
    System.out.println("Sum of two numbers: " + sumOfTwoNumbers);
  }
}
