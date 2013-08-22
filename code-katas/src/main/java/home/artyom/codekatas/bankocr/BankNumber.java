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

	public boolean isValid() {
		int sum = 0;
		for(int i = digits.length; i > 0; i--){
			int coeff = digits.length - i+1;
			sum += (digits[i-1]*coeff);
		}
		return sum%11 == 0;
	}
}
