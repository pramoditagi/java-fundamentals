package PracticePrograms;

public class Planet {
  // Method or actions
  void revolve() {
    System.out.println("Revolve");
  }

  public static void main(String[] args) {

    // create an object
    Planet earth = new Planet();

    // create one more object
    Planet venus = new Planet();

    // Call methods using objects
    earth.revolve();
    venus.revolve();
  }
}
