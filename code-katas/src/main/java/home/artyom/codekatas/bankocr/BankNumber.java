package home.artyom.codekatas.bankocr;

import java.util.Arrays;

public class BankNumber {

	private final int[] digits;
	private final String asString;
	public BankNumber(int[] digits) {
		this.digits = Arrays.copyOf(digits, digits.length);
		asString = parseString();
	}

	@Override
	public String toString() {
	
		return asString;
	}

	private String parseString() {
		StringBuffer sb = new StringBuffer();
		for(int digit: digits){
			sb.append(digit);
		}
		return  sb.toString();
	}
}
