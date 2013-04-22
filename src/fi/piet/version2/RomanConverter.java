package fi.piet.version2;

public class RomanConverter {
	
	public String convert(int number) {
		Roman roman = findLargestRoman(number);
		if (roman == null) {
			return "";
		}
		return roman.toString() + convert(number - roman.getValue());
	}
	
	public Roman findLargestRoman(int number) {
		for (Roman roman : Roman.values()) {
			if (number >= roman.getValue()) {
				return roman;
			}
		}
		return null;
	}
}
