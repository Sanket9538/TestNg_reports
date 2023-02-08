package testNg_annonation3;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGMylistern implements ITestListener {

	public void onTestStart(ITestResult result) {
	   System.out.println(" on Test started...");
	  }
	public void onTestSuccess(ITestResult result) {
		System.out.println(" on Test success...");
	  }
	
	public void onTestFailure(ITestResult result) {
		System.out.println(" on Test Failure...");
	  }
	public void onTestSkipped(ITestResult result) {
		System.out.println(" on Test result...");
	  }
	public void onFinish(ITestContext context) {
		System.out.println(" on Test Finish...");
	  }
}
