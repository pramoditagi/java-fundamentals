package CourseProblems;

import java.util.Arrays;

public class ArrayExample {
  public static void main(String[] args) {
    // Initialize array
    int[] marks = { 100, 75, 80 };

    // loop through using enhanced for loop
    int sum = 0;
    for (int mark : marks) {
      sum += mark;
    }

    System.out.println("Total marks: " + sum);

    // Declaring an array using int
    int[] marks1 = new int[5];
    System.out.println(Arrays.toString(marks1)); // { 0 , 0, 0, 0, 0 }

    // Accessing the value in an array using index
    System.out.println(marks1[2]); // 0

    // Setting value for an array index
    marks1[3] = 10;
    System.out.println(Arrays.toString(marks1)); // // {0 , 0, 0, 10, 0}

    // Declaring an array (Shortcut by directly assigning values)
    int[] marks2 = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(marks2)); // { 1, 2, 3, 4, 5 }

    // length: Used to calculate length of an array
    // Here length is a property not a method
    System.out.println(marks1.length);

    int[] eightMarks = { 100, 89, 76, 45, 67, 89, 66, 90 };
    for (int mark : eightMarks) {
      System.out.println(mark);
    }

    // using traditional for loop
    for (int i = 0; i < eightMarks.length; i++) {
      System.out.println(eightMarks[i]);
    }

    // double initialization using array
    // By default values: 0.0
    double[] dob = new double[5]; // { 0.0, 0.0, 0.0, 0.0, 0.0 }

    // boolean initialization using array
    // By default values: false
    boolean[] bool = new boolean[5]; // { false, false, false, false, false }

    // class initialization using array
    // By default values: null
    // class Person {}
    // Person[] person = new Person[5]; { null, null, null, null, null }

    Arrays.toString(marks); // To view contents of an array

    int[] newMarks = new int[5];
    System.out.println(Arrays.toString(newMarks));

    // fill(arr, value): This is used to fill the passed array with passed value
    Arrays.fill(newMarks, 100);

    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 1, 2, 3 };

    // equals(arr1, arr2): This is used to check if both arrays are equal or not
    // Returns true or false based on condition (true only when both arrays have
    // same length and have same elements)
    Arrays.equals(arr1, arr2);

    // sort(arr): Used to sort array elements
    Arrays.sort(eightMarks);
  }
}
