package CourseProblems;

import java.util.Scanner;

public class MenuRunner {

  public static int add(int num1, int num2) {
    return num1 + num2;
  }

  public static int subtract(int num1, int num2) {
    return num1 - num2;
  }

  public static int divide(int num1, int num2) {
    return num1 / num2;
  }

  public static int multiply(int num1, int num2) {
    return num1 * num2;
  }

  public static void main(String[] args) {
    System.out.print("Enter number 1: ");
    Scanner scanner = new Scanner(System.in);
    int number1 = scanner.nextInt();
    System.out.println("Entered number1 is: " + number1);

    System.out.print("Enter number 2: ");
    int number2 = scanner.nextInt();
    System.out.println("Entered number2 is: " + number2);

    System.out.println("1 - Add\n2 - Subtract\n3 - Divide\n4 - Multiply");
    System.out.print("Choose operation: ");
    int choice = scanner.nextInt();
    System.out.println("Entered choice is: " + choice);

    // using if/else
    // calculation(number1, number2, choice);
    // using switch
    calculationUsingSwitch(number1, number2, choice);
  }

  private static void calculation(int number1, int number2, int choice) {
    if (choice == 1) {
      System.out.println("Result is: " + add(number1, number2));
    } else if (choice == 2) {
      System.out.println("Result is: " + subtract(number1, number2));
    } else if (choice == 3) {
      System.out.println("Result is: " + divide(number1, number2));
    } else if (choice == 4) {
      System.out.println("Result is: " + multiply(number1, number2));
    } else {
      System.out.println("Invalid choice");
    }
  }

  private static void calculationUsingSwitch(int number1, int number2, int choice) {
    switch (choice) {
      case 1:
        System.out.println("Result is: " + add(number1, number2));
        break;
      case 2:
        System.out.println("Result is: " + add(number1, number2));
        break;
      case 3:
        System.out.println("Result is: " + divide(number1, number2));
        break;
      case 4:
        System.out.println("Result is: " + multiply(number1, number2));
        break;
      default:
        System.out.println("Invalid choice");
        break;
    }
  }
}
