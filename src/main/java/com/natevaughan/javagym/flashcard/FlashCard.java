package com.natevaughan.javagym.flashcard;

public class FlashCard {
	private final String question;
	private final String answer;

	public FlashCard(String question, String answer) {
		if (question == null) {
			throw new NullPointerException("Question cannot be null");
		}
		if (answer == null) {
			throw new NullPointerException("Answer cannot be null");
		}
		this.question = question;
		this.answer = answer;
	}

	public String getQuestion() {
		return question;
	}

	public String getAnswer() {
		return answer;
	}
}
