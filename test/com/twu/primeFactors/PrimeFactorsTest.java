package com.twu.primeFactors;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class PrimeFactorsTest {

    // PrimeFactors.generate() tests
    @Test
    public void shouldReturnEmptyListWhenGivenOne() {
        List<Integer> pfl = PrimeFactors.generate(1);

        Assert.assertEquals(0, pfl.size());
    }

    @Test
    public void shouldReturnEmptyListWhenGivenZero() {
        List<Integer> pfl = PrimeFactors.generate(0);

        Assert.assertEquals(0, pfl.size());
    }

    @Test
    public void shouldReturnSingletonListWhenGivenPrime() {
        List<Integer> pfl = PrimeFactors.generate(2);

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);

        Assert.assertEquals(expectedList, pfl);
    }

    @Test
    public void shouldReturnFactorsOf4WhenGiven4() {
        List<Integer> pfl = PrimeFactors.generate(4);

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(2);

        Assert.assertEquals(expectedList, pfl);
    }

    @Test
    public void shouldReturnSortedFactorsOf10WhenGiven10() {
        List<Integer> pfl = PrimeFactors.generate(10);

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(5);

        Assert.assertEquals(expectedList, pfl);
    }

    @Test
    public void shouldReturn2_3_5WhenGiven30() {
        List<Integer> pfl = PrimeFactors.generate(30);

        List<Integer> expectedList = new ArrayList<Integer>();
        expectedList.add(2);
        expectedList.add(3);
        expectedList.add(5);

        Assert.assertEquals(expectedList, pfl);
    }


    // PrimeFactors.isPrime() tests
    @Test
    public void shouldReturnFalseWhenAskedIf1IsPrime() {
        Assert.assertFalse(PrimeFactors.isPrime(1));
    }

    @Test
    public void shouldReturnTrueWhenAskedIf2IsPrime() {
        Assert.assertTrue(PrimeFactors.isPrime(2));
    }

    @Test
    public void shouldReturnFalseWhenAskedIf4IsPrime() {
        Assert.assertFalse(PrimeFactors.isPrime(4));
    }

    @Test
    public void shouldReturnFalseWhenAskedIf10IsPrime() {
        Assert.assertFalse(PrimeFactors.isPrime(10));
    }

    @Test
    public void shouldReturnTrueWhenAskedIf13IsPrime() {
        Assert.assertTrue(PrimeFactors.isPrime(13));
    }


    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenNegativeNumber() {
        PrimeFactors.isPrime(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenZero() {
        PrimeFactors.isPrime(0);
    }

    // PrimeFactors.lowestFactor() tests
    @Test
    public void shouldReturn2WhenGiven4() {
        Assert.assertEquals(2, PrimeFactors.lowestFactor(4));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenPrime() {
        PrimeFactors.lowestFactor(3);
    }

    @Test
    public void shouldReturn2WhenGiven6() {
        Assert.assertEquals(2, PrimeFactors.lowestFactor(6));
    }

    @Test
    public void shouldReturn3WhenGiven9() {
        Assert.assertEquals(3, PrimeFactors.lowestFactor(9));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionWhenGivenNegative() {
        PrimeFactors.lowestFactor(-10);
    }
}

