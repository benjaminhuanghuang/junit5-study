package ben.study.junit4.runner;
/*
The test runner to be used in a JUnit 4 test case can be changed simply using the annotation @RunWith”

To run a group of tests (that is, a test suite) JUnit 4 provides the Suite runner.

In addition to the runner, the class Suite.SuiteClasses allows to define the individual test classes belonging to the suite

*/
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({ TestMinimal1.class, TestMinimal2.class })
public class TestSuitRunner {

}