package CodingExercises;

import java.util.Arrays;

public class ReverseArray {
  public int[] reverseArray(int[] array) {

    int start = 0;
    int end = array.length - 1;
    int[] reversedArray = new int[array.length];
    while (end >= start) {
      reversedArray[start] = array[end];
      reversedArray[end] = array[start];
      end--;
      start++;
    }
    return reversedArray;
  }

  public static void main(String[] args) {
    int[] array = { 5, 7, 9, 4, 7, 2 };
    ReverseArray reverseArray = new ReverseArray();
    int[] newArray = reverseArray.reverseArray(array);
    System.out.println(Arrays.toString(newArray));
  }
}
