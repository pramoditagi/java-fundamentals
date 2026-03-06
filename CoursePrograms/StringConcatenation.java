package CoursePrograms;

public class StringConcatenation {
  public static void main(String[] args) {
    /*
     * String Concatenation:
     * This is refers to adding up the strings
     */

    // When both operands are integers or numbers, it will consider it as an
    // expression and evaluates and adds the integers
    // Here 1 and 2 both are integers
    System.out.println(1 + 2);

    // When either of operand is String, then it will do String Concatenation
    // Calculations happens from left to right
    System.out.println("1" + 2); // "12"
    System.out.println(1 + 2 + "3"); // "33"
    System.out.println("1" + 2 + 3); // "123"

    // If we want to evaluate an expression first, use brackets
    System.out.println("1" + (2 + 3)); // "15"

    // + operator plays both roles
    // When operands are numbers or integers, it performs addition
    // When any of the operand is string, it performs Concatenation

    // Concatenation using + for Strings
    System.out.println("ABC" + "DEF" + "GHI");

    // Printing value using +
    int i = 5;
    System.out.println("Value of i is: " + i);
  }
}
