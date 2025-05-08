package TestProjPack.TestProj;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners(TestProjPack.TestProj.ItestListnerPro.class)
public class AmazonLaunchAndQuit extends ItestListnerPro {
	
	@BeforeMethod
	public void LaunchAmazon()
	{
		driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));	
	}
	
	
	@AfterMethod
	public void QuitAmazon()
	{
		driver.quit();
	}

	

}
