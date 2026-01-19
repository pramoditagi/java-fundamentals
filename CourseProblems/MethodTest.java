package CourseProblems;

public class MethodTest {
  
  public static void main(String[] args) {
    // method call
    // method overloading
    MethodTest.test();
    MethodTest.test(2);

    // method call with argument
    printHelloWorldTimes(5);

    // call printNumbers by passing 10 as an argument
    printNumbers(10);

    // call printSquaresOfNumbers by passing 7 as an argument
    printSquaresOfNumbers(7);

    // Print multiplication table
    printMultiplicationTable(5);
  }

  // Making them as static as no objects are created
  // Defining method
  //Method overloading: same method name but different arguments
  static void test() {
    System.out.println("Hello World");
  }

  static void test(int num) {
    System.out.println("Hello World: " + num);
  }

  // Defining method with parameter
  static void printHelloWorldTimes(int times) {
    for (int i = 0; i < times; i++) {
        System.out.println("Hello World");
    }
  }

  static void printNumbers(int n) {
    for (int i = 1;i <=n; i++) {
      System.out.println(i);
    }
  }

  static void printSquaresOfNumbers(int n) {
    for (int i = 1;i <=n; i++) {
      System.out.println(i * i);
    }
  }

  static void printMultiplicationTable(int num) {
    for (int i = 1;i <= 10; i++) {
      System.out.printf("%d * %d = %d", num, i, num * i).println();
    }
  }
}
