package CourseProblems;

public class MethodReturnType {
  public static void main(String[] args) {
      System.out.println(sumOfThreeNumbers(2, 3, 4));
      System.out.println(findThirdAngle(60, 50));
  }

  static int sumOfThreeNumbers(int num1, int num2, int num3) {
    int sum = num1 + num2 + num3;
    return sum;
  }

  static int findThirdAngle(int angle1, int angle2) {
    int angle3 = 180 - (angle1 + angle2);
    return angle3;
  }
}
