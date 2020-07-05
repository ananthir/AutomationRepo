package com.googlemaps.genericlib;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;



public class BaseTest implements Autoconstant 
{
	static
	{
		System.setProperty(chrome_key,chrome_value);
	}
	WebDriver driver;
	@BeforeClass
	public void launchbrowser()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void precondition()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/maps");
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
	@AfterClass
	public void configclose()
	{
		driver.close();
	}
}
