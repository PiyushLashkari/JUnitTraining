import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Ignore;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertNotNull(tester.multiply(8, 3));
		assertEquals(50, tester.multiply(10, 5));
		assertEquals(0, tester.multiply(0, 5));
		assertSame(16, tester.multiply(8, 2));
		assertSame(6, tester.multiply(6, 1));
	}
	
	@Test
	public void testMultiplyNegative() {
		MyClass tester = new MyClass();
		assertNotEquals(18, tester.multiply(8, 2));
		assertNotSame(16, tester.multiply(8, 3));
	}
	
	@Ignore
	@Test
	public void test() {
		int[] expected = {1,2,3,4};
		int[] numbers = {4,3,2,1};
		Arrays.sort(numbers);
		assertArrayEquals(expected, numbers);
	}

}
