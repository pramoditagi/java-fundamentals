package CourseProblems;

import java.math.BigDecimal;

public class BigDecimalExample {
  public static void main(String[] args) {
      BigDecimal bigNum = new BigDecimal("37.12423677");
      int num = 10;
      System.out.println(bigNum.add(new BigDecimal(num)));
  }
}
