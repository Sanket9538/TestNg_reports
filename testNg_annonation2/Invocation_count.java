package testNg_annonation2;

import org.testng.annotations.Test;

public class Invocation_count {

	@Test(invocationCount=5)
	void test() {
		System.out.println("testing...");
	}
}
