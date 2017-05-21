import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import java.util.List;

import org.junit.Test;
import org.mockito.Mockito;

public class MyClassTestMock {

	@Test
	public void testMock() {
		// create mock
		MyClass test = Mockito.mock(MyClass.class);

		// define return value for method getUniqueId()
		when(test.getUniqueId()).thenReturn(43);

		// use mock in test
		assertEquals(43, test.getUniqueId());
	}

	@SuppressWarnings("rawtypes")
	@Test
	public void testNullReturnIfNoDataFound() {
		
		// create mock
		MyClass test = Mockito.mock(MyClass.class);
		
		// create mock list to be returned
		List all = null;

		// return mocked result set on find
		when(test.findAll()).thenReturn(all);

		// call the main method to test
		List result = test.findAll();

		// verify null result was returned
		assertNull(result);
	}

}
