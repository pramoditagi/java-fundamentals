package PracticePrograms;

public class MultiplicationTable {

  void printMultiplicationTable(int table) {
    for (int i = 1; i <= 10; i++) {
      System.out.printf("%d * %d = %d\n", table, i, table * i);
    }
  }

  public static void main(String[] args) {
    MultiplicationTable multiplicationTable = new MultiplicationTable();
    multiplicationTable.printMultiplicationTable(5);
  }
}
