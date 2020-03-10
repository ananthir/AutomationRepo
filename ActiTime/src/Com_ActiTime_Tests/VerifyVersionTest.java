package Com_ActiTime_Tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Com_ActiTime_Generic.BaseTest;
import Com_ActiTime_Generic.ExcelData;
import Com_ActiTime_Pages.actiTIMELoginPage;

public class VerifyVersionTest extends BaseTest
{
	WebDriver driver;
	@Test(priority = 3)
	public void VerifyVersion()
		{
			String title=ExcelData.getdata(file_path, ",",1, 2);
			actiTIMELoginPage lp=new actiTIMELoginPage(driver);
			lp.verifyTitle(title);
			String aversion=lp.verifyVersion();
			String eversion=ExcelData.getdata(file_path, " ", 1, 0);
			SoftAssert sa=new SoftAssert();
			sa.assertAll();
		}
	}


