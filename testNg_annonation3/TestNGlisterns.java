package testNg_annonation3;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.annotations.*;

public class TestNGlisterns implements ITestListener {
    @Test(priority=1)
	void test1() {
		Assert.assertEquals(1, 1);
	}
    @Test(priority=2)
	void test2() {
    	Assert.assertEquals("A", "B");
	}
	
    @Test(priority=3, dependsOnMethods= {"test2"})
	void test3() 
    {
		
    	Assert.assertEquals(1,1);
	}
}

