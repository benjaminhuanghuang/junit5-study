package ben.study.junit4;


import org.junit.Ignore;
import org.junit.Test;

public class TestTimeout {
    // To make sure that if a test runs longer than the specified value, the test fails.
//    @Ignore
    @Test(timeout = 10)
    public void test() {
        while (true)
            ;
    }
}
