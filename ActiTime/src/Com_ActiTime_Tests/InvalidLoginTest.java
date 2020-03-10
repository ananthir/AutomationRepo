package Com_ActiTime_Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Pages.actiTIMELoginPage;

public class InvalidLoginTest extends BaseTest
{
	WebDriver driver;
	@Test(priority = 2)
	public void InvalidLogin() throws InterruptedException
	{
		String title = ExcelData.getdata(file_path, " ", 1, 2);
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		lp.verifyTitle(title);
		int rc=ExcelData.getrowcount(file_path, " ");
		for(int i=1;i<=rc;i++)
		{
			String un = ExcelData.getdata(file_path, " ", i, 0);
			String pw = ExcelData.getdata(file_path, " ", i, 1);
			Reporter.log("User name= "+un,true);
			lp.EnterUserName(un);
			Reporter.log("Passwords= "+pw,true);
			lp.EnterPassword(pw);
			lp.ClickonLogin();
			String aerror=lp.verifyErrorMSG();
			String eerror=ExcelData.getdata(file_path, " ", 1, 2);
			Assert.assertEquals(aerror, eerror);
			Reporter.log("===========================================", true);
			Thread.sleep(2000);
		
				
		}
		
		
		
	}

}
