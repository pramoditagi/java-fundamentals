package PracticePrograms;

import java.util.Arrays;

public class ArrayMagic {
  /**
   * This method determines whether there's an element greater than a given number
   * in an array.
   *
   * @param array  The array to search through.
   * @param number The number to compare with the array elements.
   * @return True if there's an element greater than the given number in the
   *         array, false otherwise.
   */
  public boolean doesHaveElementGreaterThan(int[] array, int number) {

    if (array.length == 0)
      return false;

    for (int num : array) {
      if (num > number) {
        return true;
      }
    }
    return false;
  }

  /**
   * This method finds and returns the second largest element in the given array.
   * 
   * @param array the array in which to find the second largest element
   * @return the second largest element in the array
   */

  public int findSecondLargestElement(int[] array) {
    if (array.length < 2)
      return -1;

    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
    ;
    for (int number : array) {
      if (number == largest)
        continue;
      if (number > largest) {
        secondLargest = largest;
        largest = number;
      } else if (number > secondLargest) {
        secondLargest = number;
      }
    }
    if (secondLargest == Integer.MIN_VALUE) { // as no secondLargest found
      return -1;
    }
    return secondLargest;
  }

  /**
   * This method checks if the input array is sorted in ascending order.
   * 
   * @param array the array to check
   * @return true if the array is sorted, false otherwise
   */
  public boolean isSorted(int[] array) {

    if (array.length == 0 || array.length == 1) {
      return true;
    }

    for (int i = 0; i < array.length; i++) {
      if (i != array.length - 1) {
        if (array[i] <= array[i + 1]) {
          continue;
        }
        return false;
      }
    }
    return true;
  }

  /**
   * This method reverses an array.
   * 
   * @param array the array to reverse
   * @return a new array with elements in reverse order
   */
  public int[] reverseArray(int[] array) {
    int[] newArray = new int[array.length];

    if (array.length == 0)
      return newArray;

    if (array.length == 1)
      return array;

    int start = 0;
    int end = array.length - 1;

    while (start <= end) {
      newArray[start] = array[end];
      newArray[end] = array[start];
      start++;
      end--;
    }

    return newArray;
  }

  public static void main(String[] args) {
    ArrayMagic am = new ArrayMagic();
    System.out.println(am.doesHaveElementGreaterThan(new int[] { 3, 5, 45, 1, 7, 49 }, 45));
    System.out.println(am.findSecondLargestElement(new int[] { 45, 21, 2, 4, 5 }));
    System.out.println(am.isSorted(new int[] { 3, 5, 6, 9, 10 }));
    System.out.println(Arrays.toString(am.reverseArray(new int[] { 1, 2, 10, 4, 3 })));
  }
}
