package euler.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * @author Ryo TANAKA
 * @since 1.0
 */
public class Problem2Test {
    private Problem2 testee = new Problem2();

    @Test
    public void testFibEvenSum() throws Exception {
        assertThat("Fibonacci even summation below 10 is 10", testee.fibEvenSum(10), is(10L));
        assertThat("Fibonacci even summation below 35 is 19", testee.fibEvenSum(35), is(44L));
        assertThat("Fibonacci even summation below 35 is 4000000", testee.fibEvenSum(4000000), is(44L));
    }
}
