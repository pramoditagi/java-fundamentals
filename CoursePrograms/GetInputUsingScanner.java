package CoursePrograms;

import java.util.Scanner;

public class GetInputUsingScanner {
  public static void main(String[] args) {
    /*
     * Scanner: This is special type of class which is used to get the input from
     * the user through the console.
     * 
     * To use this, we need to import
     * java.util.Scanner
     * 
     * Syntax:
     * 
     * Define create scanner object
     * Scanner scanner = new Scanner(System.in);
     * 
     * Use object to get value from user
     * int number = scanner.nextInt();
     * 
     * byte: nextByte();
     * int: nextInt();
     * 
     * The value entered by user will get stored into number variable
     * 
     * We have different methods to get different type of values
     * 
     */
    Scanner scanner = new Scanner(System.in); // System.in is for taking input
    int number = scanner.nextInt();
    System.out.println(number);

    // Always best practice to close the scanner connection
    scanner.close();
  }
}
