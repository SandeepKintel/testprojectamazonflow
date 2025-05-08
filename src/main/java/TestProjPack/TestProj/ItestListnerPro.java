package TestProjPack.TestProj;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ItestListnerPro implements ITestListener {
	
	static WebDriver driver;

	@Override
	public void onTestSuccess(ITestResult result) {
		ITestListener.super.onTestSuccess(result);
		Reporter.log("Testcase is Passed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\TestProj\\Screeshots\\Passed\\PassSs "+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		ITestListener.super.onTestFailure(result);
		Reporter.log("Testcase is Failed");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\sandeep.kumar\\eclipse-workspace\\TestProj\\Screeshots\\Failed\\FailSs "+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
