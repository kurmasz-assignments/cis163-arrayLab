package gvsucis;

public class Taxes {

  /**
   * Compute the taxes due given a status of "Married, Filing Jointly" for the
   * 2019 tax year.
   * 
   * @param taxableIncome the taxable income
   * @return taxes due
   */
  public static double jointTaxes(double taxableIncome) {

    // 2019 Tax brackets: https://www.debt.org/tax/brackets/
    // 2019 Tax schedule (with base tax for each bracket):
    // https://turbotax.intuit.com/tax-tips/irs-tax-return/current-federal-tax-rate-schedules/L7Bjs1EAD

    double upperBound[] = { 19400, 78950, 168400, 321450, 408200, 612350 };
    double rate[] = { 0.1, 0.12, 0.22, 0.24, 0.32, 0.35 };

    double totalTax = 0;

    // 

    return totalTax;
  }
}