package com.twu.primeFactors;

import java.util.*;

public class PrimeFactors {
    private PrimeFactors() {  }

    private static HashSet<Integer> primes = new HashSet<Integer> ();

    public static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Expected positive integer");
        } else if (n == 1) {
            return false;
        } else { // n > 1
            assert(n > 1);
            try {
                lowestFactor(n);
            } catch (IllegalArgumentException e) {
                primes.add(n);
            }
            return primes.contains(n);
        }
    }

    private static boolean isPrimeFactor(int factor, int composite) {
        return (primes.contains(factor) || isPrime(factor)) && (composite % factor == 0);
    }

    public static int lowestFactor(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrimeFactor(i, n)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Requires composite number.");
    }

    public static List<Integer> generate(int n) {
        ArrayList<Integer> factors = new ArrayList<Integer> ();

        if (n > 1) {
            int lowFactor;
            while (!isPrime(n)) {
                lowFactor = lowestFactor(n);
                factors.add(lowFactor);
                n = n / lowFactor;
            }
            factors.add(n);
        }

        return factors;
    }

}
