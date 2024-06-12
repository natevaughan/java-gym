package com.natevaughan.javagym.flashcard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FlashCardTest {
	@Test
	public void throwsNPE() {
		assertThrows(NullPointerException.class, () -> {
			new FlashCard(null, "foo");
		});
	}

}
