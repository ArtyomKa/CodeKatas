package home.artyom.codekatas.bankocr;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class OCRReaderTest {

	@Test
	public void testRecognizeSingel0() {
		OCRReader reader = new OCRReader(); 
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| |").append("\n")
						  .append("|_|").append("\n").toString();
		
		Assert.assertEquals(0, reader.read(numbers));

	}
	@Test(expected = IllegalArgumentException.class)
	public void uneven_lines_throws_exception() {
		OCRReader reader = new OCRReader(); 
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| | ").append("\n")
						  .append("|_|").append("\n").toString();
		
		Assert.assertEquals(0, reader.read(numbers));

	}
	
	@Test(expected = IllegalArgumentException.class)
	public void less_than_three_lines_throws_exception() {
		OCRReader reader = new OCRReader(); 
		String numbers = 
		new StringBuffer().append(" _ ").append("\n")
					      .append("| |").append("\n").toString();
		
		Assert.assertEquals(0, reader.read(numbers));

	}
	
	@Test @Ignore
	public void testRecognizeSingel1() {
		OCRReader reader = new OCRReader(); 
		String numbers = 
		new StringBuffer().append("  ").append("\n")
					      .append("  |").append("\n")
						  .append("  |").append("\n").toString();
		
		Assert.assertEquals(1, reader.read(numbers));

	}

}
