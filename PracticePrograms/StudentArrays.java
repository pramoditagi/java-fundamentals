package PracticePrograms;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class StudentArrays {

  private String name;
  // private int[] listOfMarks;

  // NOTE: Changed from Array to ArrayList
  private ArrayList<Integer> listOfMarks = new ArrayList<Integer>();

  // public StudentArrays(String name, int[] listOfMarks) {
  // this.name = name;
  // this.listOfMarks = listOfMarks;
  // }

  // Using variable arguments
  // public StudentArrays(String name, int... listOfMarks) {
  // this.name = name;
  // this.listOfMarks = listOfMarks;
  // }

  // NOTE: Here, we are adding each element in an ArrayList
  // Hence, using for loop and add method
  public StudentArrays(String name, int... listOfMarks) {
    this.name = name;
    for (int mark : listOfMarks) {
      this.listOfMarks.add(mark);
    }
  }

  int getNumberOfMarks() {
    // return listOfMarks.length;

    // NOTE: ArrayList has .size() method to get the count
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
    // Arrays.sort(listOfMarks);
    // return listOfMarks[0];
    // int maximum = Integer.MIN_VALUE;
    // for (int mark : listOfMarks) {
    // if (mark > maximum) {
    // maximum = mark;
    // }
    // }
    // return maximum;

    return Collections.max(listOfMarks);
  }

  int getMinimumMark() {
    // Arrays.sort(listOfMarks);
    // return listOfMarks[listOfMarks.length - 1];
    // int minimum = Integer.MAX_VALUE;
    // for (int mark : listOfMarks) {
    // if (mark < minimum) {
    // minimum = mark;
    // }
    // }
    // return minimum;

    return Collections.min(listOfMarks);
  }

  BigDecimal getAverageMarks() {
    return new BigDecimal(getTotalSumOfMarks()).divide(new BigDecimal(getNumberOfMarks()));
  }

  // This method converts object data into textual data.
  public String toString() {
    return name + listOfMarks;
  }

  void addNewMark(int i) {
    listOfMarks.add(i);
  }

  void removeMark(int i) {
    listOfMarks.remove(2);
  }

  public static void main(String[] args) {
    // int[] marks = { 99, 98, 97, 90, 93 };
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

    // Get object textual data
    System.out.println(studentArrays);

    // Add an element
    studentArrays.addNewMark(35);
    System.out.println(studentArrays);

    // Remove mark
    studentArrays.removeMark(2);
    System.out.println(studentArrays);
  }
}

/*
 * For loop used in Constructor for below reasons:
 * 1. Converting from Array to ArrayList
 * 2.Converts from Primitive to Wrapper class (Auto boxing silently) as wrapper
 * classes won't create new objects which saves memory
 * Internally it does, Integer.valueOf(mark);
 * 
 * Note: If we do this.mark = mark; it will allocate memory and becomes fixed
 * size
 * 
 */

/*
 * Collections: Collections can be used on lists to perform some tasks.
 * ArrayList is part of Collections
 * 
 * Example:
 * min(value): This method is used to get minimum value from the list
 * 
 * Returns minimum value
 * 
 * Syntax:
 * Collections.min(value)
 * 
 * Example:
 * Collections.min(listOfMarks);
 * 
 * amx(value): This method is used to get maximum value from the list
 * 
 * Returns maximum value
 * 
 * Syntax:
 * Collections.max(value)
 * 
 * Example:
 * Collections.max(listOfMarks);
 *
 * toString(): This method can be used to get textual data of an object. \
 * We cannot see what object contains. Hence, we use toString to view contents
 * public String toString() {
 * }
 */
