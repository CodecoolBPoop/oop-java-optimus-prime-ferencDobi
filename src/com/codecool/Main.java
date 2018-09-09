package com.codecool;

public class Main {

    public static void main(String[] args) {
	    Primes primes = new Primes();

        long start = System.currentTimeMillis();
        primes.countPrimes(24000000);
        System.out.println(System.currentTimeMillis() - start + "ms");
    }
}
