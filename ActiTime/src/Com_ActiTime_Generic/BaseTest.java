package Com_ActiTime_Generic;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest implements Autoconstant
{
static
{
	System.setProperty(chrome_key,chrome_value);
	System.setProperty(firefox_key,firefox_value);
	System.setProperty(ie_key,ie_value);
}
WebDriver driver;
@BeforeMethod
public void precondition() throws MalformedURLException
{
	URL url=new URL("http://192.168.43.102:4444/wd/hub/");
	DesiredCapabilities dc = new DesiredCapabilities();
	dc.setBrowserName("firefox");
	driver=new RemoteWebDriver(url,dc);
	driver.get("https://online.actitime.com/zzz/user/submit_tt.do");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://online.actitime.com/zzz/user/submit_tt.do");
}
@AfterMethod
public void postcondition(ITestResult res)
{
	int status=res.getStatus();
	if(status==2)
	{
		String name=res.getName();
		
	}
}
}
