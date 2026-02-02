package CourseProblems;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    // Should not be used like this as this can allow users to enter any type of
    // values
    // Like String, Integer, Boolean, double etc
    // While iterating, it will cause an issue
    ArrayList arrayList = new ArrayList<>();
    arrayList.add(1);
    arrayList.add("Apple");
    arrayList.add(true);

    System.out.println(arrayList);

    // Best practice:
    // Initialize
    ArrayList<String> arrayList1 = new ArrayList<String>();

    // Add element into an array
    arrayList1.add("Apple");
    arrayList1.add("Bat");
    arrayList1.add("Cat");

    // Remove an element from an array
    arrayList1.remove("Bat");
    // Throws an error as it allows only String type as declared above
    // arrayList1.add(2);
  }
}
