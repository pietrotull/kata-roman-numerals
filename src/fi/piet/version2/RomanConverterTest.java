package fi.piet.version2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class RomanConverterTest {

	private RomanConverter converter = new RomanConverter();
	
	@Test
	public void convertZeroToEmptyString() {
		assertEquals("", converter.convert(0));
	}
	
	@Test
	public void convert1ToI() {
		assertEquals("II", converter.convert(2));
	}

	@Test
	public void convert4ToIV() {
		assertEquals("IV", converter.convert(4));
	}
	
	@Test
	public void convert6ToVI() {
		assertEquals("VI", converter.convert(6));
	}
	
	@Test
	public void convert9ToIX() {
		assertEquals("IX", converter.convert(9));
	}
	
	@Test
	public void convert10ToX() {
		assertEquals("X", converter.convert(10));
	}
	
	@Test
	public void convert14ToXIV() {
		assertEquals("XIV", converter.convert(14));
	}
	
	@Test
	public void convert47ToXLVII() {
		assertEquals("XLVII", converter.convert(47));
	}
	
	@Test
	public void convert50toL() {
		assertEquals("L", converter.convert(50));
	}
	
	@Test
	public void convert91toXCI() {
		assertEquals("XCI", converter.convert(91));
	}
	
	@Test
	public void convert114toCXIV() {
		assertEquals("CXIV", converter.convert(114));
	}
	
	@Test
	public void testAllConstants() {
		for (Roman roman : Roman.values()) {
			assertEquals(roman.toString(), converter.convert(roman.getValue()));
		}
	}
}
