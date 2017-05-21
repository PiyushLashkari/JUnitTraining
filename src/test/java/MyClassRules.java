import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TemporaryFolder;

public class MyClassRules {

	// JUnit rules you can add behavior to each tests in a test class.
	@Rule
	public ExpectedException exception = ExpectedException.none();

	// You can create objects which can be used and configured in your test
	// methods. This adds more flexibility to your tests.
	@Test
	public void throwsIllegalArgumentException() {
		exception.expect(IllegalArgumentException.class);
		exception.expectMessage("x cannot be greater than 100");
		MyClass tester = new MyClass();
		tester.multiply(120, 5);
	}

	
	// The TemporaryFolder class allows to setup files and folders which are automatically removed after each test run.
	@Rule
	public TemporaryFolder folder = new TemporaryFolder();

	@SuppressWarnings("unused")
	@Test
	public void testUsingTempFolder() throws IOException {
		File createdFolder = folder.newFolder("newfolder");
		File createdFile = folder.newFile("myfilefile.txt");
		assertTrue(createdFile.exists());
	}

}
