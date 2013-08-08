package home.artyom.codekatas.bankocr;

public class OCRReader {

	public int read(String buffer) {
		String[] lines = buffer.split("\n");
		validateInput(lines);
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
