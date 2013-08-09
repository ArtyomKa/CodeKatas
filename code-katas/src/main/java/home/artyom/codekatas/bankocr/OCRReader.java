package home.artyom.codekatas.bankocr;

public class OCRReader {

	/**
	 * @param buffer
	 * @return 
	 */
	public int[] read(String buffer) {
		int[] result = new int[1];
		String[] lines = buffer.split("\n");
		validateInput(lines);
		result[0] = 0;
		return result;
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
