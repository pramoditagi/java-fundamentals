package CodingExercises;

public class IsSortedArray {
  public boolean isSorted(int[] array) {
    if (array.length <= 1) {
      return true;
    }
    for (int i = 0; i < array.length - 1; i++) {
      if (array[i] > array[i + 1]) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {
    int[] array = { 1, 2, 3, 4, 2 };
    IsSortedArray isSortedArray = new IsSortedArray();
    System.out.println(isSortedArray.isSorted(array));
  }
}
