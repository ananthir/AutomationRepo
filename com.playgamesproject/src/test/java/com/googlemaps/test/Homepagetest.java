package com.googlemaps.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import com.googlemaps.genericlib.BaseTest;
import com.googlemaps.genericlib.GenericUtils;
import com.googlemaps.pages.HomePage;


public class Homepagetest extends BaseTest
{
	WebDriver driver;
	String title;
	WebElement element;
	@Test
	public void enterthedata() throws IOException
	{
		HomePage hp=new HomePage(driver);
		hp.EntertheData("wankhede stadium");
		GenericUtils.getscreenshot(driver);
	   	hp.verifyElement(element);
		driver.getTitle();
		hp.verifyTitle(title);
		hp.gettheratings();
		hp.getthereviews();
	}
}
