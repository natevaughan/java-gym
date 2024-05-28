package com.natevaughan.javagym;

import java.util.ArrayDeque;
import java.util.Deque;

public class Enqueue {

    private Deque deque = new ArrayDeque<String>();

    public void process(String line) {
        var parts = line.split("\\s+");
        if (parts.length == 1) {
            var command = Integer.parseInt(parts[0]);
            if (command == 2) {
                deque.remove();
            } else if (command == 3) {
                System.out.println(deque.peekFirst());
            } else {
                throw new IllegalArgumentException(
                    "Illegal line found: " + line
                );
            }
        } else if (parts.length == 2) {
            var command = Integer.parseInt(parts[0]);
            if (command == 1) {
                deque.add(parts[1]);
            } else {
                throw new IllegalArgumentException(
                    "Illegal line found: " + line
                );
            }
        } else {
            throw new IllegalArgumentException("Illegal line found: " + line);
        }
    }
}
