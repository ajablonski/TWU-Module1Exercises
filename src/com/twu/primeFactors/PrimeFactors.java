package com.twu.primeFactors;

import java.util.*;

public class PrimeFactors {
    private PrimeFactors() {  }

    private static HashSet<Integer> primes = new HashSet<Integer> ();
    private static HashSet<Integer> composites = new HashSet<Integer> ();

    public static boolean isPrime(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Expected positive integer");
        } else if (n == 1) {
            return false;
        } else if (primes.contains(n)) {
            return true;
        } else if (composites.contains(n)) {
            return false;
        } else {
            try {
                lowestFactor(n);
            } catch (IllegalArgumentException e) {
                primes.add(n);
                return true;
            }
            composites.add(n);
            return false;
        }
    }

    public static int lowestFactor(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (isPrime(i) && (n % i == 0)) {
                composites.add(n);
                return i;
            }
        }
        throw new IllegalArgumentException("Requires composite number.");
    }

    public static List<Integer> generate(int n) {
        ArrayList<Integer> a = new ArrayList<Integer> ();
        if (n == 1) {
            return a;
        }
        int lowFactor;
        while (!isPrime(n)) {
            lowFactor = lowestFactor(n);
            a.add(lowFactor);
            n = n / lowFactor;
        }
        a.add(n);
        return a;
    }

}
