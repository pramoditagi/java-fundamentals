package CodingExercises;

import java.math.BigDecimal;

public class SimpleInterestCalculator {
  private String principal, interest;

  public SimpleInterestCalculator(String principal, String interest) {
    this.principal = principal;
    this.interest = interest;
  }

  BigDecimal calculateTotalValue(int years) {
    BigDecimal principalAmount = new BigDecimal(principal);
    BigDecimal interestVal = new BigDecimal(interest);
    return principalAmount
        .add(principalAmount.multiply(interestVal.divide(new BigDecimal(100))).multiply(new BigDecimal(years)));
  }

  public static void main(String[] args) {
    SimpleInterestCalculator calculator = new SimpleInterestCalculator("4500.00", "7.5");
    BigDecimal totalValue = calculator.calculateTotalValue(5);
    System.out.println(totalValue);

  }
}
