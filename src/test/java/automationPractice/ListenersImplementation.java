package automationPractice;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Start Test case"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Completed Test case"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Take screenshot on failure"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
	
	}

	@Override
	public void onStart(ITestContext context) {
	
	}

	@Override
	public void onFinish(ITestContext context) {
		
	}
	
	
	
	

}
