package home.artyom.codekatas.bankocr;

import java.util.HashMap;
import java.util.Map;

public class LineDigitResolver {
	
	private static Map<String,Digit> digits = new HashMap<String,Digit>();
	static {
		digits.put(" _ | ||_|", Digit.ZERO);
		digits.put("     |  |", Digit.ONE);
		digits.put(" _  _||_ ", Digit.TWO);
		digits.put(" _  _| _|", Digit.THREE);
	}
	
	
	public Digit resolve(String... segments)
	{
		StringBuffer sb = new StringBuffer();
		for (String string : segments) {
			sb.append(string);
		}
		Digit digit = digits.get(sb.toString());
		return digit != null ? digit : Digit.INV;
	}
}
