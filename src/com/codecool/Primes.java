package com.codecool;

import java.util.*;

public class Primes {
    private SortedSet<Integer> nonPrimes = new TreeSet<>();

    int countPrimes(int upperBound) {
        int primeCount = 0;
        for (int number = 2; number <= upperBound; number++) {
            if (nonPrimes.contains(number)) continue;
            System.out.println(++primeCount);
            for (int multiple = number * 2; multiple <= upperBound; multiple += number)
                nonPrimes.add(multiple);
        }
        return primeCount;
    }
}
