package CodingExercises;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class StudentMarks {

  private String name;
  // private int[] listOfMarks;
  // Using ArrayList
  private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

  // Normal way
  // StudentMarks(String name, int[] listOfMarks) {
  // this.name = name;
  // this.listOfMarks = listOfMarks;
  // }

  // using variable arguments
  StudentMarks(String name, int... listOfMarks) {
    this.name = name;
    this.listOfMarks = new ArrayList<Integer>();

    for (int mark : listOfMarks) {
      this.listOfMarks.add(mark);
    }
  }

  int getNumberOfMarks() {
    // return listOfMarks.length;
    // After changing to ArrayList, we need to use .size() instead of .length
    return listOfMarks.size();
  }

  int getTotalSumOfMarks() {
    int sum = 0;
    for (int mark : listOfMarks) {
      sum += mark;
    }
    return sum;
  }

  int getMaximumMark() {
    // Commenting this as sort() doesn't accept ArrayList
    // Arrays.sort(listOfMarks);
    // return listOfMarks[listOfMarks.length - 1];

    // Commenting as we are using collections
    // int maximumMark = 0;
    // for (int mark : listOfMarks) {
    // if (mark > maximumMark) {
    // maximumMark = mark;
    // }
    // }
    // return maximumMark;
    return Collections.max(listOfMarks);
  }

  int getMinimumMark() {
    // Commenting this as sort() doesn't accept ArrayList
    // Arrays.sort(listOfMarks);
    // return listOfMarks[0];

    // Commenting as we are using collections
    // int minimumMark = Integer.MAX_VALUE;
    // for (int mark : listOfMarks) {
    // if (mark < minimumMark) {
    // minimumMark = mark;
    // }
    // }
    // return minimumMark;
    return Collections.min(listOfMarks);
  }

  BigDecimal getAverageOfMarks() {
    BigDecimal total = new BigDecimal(getTotalSumOfMarks());
    return total.divide(new BigDecimal(getNumberOfMarks()));
  }

  void addNewMarks(int mark) {
    listOfMarks.add(mark);
  }

  void removeMarks(int index) {
    listOfMarks.remove(index);
  }

  public String toString() {
    return name + listOfMarks;
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

    System.out.println(studentMarks);

    studentMarks.addNewMarks(67);
    System.out.println("After adding new marks: " + studentMarks);

    studentMarks.removeMarks(1);
    System.out.println("After adding new marks: " + studentMarks);
  }
}
