package CodingExercises;

public class SecondLargest {
  public int findSecondLargestElement(int[] array) {
    int largest = -1;
    int secondLargest = -1;
    if (array.length < 2) {
      return -1;
    }
    for (int num : array) {
      if (num > largest) {
        secondLargest = largest;
        largest = num;
      } else if (num > secondLargest && num < largest) {
        secondLargest = num;
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    int[] array = { 5, 5, 5 };
    SecondLargest secondLargest = new SecondLargest();
    System.out.println(secondLargest.findSecondLargestElement(array));
  }
}
