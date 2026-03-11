package CoursePrograms;

public class PrimitiveDataTypeInteger {
  public static void main(String[] args) {
    /*
     * There are 4 data types which can be used for integer numbers
     * They all vary on the size
     * Byte - 8 bits
     * Short - 16 bits
     * Integer - 32 bits
     * Long - 64 bits
     * 
     * 
     * Wrapper classes: These are the classes where the primitive data types like
     * (byte, short, int, long) can be used as an objects
     * 
     * For example: For each primitive data type, there will be a wrapper class
     * 
     * byte -> Byte
     * short -> Short
     * int -> Integer
     * long -> Long
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

    // Note: By default, all literals are integers
    // Example: int num = 500000;

    /*
     * Note: We cannot put a larger value into smaller value
     * Example:
     * int i = 50;
     * long l = 500000000l;
     * i = l -> Throws an error as int is small
     * 
     * If we sure that the long value will fit in the int, we can do casting
     * 
     * Casting: Converting from one type to another
     * i = (int) l;
     * This is called as "Explicit Casting", where we are telling do perform
     * casting "Explicitly"
     * Here we are casting long l value to int and trying to store it in i
     * 
     * 
     * l = i
     * Here we are copying smaller value to larger and it doesn't need any explicit
     * conversion.
     * This is called as "Implicit Casting"
     * 
     * 
     * Basically
     * higher <- smaller (Implicit)
     * smaller <- higher (Explicit)
     */

    // Octal representation:
    // Anything starting with 0 is Octal
    // Numbers: 0 to 7 (Inside 8)
    int eight = 010;
    System.out.println(eight);

    // Hexadecimal representation
    // Anything starting with 0x is Octal
    // Numbers: 0 to 9, A, B, C, D, E and F
    int sixteen = 0x10;
    System.out.println(sixteen);

    int fifteen = 0xF;
    System.out.println(fifteen);

    // Note: If we declare variable with int as data type and try to copy
    // the data to another variable, lets say short. It will throw an error
    int i = 12345;
    // short s = i; -> Error
    // Reason is even though i has smaller value which is in range in short
    // MAX_VALUE, it thinks integer data type will be having higher value.
    // We can do casting and say that, yes we are sure that i has smaller value
    // and it is in range of short
    short s = (short) i;
    System.out.println(s);

  }
}
