package home.artyom.codekatas.stringcalc;


public class StringCalculator {

	/**
	 * @param inputNumbers
	 * @return sum of the numbers. 0 on empty string.
	 */
	public int sum(String inputNumbers) {
		if (inputNumbers.isEmpty())
			return 0;
		else {
			return sumNumbers(parseInput(inputNumbers));
		}
	}

	private String[] parseInput(String inputNumbers) {
		String[] numbers = inputNumbers.split(",");
		return numbers;
	}

	private int sumNumbers(String[] numbers) {
		int sum = 0;
			for(String number : numbers){
				sum += toInt(number);
			}
			return sum;
	}

	private int toInt(String aNumber) {
		return Integer.parseInt(aNumber);
	}

}
