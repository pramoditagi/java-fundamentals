package CourseProblems;

public class AssignmentOperator {
  public static void main(String[] args) {
    // Post increment
    // intial value
    int number = 5;
    // Post increment will return old value first and then increment
    // output: 5
    System.out.println(number++);
    // incremented number: 6
    System.out.println(number);

    // Pre increment
    // intial value
    int number1 = 5;
    // Pre increment will increment value first and return new value
    // output: 6
    System.out.println(++number1);
    // incremented number: 6
    System.out.println(number1);

    // Note: Same thing applies for decrement operators as well

    // Compund operator
    // If variables are same on both sides
    // this is same as number = number + 20
    number += 20;
    number1 -= 5;
    System.out.println(number);
    System.out.println(number1);
  }
}
