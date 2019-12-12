package ben.study.junit4.runner;

import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertTrue;

/*
JUnit theories are an alternative to JUnit's parameterized tests.

A JUnit theory is expected to be true for all datasets.

Thus, in JUnit theories, we have a method providing data points (that is, the input values to be used for the test).

Then, we need to specific a method annotated with @Theory which takes parameters.

The theories in a class get executed with every possible combination of data points:”
*/

@RunWith(Theories.class)
public class TestTheoryRunner {

    @DataPoints
    public static int[] positiveIntegers() {
        return new int[] { 1, 10, 100 };
    }

    @Theory
    public void testSum(int a, int b) {
        System.out.println("Checking " + a + "+" + b);
        assertTrue(a + b > a);
        assertTrue(a + b > b);
    }
}
