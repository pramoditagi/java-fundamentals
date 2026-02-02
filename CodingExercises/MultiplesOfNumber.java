package CodingExercises;

import java.util.ArrayList;
import java.util.List;

public class MultiplesOfNumber {
  public List<Integer> determineMultiples(int number, int limit) {

    ArrayList<Integer> newArrayList = new ArrayList<>();

    if (number <= 0 || limit <= 0) {
      return newArrayList;
    }

    for (int i = 1; i < limit; i++) {
      if ((number * i) < limit) {
        newArrayList.add(number * i);
      }
    }

    return newArrayList;
  }

  public static void main(String[] args) {
    MultiplesOfNumber multiplesOfNumber = new MultiplesOfNumber();
    System.out.println(multiplesOfNumber.determineMultiples(5, 21).toString());
  }
}
