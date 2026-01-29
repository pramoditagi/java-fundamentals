package CourseProblems;

public class WrapperClasses {
  public static void main(String[] args) {
    // Integer
    // using constructor
    // Note: Deprecated
    Integer integer = new Integer(5);

    // Integer
    // using valueOf
    // It will use existing object from cache in JVM
    Integer integer1 = Integer.valueOf(5);

    // Boolean
    // using constructor
    // Note: Deprecated
    Boolean b = new Boolean("tRue");
    Boolean b1 = new Boolean("FalsE");
    Boolean b2 = new Boolean("SomethingElse");
    System.out.println(b); // true
    System.out.println(b1); // false
    System.out.println(b2); // false

    // Boolean
    // using valueOf
    Boolean bool1 = Boolean.valueOf("tRue");
    Boolean bool2 = Boolean.valueOf("FalsE");
    Boolean bool3 = Boolean.valueOf("SomethingElse");

    // Character
    // using constructor
    // Note: Deprecated
    Character c = new Character('C');

    // Character
    // using valueOf
    Character char1 = Character.valueOf('C');

    // Float
    // using constructor
    // Note: Deprecated
    Float f = new Float(10.3f);

    // Float
    // using valueOf
    Float fl = Float.valueOf(10.3f);

    // Double
    // using constructor
    // Note: Deprecated
    Double d = new Double(10.3);

    // Double
    // using valueOf
    Double db1 = Double.valueOf(10.5);

    // Auto boxing
    // Primitive type to wrapper class conversion
    Integer int3 = Integer.valueOf(5);
    Integer int4 = 5; // Auto boxing -> It uses valueOf(5)
  }
}
