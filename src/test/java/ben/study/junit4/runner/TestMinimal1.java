package ben.study.junit4.runner;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestMinimal1 {

    @Test
    public void test1() {
        System.out.println("** Test 1 ***");
        assertTrue(true);
    }

}