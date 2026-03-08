package CoursePrograms;

public class IntroductionToClass {
  public static void main(String[] args) {
    /*
     * Class: Class is a template. It can be defined as
     * Class is a real world entity
     * 
     * Example: Student, Planet, Country
     * 
     * Syntax:
     * 
     * It should start with Capital letter ant it should a block {}
     * 
     * Note: class name and file name should match
     * class Country {
     * }
     * 
     * Filename: Country.java
     */

    /*
     * Object: Object is an instance of a class
     * Example:
     * For Country class -> india, usa, china etc these are instances
     * For Planet class -> mars, earth, pluto etc these are instances
     * For Student class -> tom, harry etc these are instances
     * 
     * Objects can be created once the class is defined
     * 
     * Syntax:
     * ClassName objectName = new ClassName();
     * ObjectName should be in small letters
     * 
     * Example: For Country class,
     * Country india = new Country();
     * 
     * india is an object of class Country
     * 
     * For Planet class,
     * Planet earth = new Planet();
     * 
     * earth is an object of class Planet
     */

    /*
     * We can have methods in a class and methods can also be defined as
     * actions. These actions can be performed using an object of a class
     * 
     * Example:
     * 
     * class Planet {
     * void revolve() { <-------------------------------- Action
     * System.out.println("Revolve");
     * }
     * public static void main(String[] args) { <-------- Main method
     * 
     * // create an object
     * Planet earth = new Planet(); <-------------------- Object creation
     * 
     * // create one more object
     * Planet venus = new Planet(); <-------------------- Object creation
     * 
     * // Call methods using objects
     * earth.revolve(); <-------------------- Invoke method using an object
     * venus.revolve(); <-------------------- Invoke method using an object
     * }
     * }
     * 
     * If any errors are there during compilation, we will get compilation errors
     * 
     * public static void main(String[] args):
     * This is the entry point for the program. This is required to run the program
     */
  }
}
