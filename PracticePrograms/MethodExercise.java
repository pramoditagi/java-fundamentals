package PracticePrograms;

public class MethodExercise {
  static void sayHelloWorldThrice() {
    System.out.println("Hello World");
    System.out.println("Hello World");
    System.out.println("Hello World");
  }

  static void myJavaLearning() {
    System.out.println("I've created my first variable");
    System.out.println("I've created my first method");
    System.out.println("I've created my first loop");
    System.out.println("I am excited to learn Java");
  }

  static void printNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      System.out.println(i);
    }
  }

  static void printSquaresOfNumbers(int limit) {
    for (int i = 1; i <= limit; i++) {
      System.out.println(i * i);
    }
  }

  static void printMultiplicationTable(int table) {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d", table, i, table * i).println();
    }
  }

  static void sum(int number1, int number2) {
    int sum = number1 + number2;
    System.out.println("Sum: " + sum);
  }

  static int sumOfThreeNumbers(int number1, int number2, int number3) {
    return number1 + number2 + number3;
  }

  static int thirdAngle(int angle1, int angle2) {
    return 180 - (angle1 + angle2);
  }

  public static void main(String[] args) {
    // Call method without passing any argument
    sayHelloWorldThrice();
    myJavaLearning();

    // Call method by passing an argument
    printNumbers(9);
    printSquaresOfNumbers(5);

    // Call multiplication table for the passed number
    printMultiplicationTable(7);

    // Sum of two numbers
    sum(10, 5);

    // Sum of three numbers
    int sum = sumOfThreeNumbers(10, 50, 50);
    System.out.println("Sum of 3 numbers: " + sum);

    // Method to find 3rd angle
    // We can directly call a method inside print statement
    System.out.println(thirdAngle(90, 20));
  }
}
