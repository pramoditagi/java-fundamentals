package PracticePrograms;

import java.util.Scanner;

public class Menu {
  public static void main(String[] args) {

    // Create scanner object
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter Number 1: ");
    int number1 = scanner.nextInt();

    System.out.print("Enter Number 2: ");
    int number2 = scanner.nextInt();

    System.out.println("Entered Number 1 value is : " + number1);
    System.out.println("Entered Number 2 value is : " + number2);

    System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");

    System.out.print("Choose operation: ");
    int operation = scanner.nextInt();

    // operationUsingIfElse(number1, number2, operation);
    operationUsingSwitch(number1, number2, operation);
  }

  /*
   * private static void operationUsingIfElse(int number1, int number2, int
   * operation) {
   * if (operation == 1) {
   * System.err.println("You have chosen addition operation");
   * System.out.println("Result is: " + (number1 + number2));
   * } else if (operation == 2) {
   * System.err.println("You have chosen subtraction operation");
   * System.out.println("Result is: " + (number1 - number2));
   * } else if (operation == 3) {
   * System.err.println("You have chosen multiplication operation");
   * System.out.println("Result is: " + (number1 * number2));
   * } else if (operation == 4) {
   * System.err.println("You have chosen division operation");
   * System.out.println("Result is: " + (number1 / number2));
   * } else {
   * System.out.println("Invalid operation");
   * }
   * }
   */

  private static void operationUsingSwitch(int number1, int number2, int operation) {
    switch (operation) {
      case 1:
        System.out.println("You have chosen addition operation");
        System.out.println("Result is: " + (number1 + number2));
        break;
      case 2:
        System.out.println("You have chosen subtraction operation");
        System.out.println("Result is: " + (number1 - number2));
        break;
      case 3:
        System.out.println("You have chosen multiplication operation");
        System.out.println("Result is: " + (number1 * number2));
        break;
      case 4:
        System.out.println("You have chosen division operation");
        System.out.println("Result is: " + (number1 / number2));
        break;
      default:
        System.out.println("Invalid operation");
        break;
    }
  }
}
