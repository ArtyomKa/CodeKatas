package home.artyom.codekatas.bankocr;

public class OCRReader {

	
	private String[] lines;

	/**
	 * @param buffer
	 * @return 
	 */
	public Digit[] read(String buffer) {
		Digit[] result = new Digit[1];
		lines = buffer.split("\n");
		validateInput(lines);
		
		result[0] = parseDigit(digitIndex(0));
		return result;
	}

	private Digit parseDigit(int digitIndex) {
		
		LineDigitResolver resolver = new LineDigitResolver();
		return resolver.resolve(extractDigit(digitIndex));
		
	}

	private String[] extractDigit(int digitIndex) {
		String[] result = {		lines[0].substring(digitIndex, digitIndex+3),
				lines[1].substring(digitIndex, digitIndex+3),
				lines[2].substring(digitIndex, digitIndex+3)
		};
		return result;
	}

	private int digitIndex(int i) {
		
		return 0;
	}

	private void validateInput(String[] lines) {
		if(lines.length == 3){
			for(int i = 1; i < 2 ;i++){
				if(lines[i].length() != lines[0].length()){
					throw new IllegalArgumentException("Illegal Input");
				}
			}
		}
		else{
			throw new IllegalArgumentException("Illegal Input");
		}
	}

}
