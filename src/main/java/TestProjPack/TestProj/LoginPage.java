package TestProjPack.TestProj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(xpath= "//input[@id='ap_email_login']")
	WebElement usernamefield;
	
	@FindBy(xpath= "//span[@id=\"continue\"]")
	WebElement continuebutton;
	
	@FindBy(xpath= "//input[@id='ap_password']")
	WebElement passwordfield;
	
	@FindBy(xpath= "//input[@id='signInSubmit']")
	WebElement loginbutton;
	
	
	
	public void usernamefield(String username)
	{
		usernamefield.sendKeys(username);
	}
	
	public void clickcontinuebutton()
	{
		continuebutton.click();
	}
	
	
	public void passwordfield(String password)
	{
		passwordfield.sendKeys(password);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

	
	

	
	

}
