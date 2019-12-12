package ben.study.junit4.rule;

import static java.util.concurrent.TimeUnit.MILLISECONDS;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TestRuleTimeout {
    //“applies the same timeout to all test methods in a class”
    @Rule
    public Timeout globalTimeout = new Timeout(100, MILLISECONDS);

//    @Ignore
    @Test
    public void testInfiniteLoop() {
        while (true)
            ;
    }

    @Test
    public void testDoNothing() {
    }
}