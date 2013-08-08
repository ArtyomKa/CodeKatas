package home.artyom.codekatas.stringcalc;


import home.artyom.codekatas.stringcalc.StringCalculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringCalculatorTest {

	private StringCalculator calculator;
	@Before
	public void before() {
		calculator = new StringCalculator();
	}
	@Test
	public void should_return_0_on_empty_string() {
		Assert.assertEquals(0, calculator.sum(""));
	}
	@Test
	public void should_return_the_onlc_number_passed() {
		Assert.assertEquals(1, calculator.sum("1"));
	}
	@Test
	public void should_return_the_sum_of_two_numbers() {
		Assert.assertEquals(3, calculator.sum("1,2"));
	}
	@Test
	public void should_return_the_sum_of_two_series_of_numbers() {
		Assert.assertEquals(10, calculator.sum("1,2,3,4"));
	}

}