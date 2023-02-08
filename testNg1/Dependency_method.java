package testNg1;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Dependency_method {
   @Test(priority=1)
	void openAPP() {
		Assert.assertTrue(true);
		
	}
   @Test(priority=2,  dependsOnMethods= {"openAPP"})
	void login() {
		Assert.assertTrue(true);
	}
   @Test(priority=3,  dependsOnMethods= {"login"})
	void search() {
		Assert.assertTrue(false);
	}
   @Test(priority=4, dependsOnMethods= {"login","search"})
	void advanceSearch() {
		Assert.assertTrue(true);
	}
	
   @Test(priority=5, dependsOnMethods= {"login"})
	void logout() {
		Assert.assertTrue(true);
	}
}

