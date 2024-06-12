package com.natevaughan.javagym;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

    @Test
    public void various() {
        var factors = PrimeUtils.recursivelyFindPrimeFactors(12);
        assertEquals(2, factors.size());
        assertEquals(2, factors.get(2));
        assertEquals(1, factors.get(3));
        var foo = new Integer[] {1, 2, 3};
        List<Integer> bar = Arrays.asList(foo);
        assertEquals(foo.length, bar.size());
        var myArr = new Integer[] { 5, 6, 7 };
        var newArr = Arrays.stream(myArr).map(it -> it + 1).toArray();
        assertEquals(6, newArr[0]);
        var hashes = new HashMap<Integer, Integer>();
        hashes.put(2, 1);
        hashes.put(7, 3);
        var sums = hashes.entrySet().stream().map(e -> e.getKey() + e.getValue()).reduce(0, (acc, v) -> acc + v);
        assertEquals(13, sums);
    }
}
