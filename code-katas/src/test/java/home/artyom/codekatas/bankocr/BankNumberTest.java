package home.artyom.codekatas.bankocr;

import org.junit.Assert;
import org.junit.Test;

public class BankNumberTest {

	@Test
	public void testCreationFromDigits() {
		int[] digits = {1,2,3,4,5,6};
		BankNumber bankNumber = new BankNumber(digits);
		Assert.assertEquals("123456", bankNumber.toString());
	}
	
	@Test
	public void testLegalChecksum() {
		int[] digits = {0,0,0,0,0,0,0,5,1};
		BankNumber bankNumber = new BankNumber(digits);
		Assert.assertTrue(bankNumber.isValid());
	}
	
	@Test
	public void testIllegalChecksum() {
		int[] digits = {6,6,4,3,7,1,4,9,5};
		BankNumber bankNumber = new BankNumber(digits);
		Assert.assertFalse(bankNumber.isValid());
	}

}
