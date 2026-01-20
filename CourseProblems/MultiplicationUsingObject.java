package CourseProblems;

public class MultiplicationUsingObject {

  void printTable() {
    for (int i = 0; i <= 10; i++) {
        System.out.printf("%d * %d = %d", 5, i, 5 * i).println();
    }
  }

  void printTable(int number) {
    for (int i = 0; i <= 10; i++) {
        System.out.printf("%d * %d = %d", number, i, number * i).println();
    }
  }

  public static void main(String[] args) {
    MultiplicationUsingObject multiplication = new MultiplicationUsingObject();

    // Method overloading
    multiplication.printTable();
    multiplication.printTable(8);
  }
}