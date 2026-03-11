package CoursePrograms;

public class PrimitiveDataTypeFloat {
  public static void main(String[] args) {
    /*
     * There are 2 data types which can be used for decimal numbers
     * They all vary on the size
     * float - 32 bits
     * double - 64 bits
     * 
     * Note: Choose the datatype based on the range while storing values
     * 
     * We cannot store double value into float
     * float f = 34; -> Error
     */

    // Float
    // Both f an F works
    float f = 34.5f;
    float f1 = 34.5F;
    System.out.println(f);
    System.out.println(f1);

    // Explicit casting
    float f3 = (float) 34.5;
    System.out.println(f3);

    // Double
    double dbl = 34.12345;
    System.out.println(dbl);

    // Casting from floating value to integer
    // f3 = 34.5
    int i = (int) f3;
    System.out.println(i); // 34 (Decimal value got removed)

    float f4 = i; // implicit conversion
    System.out.println(f4); // 34.0
  }
}
