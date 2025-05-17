package org.fbp;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
  @Test
  @DisplayName("Test addition of two numbers")
  public void testSum() {
    assertEquals(5.0, Calculator.sum(2, 3).doubleValue(),
      "2 + 3 should equal 5");

    assertEquals(5.5, Calculator.sum(2.5, 3.0).doubleValue(),
      "2.5 + 3.0 should equal 5.5");

    assertEquals(-1.0, Calculator.sum(2, -3).doubleValue(),
      "2 + (-3) should equal -1");
  }

  @Test
  @DisplayName("Test subtraction of two numbers")
  public void testsubtract() {
    assertEquals(2.0, Calculator.subtract(5, 3).doubleValue(),
      "5 - 3 should equal 2");

    assertEquals(1.5, Calculator.subtract(4.5, 3.0).doubleValue(),
      "4.5 - 3.0 should equal 1.5");

    assertEquals(8.0, Calculator.subtract(5, -3).doubleValue(),
      "5 - (-3) should equal 8");
  }

  @Test
  @DisplayName("Test multiplication of two numbers")
  public void testmultiply() {
    assertEquals(15.0, Calculator.multiply(5, 3).doubleValue(),
      "5 * 3 should equal 15");

    assertEquals(13.5, Calculator.multiply(4.5, 3.0).doubleValue(),
      "4.5 * 3.0 should equal 13.5");

    assertEquals(-15.0, Calculator.multiply(5, -3).doubleValue(),
      "5 * (-3) should equal -15");

    assertEquals(0.0, Calculator.multiply(5, 0).doubleValue(),
      "5 * 0 should equal 0");
  }
}
