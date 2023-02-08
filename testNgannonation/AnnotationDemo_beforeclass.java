package testNgannonation;



import org.testng.annotations.*;

public class AnnotationDemo_beforeclass {
	@AfterClass
	void login() {
		System.out.println("login");
	}
	@Test(priority=1)
	void search() {
		System.out.println("search test");
	}
	@Test(priority=2)
	void advanceSearch() {
		System.out.println("Advance search");
	}
	@AfterClass
	void logout() {
		System.out.println("logout");
	}
	
	
}
