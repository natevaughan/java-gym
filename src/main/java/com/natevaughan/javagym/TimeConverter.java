package com.natevaughan.javagym;

public class TimeConverter {
	public static String militaryFromAMPM(String time) {
		var hour = Integer.parseInt(time.substring(0, 2)) % 12;
		if ("PM".equals(time.substring(time.length() - 2))) {
			hour += 12;
		}
		return String.format("%02d%s", hour, time.substring(2, time.length() - 2));
	}
}
