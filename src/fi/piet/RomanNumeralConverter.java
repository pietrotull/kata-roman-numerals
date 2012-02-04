package fi.piet;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralConverter {

	@SuppressWarnings("serial")
	private static Map<Integer, String> NUMBER_TO_ROMAN = new LinkedHashMap<Integer, String>() {{
		put(50, "L");
		put(40, "XL");
		put(10, "X");
		put(9, "IX");
		put(5, "V");
		put(4, "IV");
		put(1, "I");
	}};
	
	String result;
	
	public String convert(int num) {
		result = "";
		for (Map.Entry<Integer, String> numberToString : NUMBER_TO_ROMAN.entrySet()) {
			num = convertNumberToRoman(num, numberToString.getKey(), numberToString.getValue());
		}
		return result;
	}

	private int convertNumberToRoman(int num, int step, String romanNumeral) {
		while (num >= step) {
			result += romanNumeral;
			num -= step;
		}
		return num;
	}
}
