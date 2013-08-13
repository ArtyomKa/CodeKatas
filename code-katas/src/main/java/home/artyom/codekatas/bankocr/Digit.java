package home.artyom.codekatas.bankocr;

public class Digit {

	public static final Digit INV = new Digit(-1);
	public static final Digit ZERO = new Digit(0);
	public static final Digit ONE = new Digit(1);
	public static final Digit TWO = new Digit(2);
	public static final Digit THREE = new Digit(3);
	public static final Digit FOUR = new Digit(4);
	public static final Digit FIVE = new Digit(5);
	public static final Digit SIX = new Digit(6);
	public static final Digit SEVEN = new Digit(7);
	public static final Digit EIGHT = new Digit(8);
	public static final Digit NINE = new Digit(9);
	
	
	private final int digit;   
	private Digit(int digit) {
		this.digit = digit;
	}
	
	@Override
	public String toString() {
		return String.valueOf(digit);
	}
}
