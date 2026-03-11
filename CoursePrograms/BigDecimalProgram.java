package CoursePrograms;

import java.math.BigDecimal;

public class BigDecimalProgram {
  public static void main(String[] args) {

    /*
     * Note: We should use float or double data types for financial calculations
     * as these are not accurate.
     * 
     * Example: 34.56789876 + 34.2234
     * ==> 68.79129875999999
     * 
     * Here 999999 values coming randomly. Hence, it's not accurate.
     * That's why we need to use BigDecimal
     */

    /*
     * BigDecimal: This class is used to store large values or for calculations
     * where we need accurate results. It is not a primitive data type.
     * 
     * To use this, we need to import java.math.BigDecimal
     * 
     * Syntax:
     * BigDecimal variableName = new BigDecimal("value") <- Insert value here
     *
     * Note: Values need to put in "" (As a String).
     * Reason is, it will append unwanted values if we don't use String as it will
     * consider the number as double
     * 
     * Note: BigDecimal class are immutable. Once they are defined, it cannot be
     * changed
     * 
     * Note: We cannot use +, -, *, / to perform arithmetic operations for
     * BigDecimal numbers. For them, we have separate methods
     */

    BigDecimal bigDecimal1 = new BigDecimal("34.56789876");
    BigDecimal bigDecimal2 = new BigDecimal("34.2234");

    // To perform addition
    System.out.println(bigDecimal1.add(bigDecimal2));
    // To perform subtract
    System.out.println(bigDecimal1.subtract(bigDecimal2));
    // To perform multiply
    System.out.println(bigDecimal1.multiply(bigDecimal2));
    // To perform divide
    System.out.println(bigDecimal1.divide(bigDecimal2));

    BigDecimal number3 = new BigDecimal("11.5");
    int i = 5;

    // If we want to add number3 value and i, it won't work as i is integer
    // and number3 is BigDecimal.
    // number3.add(i);

    // To make them work, we need to convert integer i to BigDecimal
    System.out.println(number3.add(new BigDecimal(i)));
  }
}
