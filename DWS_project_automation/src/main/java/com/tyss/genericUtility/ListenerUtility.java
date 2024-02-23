package com.tyss.genericUtility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerUtility extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		String screen = ts.getScreenshotAs(OutputType.BASE64);
		
		test.addScreenCaptureFromBase64String(screen,"login falied");
		
		
	}

	
	
}
