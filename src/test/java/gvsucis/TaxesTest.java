package gvsucis;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TaxesTest {

  @Test
  public void noIncome() {
    assertEquals(0, Taxes.jointTaxes(0), 1.0);
  }
  
  @Test
  public void oneDollar() {
    assertEquals(0.1, Taxes.jointTaxes(1.0), 1.0);
  }

  @Test
  public void topOfTenPct() {
    assertEquals(1940, Taxes.jointTaxes(19400), 1.0);
  }
  @Test
  public void bottomTwelve() {
    assertEquals(1952, Taxes.jointTaxes(19500), 1.0);
  }

  @Test
  public void topTwelve() {
    assertEquals(9080, Taxes.jointTaxes(78900), 1.0);
  }

  @Test
  public void bottom22() {
    assertEquals(9317, Taxes.jointTaxes(80000), 1.0);
  }

  @Test
  public void top22() {
    assertEquals(24717, Taxes.jointTaxes(150000), 1.0);
  }

  @Test
  public void bottom32() {
    assertEquals(65497, Taxes.jointTaxes(321450));  
  }

  @Test
  public void top32() {
    assertEquals(93257, Taxes.jointTaxes(408200));  
  }

  @Test
  public void bottom35() {
    assertEquals(93607, Taxes.jointTaxes(409200), 1.0);
  }

  @Test
  public void top35() {
    assertEquals(164586.5, Taxes.jointTaxes(612000), 1.0);
  }




}