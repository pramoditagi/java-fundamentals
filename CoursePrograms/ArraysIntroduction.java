package CoursePrograms;

import java.util.ArrayList;
import java.util.Arrays;

public class ArraysIntroduction {

  /*
   * Variable Arguments: Variable arguments refers to passing as many arguments to
   * the method as a parameter and the method should work as expected without any
   * issues
   * 
   * Syntax: type method(type... name) {
   * name;
   * }
   * 
   * Note: We need to pass ... (3 dots after type) and provide a name
   * Example:
   * int... values
   * 
   * How it works is, behind the scene, it will convert the values like below
   * Arrays.toString(values) -> Which will print array
   * 
   * so whatever the values we pass, first it will convert that and then it
   * performs the operation whichever we want to.
   * 
   * Note: Variable arguments should be the last argument. It should not be at the
   * beginning
   * 
   * Example:
   * int sum(int... values, int count) -> Error as variable arguments should be at
   * the last
   * 
   * int sum(int count, int... values) -> correct
   */
  static void print(int... values) {
    System.out.println(Arrays.toString(values));
  }

  static int sum(int... values) {
    int sum = 0;
    for (int value : values) {
      sum += value;
    }
    return sum;
  }

  public static void main(String[] args) {
    /*
     * Arrays: Arrays are used to store multiple elements of same type
     * Can be used to perform any operation if there are more elements of same type
     * 
     * Syntax:
     * type[] variableName = { value1, value2, value3....}
     * 
     * [] -> This square braces denotes it is an array
     * 
     * Elements should be separated by comma (,) and should be in {} braces
     * 
     * Example:
     * int[] marks = { 100, 98, 95, 56 } -> 4 elements
     * int[] mark = {} -> Empty array -> 0 elements
     * 
     * In an array, index starts from 0
     * 
     * We can create in one more way
     * 
     * Syntax:
     * type[] variableName = new type[size];
     * 
     * We need to provide size for an array.
     * After this, by default, it will have all values as 0
     * 
     * Then we can update the array by using index and value
     * 
     */

    // Declaring an array
    int[] marks = { 100, 95, 90, 56 };
    int sum = 0;

    // Calculate sum of marks

    /*
     * This below is called as enhanced for loop
     * 
     * It wont be having increment/decrement, condition etc.
     * 
     * Can be used just to iterate over an array
     * 
     * Syntax:
     * for (declaration:array) {
     * statements;
     * }
     * 
     * Example:
     * for(int mark:marks) {
     * System.out.println(mark); <- This mark will have value from an array
     * }
     */
    for (int mark : marks) {
      sum += mark;
    }
    System.out.println("Sum: " + sum);

    // Defining an array
    // Here int[] marks1 ------------> is declaring an array
    // new int[5] -------------------> Defining an array with size of 5
    int[] marks1 = new int[5];

    // When an array is defined with size as 5, by default it will have all 0 values
    // { 0, 0, 0, 0, 0 }

    // Accessing specific index of an array
    System.out.println(marks1[2]); // This will return value which is present at index 2

    // Updating the value
    marks1[2] = 10;

    System.out.println(marks1[2]); // This will return 10 now as 10 is present at index 2
    // { 0, 0, 10, 0, 0 }

    /*
     * We can create an array in 2 ways
     * 1. Providing values directly
     * 
     * Example:
     * int[] numbers = { 1, 2, 3, 4, 5 };
     * 
     * 2. Creating an array with size first and updating values in an array
     * 
     * Example:
     * int[] numbers = new int[5];
     * 
     * Array is created with default value as 0 with 5 as size
     * { 0, 0, 0, 0, 0 }
     * 
     * // Updating an array with specific value at an index
     * numbers[3] = 10;
     * numbers[4] = 20;
     * 
     * { 0, 0, 0, 10, 20 }
     * 
     */

    /*
     * length:
     * This method is used to calculate length of an array
     * 
     * Returns numeric value
     * 
     * Syntax:
     * arrayVariable.length
     * 
     * Note: length doesn't have braces() as length is a property not a length
     * 
     * Example:
     * numbers.length
     */
    int[] numbers = new int[3];
    numbers[0] = 10;
    numbers[1] = 20;
    numbers[2] = 30;

    // Calculate length
    System.out.println(numbers.length);

    /*
     * Default values for different types when an array is initialized
     * 
     * Integer: 0
     * double: 0.0
     * boolean: false
     * class: null
     * 
     * Example:
     * 
     * Integer with size 3:
     * int[] marks = new int[3];
     * { 0, 0, 0 }
     * 
     * Double with size 3:
     * double[] db = new double[3];
     * { 0.0, 0.0, 0.0 }
     * 
     * Boolean with size 3:
     * boolean[] bool = new boolean[3];
     * { false, false, false }
     * 
     * class Person {}
     * Person[] person = new Person[3];
     * { null, null, null } -> Array of an object
     * 
     * Note: Without dimension, we cannot create an array
     * int[] mark = new int[] -> Error
     * 
     * Note: If we try to access an index which is beyond the length of an array
     * it will throw ArrayIndexOutOfBond exception
     */

    /*
     * To print an array
     * 
     * Use:
     * Arrays.toString(arrayName)
     * 
     * Arrays is static class
     */
    Arrays.toString(marks);
    // [100, 95, 90, 56]

    /*
     * fill(arr, value):
     * This method is used to fill the passed array (arr) with the value passed.
     * 
     * It will fill all the values with same number passed.
     * 
     * Whatever the size of an array, same sizes will be filled with passed values
     * 
     * Syntax:
     * Arrays.fill(arr, value)
     */
    int[] fillArr = new int[5];
    System.out.println(Arrays.toString(fillArr)); // [0, 0, 0, 0, 0]

    // Now fill the array with values
    Arrays.fill(fillArr, 55);
    System.out.println(Arrays.toString(fillArr)); // [55, 55, 55, 55, 55]

    // Note: This fill(arr, val) can be used on an array as a starting point
    // rather than storing default values as 0 or 0.0 or false or null

    /*
     * equals(arr1, arr2): This method is used to compare two arrays.
     * 
     * Syntax:
     * Arrays.equals(arr1, arr2)
     * 
     * Returns boolean true or false based on the condition
     * 
     * Example:
     * int[] arr1 = {1, 2, 3 };
     * int[] arr2 = {3, 4, 5, 4 }
     * 
     * Arrays.equals(arr1, arr2)
     * -> false
     * 
     * As both are differ in values and size
     */
    int[] arr1 = { 1, 2, 3 };
    int[] arr2 = { 1, 2, 3 };
    int[] arr3 = { 1, 2, 3, 4 };
    System.out.println(Arrays.equals(arr1, arr2)); // true
    System.out.println(Arrays.equals(arr1, arr3)); // false

    /*
     * sort(arr): This method is used to sort the array elements
     * 
     * This sorts the elements and updates the same variable with sorted values
     * 
     * Syntax:
     * Arrays.sort(arr);
     * 
     * Example:
     * Arrays.sort(arr3);
     * 
     */
    Arrays.sort(arr3);
    System.out.println(Arrays.toString(arr3));

    // Calling print method with variable arguments

    ArraysIntroduction.print(2);
    ArraysIntroduction.print(2, 5, 6, 8, 9);
    ArraysIntroduction.print(1, 2, 3, 4, 5, 6, 7, 8, 9);

    int sumOfNumbers = sum(1, 2); // we can pass many arguments we want
    System.out.println(sumOfNumbers);

    /*
     * Note: Once an array is created with fixed size, it is not possible to add or
     * remove an element from or to an array.
     * 
     * This can be achieved by creating a new array by copying the size of previous
     * array and adding the number of elements we want to create the size with new
     * array
     * 
     * Example:
     * int[] marks = {90, 91, 92} -> Here the size is 3
     * 
     * We cannot add new element or remove an element from an array
     * Hence, we can do this
     * 
     * int[] newArray = new int[marks.length + 2]; -> Size gets created
     * 
     * That's why ArrayLists are introduced which can be used to add an element or
     * remove an element from an array
     * 
     * ArrayList:
     * ArrayList are from java.util package. They are resizable, dynamic arrays can
     * be used to used to add an element or remove an element from an array.
     * 
     * Syntax:
     * ArrayList arraylist = new ArrayList()
     * 
     * add(value): This is used to add an element into an arrayList
     * 
     * Example:
     * // Add an element
     * arrayList.add(12)
     * arrayList.add(34)
     * arrayList.add(56)
     * 
     * remove(value): This is used to remove an element from an arrayList. Here we
     * can pass value directly or pass an index too
     * 
     * Example:
     * arrayList.remove(2) -> Index
     * arrayList.remove(34) -> Value
     * 
     * Print arrayList:
     * System.out.println(arrayList.toString());
     */

    // Declaration of ArrayList
    ArrayList arrayList = new ArrayList();

    // Adding an element
    arrayList.add(20);
    arrayList.add(30);
    arrayList.add(12);
    arrayList.add("12");
    arrayList.add('c');
    arrayList.add(true);

    // Printing ArrayList
    System.out.println(arrayList.toString()); // [20, 30, 12, 12, c, true]

    // Remove an element:
    arrayList.remove(true);
    System.out.println(arrayList.toString()); // [20, 30, 12, 12, c]

    /*
     * Note: Right now, it's accepting all types of elements like number, Strings,
     * character, boolean etc. It's not a best practice
     * 
     * Also, it will cause an issue while iterating as they are different types
     * 
     */

    /*
     * We need to specify the type while declaring arrayList
     * Example:
     * For Strings:
     * ArrayList<String> arrayList = new ArrayList<String>();
     * 
     * now with this, we can add only String elements:
     * 
     * arrayList.add("abc") -> Works
     * arrayList.add(2) -> Error as 2 is of type Integer
     * 
     * For Integer:
     * ArrayList<Integer> arrayList = new ArrayList<Integer>();
     * 
     * For Boolean:
     * ArrayList<Boolean> arrayList = new ArrayList<Boolean>();
     */

    ArrayList<String> arrayList1 = new ArrayList<String>();
    arrayList1.add("apple");
    arrayList1.add("banana");
    System.out.println(arrayList1.toString());
    // arrayList1.add(3); error

    // Integer
    ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
    arrayList2.add(1);
    arrayList2.add(2);
    System.out.println(arrayList2.toString());
  }
}
