package ben.study.junit4.rule;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;

/*
“ This rule allows execution of a test to continue after the first problem is found”

 */
public class TestRuleErrorCollector {
    @Rule
    public ErrorCollector collector = new ErrorCollector();

//    @Ignore
    @Test
    public void test() {
        collector.checkThat("a", equalTo("b"));
        collector.checkThat(1, equalTo(2));
        collector.checkThat("c", equalTo("c"));
    }

}
