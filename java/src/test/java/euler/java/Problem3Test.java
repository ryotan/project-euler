package euler.java;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Test class for {@link Problem3}.
 *
 * @author Ryo TANAKA
 * @since 1.0
 */
public class Problem3Test {
    private Problem3 testee = new Problem3();

    /**
     * Test for {@link Problem3#getLargestPrimeFactor(long)}.
     *
     * @throws Exception
     */
    @Test
    public void testGetLargestPrimeFactor() throws Exception {
        assertThat("The largest prime factor of 2 is 2.", testee.getLargestPrimeFactor(2L), is(2L));
        assertThat("The largest prime factor of 3 is 3.", testee.getLargestPrimeFactor(3L), is(3L));
        assertThat("The largest prime factor of 4 is 2.", testee.getLargestPrimeFactor(4L), is(2L));
        assertThat("The largest prime factor of 6 is 3.", testee.getLargestPrimeFactor(6L), is(3L));
        assertThat("The largest prime factor of 13195 is 29.", testee.getLargestPrimeFactor(13195L), is(29L));
        assertThat("The largest prime factor of 600851475143 is 6857.",
                testee.getLargestPrimeFactor(600851475143L), is(6857L));
        assertThat("The largest prime factor of Long.MAX_VALUE is 649657.",
                testee.getLargestPrimeFactor(Long.MAX_VALUE), is(649657L));
        assertThat("The largest prime factor of 2**62 is 2.",
                testee.getLargestPrimeFactor(4611686018427387904L), is(2L));
    }
}
