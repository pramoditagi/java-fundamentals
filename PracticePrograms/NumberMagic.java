package PracticePrograms;

import java.util.ArrayList;
import java.util.List;

public class NumberMagic {
  /**
   * This method returns all factors of a given number in an ArrayList.
   * 
   * @param number the number to find factors of
   * @return a List of factors of the number
   */
  public List<Integer> determineAllFactors(int number) {

    ArrayList<Integer> arrayList = new ArrayList<>();

    if (number <= 0)
      return arrayList;

    for (int num = 1; num <= number; num++) {
      if (number % num == 0) {
        arrayList.add(num);
      }
    }
    return arrayList;
  }

  /**
   * This method generates a list of multiples of a given number less than a
   * specified limit.
   * 
   * @param number the number to find multiples of
   * @param limit  the upper bound for the multiples
   * @return a List of multiples of the number less than the limit
   */
  public List<Integer> determineMultiples(int number, int limit) {

    ArrayList<Integer> arrayList = new ArrayList<>();

    if (number <= 0 || limit <= 0 || number > limit)
      return arrayList;

    for (int num = 1; number * num < limit; num++) {
      arrayList.add(number * num);
    }
    return arrayList;
  }

  public static void main(String[] args) {
    NumberMagic nm = new NumberMagic();
    System.out.println(nm.determineAllFactors(6));
    System.out.println(nm.determineMultiples(5, 20));
  }
}
