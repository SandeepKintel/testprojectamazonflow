package TestProjPack.TestProj;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class TestAmazonFlow extends AmazonLaunchAndQuit{
	@Test
	public void TestCompFlow() throws InterruptedException
	{
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("pen"+Keys.ENTER);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-line-clamp-4 s-link-style a-text-normal']/h2/span)[1]")).click();
		Set<String> allwindows = driver.getWindowHandles();
		
		for(String windowhandle : allwindows)
		{
			if(!windowhandle.equals(parentwindow))
			{
				driver.switchTo().window(windowhandle);
				break;
			}
		}
		
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
		driver.findElement(By.xpath("(//a[@class='a-button-text'])[3]")).click();
		
		
		
	}

}
