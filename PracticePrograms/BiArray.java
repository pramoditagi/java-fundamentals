package PracticePrograms;

public class BiArray {
  private int[] array1;
  private int[] array2;

  public BiArray(int[] array1, int[] array2) {
    this.array1 = array1;
    this.array2 = array2;
  }

  public boolean areSumsEqual() {

    int sum1 = calculateSum(array1);
    int sum2 = calculateSum(array2);

    return sum1 == sum2;
  }

  private int calculateSum(int[] array) {

    int sum = 0;
    for (int num : array) {
      sum += num;
    }
    return sum;
  }

  public static void main(String[] args) {
    BiArray biArray = new BiArray(new int[] { 1, 2, 3, 4, 5 }, new int[] { 5, 3, 4, 1, 2, 0 });
    System.out.println(biArray.areSumsEqual());
  }
}
