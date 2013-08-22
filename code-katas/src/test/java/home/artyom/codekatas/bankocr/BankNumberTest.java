package home.artyom.codekatas.bankocr;

import org.junit.Assert;
import org.junit.Test;

public class BankNumberTest {

	@Test
	public void test() {
		int[] digits = {1,2,3,4,5,6};
		BankNumber bankNumber = new BankNumber(digits);
		Assert.assertEquals("123456", bankNumber.toString());
	}

}
