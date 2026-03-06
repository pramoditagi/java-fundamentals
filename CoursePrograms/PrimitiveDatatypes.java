package CoursePrograms;

public class PrimitiveDatatypes {
  public static void main(String[] args) {
    /*
     * There are 4 data types which can be used for integer numbers
     * They all vary on the size
     * Byte - 8 bits
     * Short - 16 bits
     * Integer - 32 bits
     * Long - 64 bits
     * 
     * Note: Choose the datatype based on the range while storing values
     */

    // Example: Byte
    // This can be used to store small values
    // Range: -128 to 127
    byte score = 2;
    System.out.println("Score: " + score);

    // Example: Short
    // This can be used to slightly bigger values compared to byte
    // Range: -128 to 127
    short wickets = 2;
    System.out.println("Wickets: " + wickets);

    // Example: Integer
    // This is commonly used data type for integer and store maximum values.
    // Range: -2,147,483,648 to 2,147,483,647
    int studentsCount = 45677;
    System.out.println("Number of students in the school: " + studentsCount);

    // Example: Long
    // This can be used to store large values
    // We need to l in front of the number to denote it as long
    // Range: -9,223,372,036,854,77,808 to 9,223,372,036,854,77,807
    long populationOfTheWorld = 24562325672l;
    System.out.println("Population of the world: " + populationOfTheWorld);

    /*
     * There are 2 data types which can be used for decimal numbers
     * They all vary on the size
     * float - 32 bits
     * double - 64 bits
     * 
     * Note: Choose the datatype based on the range while storing values
     */

    // Example: Float
    // This can be used to store floating point (decimal) values
    // Range: -2,147,483,648 to 2,147,483,647
    // Note: Only thing for float is, we need to provide f in front of decimal
    // number to denote it as it's a floating point value.
    // Note: DO NOT USE THIS FOR FINANCIAL CALCULATION AS RESULT IS NOT ACCURATE
    float average = 2.5f;
    System.out.println("Average: " + average);

    // Example: Double
    // This can be used to store decimal values which are bigger than floating point
    // values
    // Range: -9,223,372,036,854,77,808 to 9,223,372,036,854,77,807
    // Note: By default, all decimal numbers are double.
    // Note: DO NOT USE THIS FOR FINANCIAL CALCULATION AS RESULT IS NOT ACCURATE
    double pi = 3.142;
    System.out.println("Pi Value: " + pi);

    /*
     * Note: We cannot put larger value into smaller value. It will throw an error
     * Example:
     * float <- double
     * int <- long
     */

    /*
     * Character (char)
     * This is used to store single character.
     * It should be enclosed within single quotes ''
     * It cannot have more than 1 character
     * Range: -128 to 127
     */

    // Example:
    char grade = 'A';
    System.out.println("Grade of a student: " + grade);

    /*
     * Boolean (boolean)
     * It is used to store boolean values (true or false)
     * Only 2 values it will store.
     * It is case sensitive
     * By default it will be false
     */
    boolean isPrime = true;
    boolean isValid = false;
    System.out.println("Is Prime: " + isPrime);
    System.out.println("Is Valid: " + isValid);
  }
}
