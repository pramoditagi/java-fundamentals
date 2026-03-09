package CoursePrograms;

public class MotorBike {
  // Member variables which belongs to object
  private int speed;

  //
  /*
   * Constructor: Constructor is a special type of method used to set the
   * initial value when the object is created.
   * 
   * It will not have any return type.
   * Constructor name will be same as the className
   * 
   * Syntax:
   * ClassName(parameter) {
   * this.parameter = parameter;
   * }
   * 
   * Constructor can be default or parameterized
   * 
   * Default:
   * ClassName() {
   * }
   * 
   * Parameterized:
   * ClassName(parameter) {
   * this.parameter = parameter;
   * }
   * 
   * Constructor will be called when an object is created
   * Here:
   * ClassName object = new ClassName();
   * or
   * ClassName object = new ClassName(100);
   */
  public MotorBike(int speed) {
    this.speed = speed;
  }

  public MotorBike() {
    System.out.println("Default constructor called");
  }

  // Action or MethodMotor

  // Action or Method
  void start() {
    System.out.println("Bike started");
  }

  /*
   * Setter
   * 
   * "this" refers to instance variable (object).
   * It will be void always as we are not returning anything
   * Setting the local variable speed value to instance variable
   * When we do ducati.setSpeed(100), 100 will be set to instance variable
   * Like ducati.speed = 100;
   */
  void setSpeed(int speed) { // local variable
    if (speed > 0) {
      this.speed = speed;
    }
  }

  /*
   * Getter
   * 
   * "this" refers to instance variable (object).
   * It will have a different datatype other than void as we are returning the
   * value. It will not have any parameters. Just returning the value
   */
  int getSpeed() {
    return this.speed;
  }

  void increaseSpeed(int howMuch) {
    setSpeed(this.speed + howMuch);
  }

  void decreaseSpeed(int howMuch) {
    setSpeed(this.speed - howMuch);
  }

  public static void main(String[] args) {

    // Create objects
    MotorBike ducati = new MotorBike(100);
    MotorBike honda = new MotorBike(200);
    // Default constructor
    MotorBike suzuki = new MotorBike();

    // Print current state of an object
    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    // call method using objects
    ducati.start();
    honda.start();

    // We cannot use speed variable like this below
    // MotorBike.speed;
    // Note: Instance variables can be access only through instances or objects

    // Current state of an object
    ducati.setSpeed(100);
    honda.setSpeed(50);

    // Print current state of an object
    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    // Increase speed
    ducati.increaseSpeed(20);
    honda.increaseSpeed(20);

    // Print updated state of an object
    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    // decrease speed
    ducati.decreaseSpeed(20);
    honda.decreaseSpeed(20);

    // Print updated state of an object
    System.out.println(ducati.getSpeed());
    System.out.println(honda.getSpeed());

    // Memory locations for each instances will be different.
    // Change in one object will not affect other object state
    // Ducati
    // * Speed -> 100

    // Honda
    // * Speed -> 50
  }
}
