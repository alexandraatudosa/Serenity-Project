package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import steps.HeaderSteps;
import test.GoogleTest;
import test.RegisterTest;

@RunWith(Suite.class)
@SuiteClasses({
	GoogleTest.class,
		RegisterTest.class,
		HeaderSteps.class,
})
public class TestSuite {
}
