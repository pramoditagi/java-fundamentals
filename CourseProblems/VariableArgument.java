package CourseProblems;

public class VariableArgument {

  int sum(int... values) {
    int total = 0;
    for (int value : values) {
      total += value;
    }
    return total;
  }

  public static void main(String[] args) {
    VariableArgument variableArgument = new VariableArgument();
    System.out.println(variableArgument.sum(1, 2, 4, 6));
  }
}
