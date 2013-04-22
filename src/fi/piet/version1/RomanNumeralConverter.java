package fi.piet.version1;

import java.util.LinkedHashMap;
import java.util.Map;

public class RomanNumeralConverter {

	@SuppressWarnings("serial")
	private static Map<Integer, String> COMPARE_CHARS = new LinkedHashMap<Integer, String>() {{
		put(50, "L");
		put(40, "XL");
		put(10, "X");
		put(9, "IX");
		put(5, "V");
		put(4, "IV");
		put(1, "I");
	}};
	
	String result;
	int arabicResult;
	
	public int toArabic(String roman) {
		arabicResult = 0;
		for (Map.Entry<Integer, String> entry : COMPARE_CHARS.entrySet()) {
			roman = convertRomanToArabic(roman, entry.getValue(), entry.getKey());
		}
		return arabicResult;
	}
	
	private String convertRomanToArabic(String roman, String compareChar, Integer arabicValue) {
		while (romanStartsWithChar(roman, compareChar)) {
			arabicResult +=arabicValue;
			roman = removeCompareCharFromRoman(roman, compareChar);
		}
		return roman;
	}

	private String removeCompareCharFromRoman(String roman, String compareChar) {
		return roman.substring(compareChar.length());
	}

	private boolean romanStartsWithChar(String roman, String compareChar) {
		return roman.startsWith(compareChar);
	}

	public String toRomanNumeral(int num) {
		result = "";
		for (Map.Entry<Integer, String> numberToString : COMPARE_CHARS.entrySet()) {
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
