package CourseProblems;

public class DataTypeSize {
  public static void main(String[] args) {
    // To check Size of each data type
    System.out.println(Byte.SIZE);
    System.out.println(Short.SIZE);
    System.out.println(Integer.SIZE);
    System.out.println(Long.SIZE);

    // Data type size in Byte
    System.out.println(Byte.BYTES);
    System.out.println(Short.BYTES);
    System.out.println(Integer.BYTES);
    System.out.println(Long.BYTES);

    // Data type MAX VALUE
    System.out.println(Byte.MAX_VALUE);
    System.out.println(Short.MAX_VALUE);
    System.out.println(Integer.MAX_VALUE);
    System.out.println(Long.MAX_VALUE);

    // Data type MIN VALUE
    System.out.println(Byte.MIN_VALUE);
    System.out.println(Short.MIN_VALUE);
    System.out.println(Integer.MIN_VALUE);
    System.out.println(Long.MIN_VALUE);

    // long l = 10000000000; Throws error has by default number is integer
    long l = 10000000000l; // specify l for long
    int i;
    i = (char) l; // explicit conversion
    l = i; // Implicit conversion

    // Octal
    int eight = 010; // 8
    // Hexadecimal
    int sixteen = 0x10; // 16
  }
}
