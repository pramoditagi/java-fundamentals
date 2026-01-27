package CourseProblems;

public class Country {
  void comingSoon() {
    System.out.println("Coming soon!");
  }

  public static void main(String[] args) {
    // Create objects
    Country india = new Country();
    Country usa = new Country();

    // Call method
    india.comingSoon();
    usa.comingSoon();
  }
}
