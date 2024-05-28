package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

public class EnqueueTest {

    @Test
    public void testAdd() {
        var service = new Enqueue();
        service.process("1 42");
    }
}
