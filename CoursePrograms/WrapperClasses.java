package CoursePrograms;

public class WrapperClasses {
  public static void main(String[] args) {
    /*
     * Wrapper classes: These are the classes where the primitive data types like
     * (byte, short, int, long) can be used as an objects
     * 
     * For example: For each primitive data type, there will be a wrapper class
     * 
     * byte -> Byte
     * short -> Short
     * int -> Integer
     * long -> Long
     * float -> Float
     * double -> Double
     * char -> Character
     * boolean -> Boolean
     * 
     * These can be used to get the size, maximum value and minimum value of these
     * primitive data types can hold
     * 
     * Syntax:
     * WrapperClass.method
     * 
     * Here the wrapper classes will be primitive data types
     */

    // SIZE: This is used to get the size of the data type in bits
    // For byte:
    System.out.println(Byte.SIZE); // 8 bits
    // For short:
    System.out.println(Short.SIZE); // 16 bits
    // For int:
    System.out.println(Integer.SIZE); // 32 bits
    // For long:
    System.out.println(Long.SIZE); // 64 bits

    // BYTES: This is used to get the size of the data type in bytes
    // For byte:
    System.out.println(Byte.BYTES); // 1 byte
    // For short:
    System.out.println(Short.BYTES); // 2 byte
    // For int:
    System.out.println(Integer.BYTES); // 3 byte
    // For long:
    System.out.println(Long.BYTES); // 4 byte

    // MAX_VALUE: This is used to get the minimum size that can be stored in data
    // type
    // For byte:
    System.out.println(Byte.MAX_VALUE); // 127
    // For short:
    System.out.println(Short.MAX_VALUE); // 32767
    // For int:
    System.out.println(Integer.MAX_VALUE); // 2147483647
    // For long:
    System.out.println(Long.MAX_VALUE); // 9223372036854775807

    // MIN_VALUE: This is used to get the maximum size that can be stored in data
    // type
    // For byte:
    System.out.println(Byte.MIN_VALUE); // -128
    // For short:
    System.out.println(Short.MIN_VALUE); // -32768
    // For int:
    System.out.println(Integer.MIN_VALUE); // -2147483648
    // For long:
    System.out.println(Long.MIN_VALUE); // -9223372036854775808

    /*
     * Why we need wrapper classes ?
     * 
     * Answer:
     * 1. With wrapper classes we can create values from other data types
     * 2. Wrapper classes provides utility methods (Conversion)
     * 3. To store primitive values into collection as collection needs objects
     */

    // Creation of wrapper classes:

    // 1.Using Constructor
    // This is deprecated
    Integer integer = new Integer(5);

    // 2. Using valueOf
    // This can be used using valueOf
    Integer integer1 = Integer.valueOf(5);
    System.out.println(integer1);

    // valueOf can accept String values as well and returns integer
    Integer integer2 = Integer.valueOf("5464");
    System.out.println(integer2);

    // Which one to use? Constructor approach or valueOf() approach
    Integer i1 = new Integer(5);
    Integer i2 = new Integer(5);

    Integer i3 = Integer.valueOf(5);
    Integer i4 = Integer.valueOf(5);

    // The result would be false
    // as these are reference types and even though values are same, differ in
    // memory location as new object is getting created as we are using "new"
    System.out.println(i1 == i2);

    /*
     * The result would be true
     * The reason is wrapper classes are immutable and they will not create new
     * objects
     * 
     * The reason is these objects are cached in JVM.
     * Cached values are in the range of -128 to 127
     * 
     * Example of the Structure:
     * 
     * -128 -> Object A
     * -127 -> Object B
     * -126 -> Object C
     * ................
     * ................
     * 5 -> Object X <-------------- Integer.valueOf(5)
     * 4 -> Object Y
     * 
     * So here, we have used Integer.valueOf(5) which denotes -> Object X
     * So, it is using existing object. Hence, the result is true.
     * 
     * Note: It works only for small values. Like -128 to 127
     */
    System.out.println(i3 == i4);

    // Integer
    Integer number = new Integer(55);
    Integer number2 = Integer.valueOf("55");

    System.out.println(number);
    System.out.println(number2);

    // Float
    Float number3 = new Float(55.0f);
    Float number4 = new Float(55.0);
    Float number5 = Float.valueOf("55.0f");
    // Note that if we try to use Float f = Float.valueOf(55.0), it will throw error
    // As valueOf will consider 55.0 as double

    System.out.println(number3);
    System.out.println(number4);
    System.out.println(number5);

    // Char
    Character c1 = new Character('C');
    Character c2 = Character.valueOf('B');
    System.out.println(c1);
    System.out.println(c2);

    // Boolean
    /*
     * For Boolean, while using new Boolean, we can provide any combination for true
     * and false values. It will still consider and provide proper results
     * 
     * Combination like:
     * true
     * false
     * True
     * False
     * tRuE
     * FalSE
     * 
     * If we use valueOf(), then we need to provide proper values
     */
    Boolean b1 = new Boolean(true);
    Boolean b2 = new Boolean("True");
    Boolean b3 = new Boolean("FalSE");
    Boolean b4 = new Boolean("Something"); // Return false

    Boolean b5 = Boolean.valueOf("true");
    Boolean b6 = Boolean.valueOf(true);
    // Boolean b2 = Boolean.valueOf("True"); <- This wont work

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
    System.out.println(b4);
    System.out.println(b5);
    System.out.println(b6);

    /*
     * Auto boxing: Primitive type to Wrapper class conversion
     * Example:
     * int → Integer
     * double → Double
     * char → Character
     * 
     * But not:
     * String → Integer
     * String → Double
     * 
     * 
     * Here behind the scenes, it will run Integer.valueOf(7) when we pass the value
     * as 7 and returns the same value
     * 
     * Note that we need to pass the values as it is.
     */
    Integer seven = 7; // here 7 is primitive
    // When this executes, internally it executes Integer seven = Integer.valueOf(7)
    // So java does, primitive int -> Integer object

    System.out.println(seven);

    // This wont work as "7" is string
    // Integer seven = "7";
    // System.out.println(seven);

    /*
     * Wrapper classes have constants as well
     * 
     * Integer.BYTES;
     * Integer.SIZE;
     * Integer.MAX_VALUE;
     * Integer.MIN_VALUE
     */

  }
}
