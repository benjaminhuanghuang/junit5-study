package ben.study.junit4.runner;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
public class TestJUnit5Runner {

    @Test
    void myTest() {
        String message = "1+1 should be equal to 2";
        System.out.println(message);
        assertEquals(2, 1 + 1, message);
    }
}