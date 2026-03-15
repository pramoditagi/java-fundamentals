package PracticePrograms;

import java.math.BigDecimal;
import java.util.Arrays;

public class StudentArrays {

  private String name;
  private int[] listOfMarks;

  // public StudentArrays(String name, int[] listOfMarks) {
  // this.name = name;
  // this.listOfMarks = listOfMarks;
  // }

  // Using variable arguments
  public StudentArrays(String name, int... listOfMarks) {
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
    return listOfMarks[0];
  }

  int getMinimumMark() {
    Arrays.sort(listOfMarks);
    return listOfMarks[listOfMarks.length - 1];
  }

  BigDecimal getAverageMarks() {
    return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()));
  }

  public static void main(String[] args) {
    int[] marks = { 99, 98, 97, 90, 93 };
    // StudentArrays studentArrays = new StudentArrays("Pramod", marks);
    // or can be used in other way as well
    StudentArrays studentArrays = new StudentArrays("Pramod", new int[] { 99, 98, 97, 90, 93 });
    StudentArrays studentArrays1 = new StudentArrays("Adam", new int[] { 99, 98, 97, 93 });
    StudentArrays studentArrays2 = new StudentArrays("Eve", new int[] { 99, 98, 97, 93, 56, 69 });

    int number = studentArrays.getNumberOfMarks();
    System.out.println("Number of marks: " + number);

    int sum = studentArrays.getTotalSumOfMarks();
    System.out.println("Total sum of marks: " + sum);

    int maximumMark = studentArrays.getMaximumMark();
    System.out.println("Maximum mark: " + maximumMark);

    int minimumMark = studentArrays.getMinimumMark();
    System.out.println("Minimum mark: " + minimumMark);

    BigDecimal average = studentArrays.getAverageMarks();
    System.out.println("Average of marks: " + average);

    int number1 = studentArrays1.getNumberOfMarks();
    System.out.println("Number of marks for Adam: " + number1);

    int number2 = studentArrays2.getNumberOfMarks();
    System.out.println("Number of marks for Eve: " + number2);
  }
}
