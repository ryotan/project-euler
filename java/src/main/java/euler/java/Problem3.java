package euler.java;

/**
 * Problem 3 (the Largest Prime Factor)
 * <p/>
 * The prime factors of 13195 are 5, 7, 13 and 29.<br />
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
public class Problem3 {
    public long getLargestPrimeFactor(long num) {
        // とりあえず、longの範囲では100あれば十分
        long[] primes = new long[100];
        int idx = 0;
        long div = num;
        for (long i = 2; i < div; i++) {
            if (num % i == 0) {
                primes[idx] = i;
                idx++;
                div = num / i;
                primes[idx] = div;
                idx++;
            }
        }
        long max = 0L;
        for (int i = 0; i < primes.length - 1 && primes[i] != 0; i++) {
            long candidate = primes[i];
            if (max < candidate && !isDividable(candidate, primes)) {
                max = candidate;
            }
        }
        return max != 0 ? max : num;
    }

    private boolean isDividable(long l, long[] primes) {
        for (int i = 0; i < primes.length - 1 && primes[i] != 0; i++) {
            long prime = primes[i];
            if (l != prime && l % prime == 0) {
                return true;
            }
        }
        return false;
    }
}
