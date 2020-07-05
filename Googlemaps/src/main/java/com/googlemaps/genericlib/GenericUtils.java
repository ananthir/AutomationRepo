package com.googlemaps.genericlib;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class GenericUtils
{
	WebDriver driver;

	public static void getscreenshot(WebDriver driver) throws IOException
	{

	TakesScreenshot ts = (TakesScreenshot)driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
    Files.copy(source,new File("./screenshot/screen.png"));
    System.out.println("the screenshot is taken");
	
	 }
	
	
}	


