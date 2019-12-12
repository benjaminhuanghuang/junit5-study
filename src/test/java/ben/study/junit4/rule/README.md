## Rule
One of the most significant innovations introduced in JUnit 4 was the use of rules. Rules allow flexible addition or redefinition of the behavior of each test method in a test class. A rule should be included in a test case by annotating a class attribute with the annotation @Rule. The type of this attribute should inherit the JUnit interface org.junit.rulesTestRule. The following rules are provided out of the box in JUnit 4:

ErrorCollector: This rule allows execution of a test to continue after the first problem is found
ExpectedException: This rule allows to verify that a test throws a specific exception
ExternalResource: This rule provides a base class for Rules that set up an external resource before a test (a file, socket, server, database connection, and so on) and guarantee to tear it down afterward
TestName: This rule makes the current test name available inside test methods
TemporaryFolder: This rule allows creation of files and folders that should be deleted when the test method finishes
Timeout: This rule applies the same timeout to all test methods in a class
TestWatcher: It is a base class for rules that will keep a log of each passing and failing test[…]” 

## JUnit 4 features allow to:
Execute tests is a given order, using the annotation @FixMethodOrder.
Create assumptions using the class Assume. This class offers many static methods, such as assumeTrue(condition), assumeFalse(condition), assumeNotNull(condition), and assumeThat(condition). Before executing a test, JUnit checks the assumptions present in the test. If one of the assumptions fail, the JUnit runner ignores the tests with failing assumptions.
JUnit provides a timeout value (in milliseconds) in the @Test annotation to make sure that if a test runs longer than the specified value, the test fails.
Categorize tests using the test runner Categories and identify the types of test annotating the tests method with the annotation Category.”


