package Com_ActiTime_Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Pages.actiTIMEEnterTimeTrackPage;
import Com_ActiTime_Pages.actiTIMELoginPage;

public class ValidLoginLogoutTest extends BaseTest
{
	WebDriver driver;
	@Test(priority = 1)
	public void ValidLoginLogout()
	{
		//reading data from excel file
		String lgtitle=ExcelData.getdata(file_path, " ", 1, 2);
		String un=ExcelData.getdata(file_path, " ", 1, 0);
		String pw=ExcelData.getdata(file_path, " ", 1, 1);
		String hptitle=ExcelData.getdata(file_path, " ", 1, 3);
		//creating object to the login page object
		actiTIMELoginPage lp = new actiTIMELoginPage(driver);
		//creating object to the time track page object
		actiTIMEEnterTimeTrackPage hp=new actiTIMEEnterTimeTrackPage(driver);
		//to verify the login page title
		lp.verifyTitle(lgtitle);
		//enter the user name
		lp.EnterUserName(un);
		//enter the password
		lp.EnterPassword(pw);
		//to click on login button
		lp.ClickonLogin();
		//to verify time track page title
		lp.verifyTitle(hptitle);
		//to click on logout button
		hp.clickonLogout();
		//to verify the login page title
		lp.verifyTitle(lgtitle);
		
		
	}

}
