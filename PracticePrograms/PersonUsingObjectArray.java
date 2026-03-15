package PracticePrograms;

import java.util.Arrays;

public class PersonUsingObjectArray {
  public static void main(String[] args) {
    // declaring and defining an array for the Class
    PersonUsingObjectArray[] people = new PersonUsingObjectArray[2];
    System.out.println(Arrays.toString(people));
    // [null, null]

    // or one more way. Direct creating objects inside array
    PersonUsingObjectArray[] people2 = { new PersonUsingObjectArray(), new PersonUsingObjectArray() };
    System.out.println(Arrays.toString(people2));
  }
}
