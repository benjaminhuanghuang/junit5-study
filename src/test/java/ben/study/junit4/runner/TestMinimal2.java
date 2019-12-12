package ben.study.junit4.runner;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestMinimal2 {

    @Test
    public void test1() {
        System.out.println("** Test 1 ***");
        assertTrue(true);
    }

}