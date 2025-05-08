package TestProjPack.TestProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonHomepage {
	WebDriver driver;
	
	@FindBy(xpath="//span[@id=\"nav-link-accountList-nav-line-1\"]")
	WebElement Signin;
	
	public void clickSignIn()
	{
		Signin.click();
	}
	
	public AmazonHomepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	

}
