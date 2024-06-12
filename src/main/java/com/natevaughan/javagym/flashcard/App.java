package com.natevaughan.javagym.flashcard;

import java.util.*;

public class App {

	private static List<FlashCard> ALL_CARDS = List.of(new FlashCard(
			"hello",
			"world"
	));

	public static void main(String[] args) {

		var list = new ArrayList<>(ALL_CARDS);
		Deque<FlashCard> flashCards = new ArrayDeque<>();
		while (!list.isEmpty()) {
			var rand = (int) Math.floor(Math.random() * list.size());
			flashCards.add(list.remove(rand));
		}
		Scanner scanner = new Scanner(System.in);

		try {
			while (!flashCards.isEmpty()) {
				var next = flashCards.pop();
				System.out.println(next.getQuestion());
				String line = scanner.nextLine();
				System.out.println("Correct answer: " + next.getAnswer());
			}
		} catch(IllegalStateException | NoSuchElementException e) {
			// System.in has been closed
			System.out.println("System.in was closed; exiting");
		}
	}
}
