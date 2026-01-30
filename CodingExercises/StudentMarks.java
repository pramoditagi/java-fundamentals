package CodingExercises;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentMarks {

  private String name;
  private int[] listOfMarks;

  // Normal way
  // StudentMarks(String name, int[] listOfMarks) {
  // this.name = name;
  // this.listOfMarks = listOfMarks;
  // }

  // using variable arguments
  StudentMarks(String name, int... listOfMarks) {
    this.name = name;
    this.listOfMarks = listOfMarks;
  }

  int getNumberOfMarks() {
    return listOfMarks.length;
  }

  int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : listOfMarks) {
      sum += mark;
    }
    return sum;
  }

  int getMaximumMark() {
    Arrays.sort(listOfMarks);
    return listOfMarks[listOfMarks.length - 1];
  }

  int getMinimumMark() {
    Arrays.sort(listOfMarks);
    return listOfMarks[0];
  }

  BigDecimal getAverageOfMarks() {
    BigDecimal total = new BigDecimal(getTotalSumOfMarks());
    return total.divide(new BigDecimal(getNumberOfMarks()));
  }

  public static void main(String[] args) {
    int[] listOfMarks = { 96, 98, 100, 85, 89 };
    StudentMarks studentMarks = new StudentMarks("Pramod", listOfMarks);

    // If we want to pass array values, directly we can use new int[] {1, 2}
    // StudentMarks studentMarks1 = new StudentMarks("Pramod", new int[] {1, 2});
    int number = studentMarks.getNumberOfMarks();
    System.out.println("Number of marks: " + number);

    int sum = studentMarks.getTotalSumOfMarks();
    System.out.println("Total sum of marks: " + sum);

    int maximumMark = studentMarks.getMaximumMark();
    System.out.println("Maximum mark: " + maximumMark);

    int minimumMark = studentMarks.getMinimumMark();
    System.out.println("Minimum mark: " + minimumMark);

    BigDecimal average = studentMarks.getAverageOfMarks();
    System.out.println("Average marks: " + average);

  }
}
