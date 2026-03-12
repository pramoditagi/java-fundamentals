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
     * 
     * // Note: By default, all literals are integers
     * // Example: int num = 500000;
     * 
     * /*
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
