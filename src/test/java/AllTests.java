import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ MyClassTestMock.class, MyClassTestParameterized.class,
		MyClassTestPerformance.class })
public class AllTests {

}
