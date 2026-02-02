package CodingExercises;

import java.util.ArrayList;
import java.util.List;

public class FactorsOfNumber {
  public List<Integer> determineAllFactors(int number) {

    if (number <= 0) {
      return new ArrayList<Integer>();
    }
    ArrayList<Integer> newArrayList = new ArrayList<Integer>(number);

    for (int i = 1; i <= number; i++) {
      if (number % i == 0) {
        newArrayList.add(i);
      }
    }
    return newArrayList;
  }

  public static void main(String[] args) {
    FactorsOfNumber factorsOfNumber = new FactorsOfNumber();
    System.out.println(factorsOfNumber.determineAllFactors(8).toString());
  }
}
