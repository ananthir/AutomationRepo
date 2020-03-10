package Com_ActiTime_Generic;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage
{
	/***
	 * @author ananthi
	 * @category to create super consructor
	 * @param webdriver driver reference
	 */
	WebDriver driver;
	public BasePage(WebDriver driver)
	{
	this.driver=driver;	
	}
	/***
	 * @author ananthi
	 * @category to verifying the webpage
	 * @param title
	 */
   public void verifyTitle(String title)
     {
	    WebDriverWait wait = new WebDriverWait(driver,10);
	  try
	   {
		 wait.until(ExpectedConditions.titleIs(title));
		 Reporter.log("title is matching ="+title,true);
	   }
	  catch(Exception e)
	   {
		Reporter.log("title is not matching ="+driver.getTitle(),true);
		Assert.fail();
	   }
     }
   /***
    *@author ananthi 
    * @category to verify the element on the webpage
    * @param element
    */
	public void verifyElement(WebElement element)
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(element));
			Reporter.log("element is present =",true);
	}
		catch(Exception e)
		{
			Reporter.log("element is not present =",true);
			Assert.fail();
		}
}
}
