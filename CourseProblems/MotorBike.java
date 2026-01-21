package CourseProblems;

public class MotorBike {

  // Constructor
  public MotorBike(int speed) {
      this.speed = speed;
  }

  // state
  private int speed; // member variable

  // Behavior (methods)
  void start() {
    System.out.println("Bike started");
  }

  // Setter
  void setSpeed(int speed) { // local variable
    if (speed > 0) {
      this.speed = speed;
    }
  }

  // Getter
  int getSpeed() {
    return speed;
  }

  void increaseSpeed(int howMuch) {
    speed += howMuch;
  }

  void decreaseSpeed(int howMuch) {
    if (speed-howMuch > 0) {
      speed -= howMuch;
    }
  }

  public static void main(String[] args) {

    // Create instances like ducati and honda
    MotorBike ducati = new MotorBike(50);
    MotorBike honda = new MotorBike(50);

    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    ducati.start();
    honda.start();

    // state changed
    ducati.setSpeed(80);
    honda.setSpeed(90);

    ducati.increaseSpeed(100);
    honda.increaseSpeed(100);

    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    ducati.decreaseSpeed(50);
    honda.decreaseSpeed(50);

    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());
  }
}
