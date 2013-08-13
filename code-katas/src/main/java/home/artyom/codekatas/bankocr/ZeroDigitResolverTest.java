package home.artyom.codekatas.bankocr;

import org.junit.Assert;
import org.junit.Test;

public class ZeroDigitResolverTest {
	LineDigitResolver resolver = new LineDigitResolver();
	@Test
	public void testResolve0() {
		Assert.assertEquals(Digit.ZERO,resolver.resolve(" _ ","| |","|_|"));
	}
	

	@Test
	public void testResolve1() {
		Assert.assertEquals(Digit.ONE,resolver.resolve("   ","  |","  |"));
	}
	
	@Test
	public void testResolve2() {
		Assert.assertEquals(Digit.TWO,resolver.resolve(" _ "," _|","|_ "));
	}
	@Test
	public void testResolve3() {
		Assert.assertEquals(Digit.THREE,resolver.resolve(" _ "," _|"," _|"));
	}


}
