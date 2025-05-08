package TestProjPack.TestProj;

import org.testng.annotations.Test;

public class AmazonHomepageTest extends AmazonLaunchAndQuit
{
	@Test(retryAnalyzer=TestProjPack.TestProj.IRetryAnalyzerPro.class)
	public void HomepageTest()
	{
		AmazonHomepage amz = new AmazonHomepage(driver);
		amz.clickSignIn();
	}

}
