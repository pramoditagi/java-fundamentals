package PracticePrograms;

import java.math.BigDecimal;

public class SimpleInterest {

  private String principal, interest;

  public SimpleInterest(String principal, String interest) {
    this.principal = principal;
    this.interest = interest;
  }

  BigDecimal calculateTotalValue(int noOfYears) {
    BigDecimal principalAmount = new BigDecimal(principal);
    BigDecimal interestPercentage = new BigDecimal(interest).divide(new BigDecimal(100));
    BigDecimal years = new BigDecimal(noOfYears);

    return principalAmount.add((principalAmount).multiply(interestPercentage).multiply(years));
  }

  public static void main(String[] args) {
    SimpleInterest simpleInterest = new SimpleInterest("4500.00", "7.5");
    BigDecimal totalValue = simpleInterest.calculateTotalValue(5);
    System.out.println(totalValue);
  }
}
