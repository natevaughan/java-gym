package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TimeConverterTest {
	@Test
	public void convertOneDigitHourPM() {
		assertEquals("19:05:45", TimeConverter.militaryFromAMPM("07:05:45PM"));
	}

	@Test
	public void convertOneDigitHourAM() {
		assertEquals("07:05:45", TimeConverter.militaryFromAMPM("07:05:45AM"));
	}

	@Test
	public void convertTwelveAM() {
		assertEquals("00:05:45", TimeConverter.militaryFromAMPM("12:05:45AM"));
	}

	@Test
	public void convertTwelvePM() {
		assertEquals("12:05:45", TimeConverter.militaryFromAMPM("12:05:45PM"));
	}
}
