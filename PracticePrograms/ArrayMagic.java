package PracticePrograms;

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

  public static void main(String[] args) {
    ArrayMagic am = new ArrayMagic();
    System.out.println(am.doesHaveElementGreaterThan(new int[] { 3, 5, 45, 1, 7, 49 }, 45));
  }
}
