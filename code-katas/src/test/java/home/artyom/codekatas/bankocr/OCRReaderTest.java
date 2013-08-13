package home.artyom.codekatas.bankocr;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class OCRReaderTest {

	private OCRReader reader;

	@Before public void setUp() {
		reader = new OCRReader();
	}
	
	@Test
	public void testRecognizeSingel0() {
		OCRReader reader = new OCRReader(); 
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| |").append("\n")
						  .append("|_|").append("\n").toString();
		
		Digit[] expected = {Digit.ZERO};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	@Test(expected = IllegalArgumentException.class)
	public void uneven_lines_throws_exception() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| | ").append("\n")
						  .append("|_|").append("\n").toString();
		
		Assert.assertEquals(0, reader.read(numbers));

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void less_than_three_lines_throws_exception() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| |").append("\n").toString();
		
		Assert.assertEquals(0, reader.read(numbers));

	}
	
	
	@Test 
	public void testRecognizeSingel1() {
		String numbers = 
		new StringBuffer().append("   ").append("\n")
					      .append("  |").append("\n")
						  .append("  |").append("\n").toString();
		
		Digit[] expected = {Digit.ONE};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	
	@Test 
	public void testRecognizeSingel2() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append(" _|").append("\n")
						  .append("|_ ").append("\n").toString();
		
		Digit[] expected = {Digit.TWO};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	
	@Test 
	public void testRecognizeSingel3() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append(" _|").append("\n")
						  .append(" _|").append("\n").toString();
		
		Digit[] expected = {Digit.THREE};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	
	@Test 
	public void testRecognizeSingel4() {
		String numbers = 
		new StringBuffer().append("   ").append("\n")
					      .append("|_|").append("\n")
						  .append("  |").append("\n").toString();
		
		Digit[] expected = {Digit.FOUR};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	

	@Test 
	public void testRecognizeSingel5() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("|_ ").append("\n")
						  .append(" _|").append("\n").toString();
		
		Digit[] expected = {Digit.FIVE};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}

	@Test 
	public void testRecognizeSingel6() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("|_ ").append("\n")
						  .append("|_|").append("\n").toString();
		
		Digit[] expected = {Digit.SIX};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	

	@Test 
	public void testRecognizeSingel7() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("  |").append("\n")
						  .append("  |").append("\n").toString();
		
		Digit[] expected = {Digit.SEVEN};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	

	@Test 
	public void testRecognizeSingel8() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("|_|").append("\n")
						  .append("|_|").append("\n").toString();
		
		Digit[] expected = {Digit.EIGHT};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	

	@Test 
	public void testRecognizeSingel9() {
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("|_|").append("\n")
						  .append(" _|").append("\n").toString();
		
		Digit[] expected = {Digit.NINE};
		Assert.assertArrayEquals(expected, reader.read(numbers));

	}
	
	@Test 
	public void testRecognize1298() {
		String numbers = 
		new StringBuffer().append("    _  _  _ ").append("\n")
					      .append("  | _||_||_|").append("\n")
						  .append("  ||_  _||_|").append("\n").toString();
		
		Digit[] expected = {Digit.ONE,Digit.TWO,Digit.NINE,Digit.EIGHT};
		
		Digit[] result = reader.read(numbers);
		System.out.println(result);
		Assert.assertArrayEquals(expected, result);

	}
	
	

}
