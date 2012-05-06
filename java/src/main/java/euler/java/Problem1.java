package euler.java;

/**
 * Problem 1 (FizzBuzz Summation)
 * <p/>
 * If we list all the natural numbers below 10 that are multiples of 3 or 5,
 * we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
public class Problem1 {
    public static void main(String... args) {
        System.out.println(new Problem1().fizzBuzzSum(1000));
    }

    public long fizzBuzzSum(int max) {
        long result = 0;
        for (int i = 1; i < max; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }
        return result;
    }
}
