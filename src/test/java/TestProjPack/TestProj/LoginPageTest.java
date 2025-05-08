package TestProjPack.TestProj;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageTest extends AmazonLaunchAndQuit
{
	@Test(dataProvider="dataset", retryAnalyzer=TestProjPack.TestProj.IRetryAnalyzerPro.class)
	public void LoginpageTest(String username, String password)
	{
		AmazonHomepage amz = new AmazonHomepage(driver);
		amz.clickSignIn();
		LoginPage lp = new LoginPage(driver);
		lp.usernamefield(username);
		lp.clickcontinuebutton();
		lp.passwordfield(password);
		lp.clickloginbutton();
	
		
	}
	
	
	@DataProvider(name="dataset")
	public Object[][] dataSet() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1 = new FileInputStream("C:\\Users\\sandeep.kumar\\eclipse-workspace\\TestProj\\confedential.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		Sheet s1 = w1.getSheet("data");
		String username=s1.getRow(1).getCell(0).getStringCellValue();
		String password=s1.getRow(1).getCell(1).getStringCellValue();
		Object[][] obj = new Object[1][2];
		obj[0][0]= username;
		obj[0][1]= password;
		
		return obj;
		
		
	}

}
