package PracticePrograms;

import java.util.Scanner;

public class CubeOfANumberUsingDoWhile {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = 0;
    do {
      System.out.print("Enter a number: ");
      number = scanner.nextInt();

      if (number < 0)
        break;
      System.out.print("Cube of a number is: " + (number * number * number));
      System.out.println("");
    } while (number > 0);
    System.out.println("Thank you! Have fun!");
  }
}
