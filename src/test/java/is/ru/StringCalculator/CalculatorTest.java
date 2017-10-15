package is.ru.StringCalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
  @Test
 	public void testEmptyString() {
 		assertEquals(0, Calculator.add(""));
 	}
  @Test
 	public void testOneNumber() {
 		assertEquals(1, Calculator.add("1"));
 	}
  @Test
  public void testTwoNumbers() {
 		assertEquals(3, Calculator.add("1,2"));
 	}
  @Test
  public void testMultipleNumbers() {
 		assertEquals(15, Calculator.add("1,2,3,4,5"));
 	}
  @Test
  public void testNewLine() {
 		assertEquals(6, Calculator.add("1\n2,3"));
 	}
  @Test
	public void testNegatives() {
    	try {
    	    Calculator.add("3,-2,-3");
					junit.framework.Assert.fail("Negatives not allowed");
    	}
    	catch (IllegalArgumentException exception) {
					final String expectedOutcome = "Negatives not allowed: [-2, -3]";
					assertEquals(expectedOutcome, exception.getMessage());
    	}
    }
  @Test
  public void testIgnore1000() {
 		assertEquals(6, Calculator.add("1,1001,2,3,2000"));
 	}
  @Test
  public void testDelimiter() {
 		assertEquals(15, Calculator.add("//;\n1;2,3;4\n5"));
 	}

}
