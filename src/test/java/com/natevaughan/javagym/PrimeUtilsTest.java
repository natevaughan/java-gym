package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class PrimeUtilsTest {
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

    @Test
    public void recursivelyFindPrimesTestUniquePrimes() {
        var factors = PrimeUtils.recursivelyFindPrimeFactors(10);
        assertEquals(2, factors.size());
    }

    @Test
    public void findPrimesWithDuplicates() {
        var factors = PrimeUtils.recursivelyFindPrimeFactors(12);
        assertEquals(2, factors.size());
        assertEquals(2, factors.get(2));
        assertEquals(1, factors.get(3));
        assertNull(factors.get(5));
    }
}
