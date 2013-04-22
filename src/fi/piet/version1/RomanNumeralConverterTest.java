package fi.piet.version1;

import java.util.LinkedHashMap;
import java.util.Map;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

public class RomanNumeralConverterTest extends TestCase {
	
	@SuppressWarnings("serial")
	private static Map<Integer, String> NUMBER_TO_ROMAN = new LinkedHashMap<Integer, String>() {{
		put(10, "X");
		put(9, "IX");
		put(8, "VIII");
		put(5, "V");
		put(4, "IV");
		put(1, "I");
		put(70, "LXX");
		put(49, "XLIX");
	}};
	
	private RomanNumeralConverter converter;
	
	@Before
	public void setUp() {
		converter = new RomanNumeralConverter();
	}
	
	@Test
	public void testArabicToRomanNumeralConversion() {
		for (Map.Entry<Integer, String> valuePair : NUMBER_TO_ROMAN.entrySet()) {
			assertEquals(valuePair.getValue(), converter.toRomanNumeral(valuePair.getKey()));
		}
	}
	
	@Test
	public void testRomanNumeralToArabicConversion() {
		for (Map.Entry<Integer, String> valuePair : NUMBER_TO_ROMAN.entrySet()) {
			assertEquals(valuePair.getKey().intValue(), converter.toArabic(valuePair.getValue()));
		}
	}
}
