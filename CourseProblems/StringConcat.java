package CourseProblems;

public class StringConcat {
  public static void main(String[] args) {

    // number + number => Adds
    System.out.println(1 + 2);

    // number + String => String (Concat)
    System.out.println(1 + "2");

    // String + String => String (Concat)
    System.out.println("1" + "2");

    // String + number => String (Concat)
    System.out.println("1" + 2 + 3);

    // String + number => String (Concat) using brackets
    // brackets will be executed first
    System.out.println("1" + (2 + 3));

    // String + String => String (Concat)
    System.out.println("ABC" + "DEF");

    int i = 10;
    System.out.println("Value of i: " + i);
  }
}
