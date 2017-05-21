import java.util.Arrays;

import org.junit.Test;


public class MyClassTestPerformance {

	@Test(timeout = 100)
	public void test() {
		int array[] = {12, 23, 4};
		for(int i = 1; i <= 1000000; i++){
			array[0] = i;
			Arrays.sort(array);
		}
	}

}
