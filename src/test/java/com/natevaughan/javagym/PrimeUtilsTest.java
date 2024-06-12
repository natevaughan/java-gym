package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrimUtilsTest {
    @Test
    public void findPrimesTest1() {
        var prime = PrimeUtils.firstPrimeFactor(10);
        assertEquals(2, prime);
    }

    @Test
    public void findPrimesTestAbove100() {
        var prime = PrimeUtils.firstPrimeFactor(749753);
        assertEquals(823, prime);
    }
}
