package Com_ActiTime_Generic;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class GenericUtils 
{
	public static void getscreenshot(WebDriver driver,String name)
	{
		SimpleDateFormat s1=new SimpleDateFormat("dd-MM-yyyy");
		String day=s1.format(new Date());
		try
		{
		
			File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(src, new File("./Screenshot'"+day+"'  +name+ .png" ));
		}
		catch(Exception e)
		{
		}
		
	}
public static void selectbyindexvalue(WebElement element,int index)
{
	Select sel = new Select(element);
	sel.selectByIndex(index);
}
public static void selectbyattributevalue(WebElement element,String value)
{
	Select sel = new Select(element);
	sel.selectByValue(value);
}
public static void selectbyvisibletextvalue(WebElement element,String text)
{
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
	}
public static void deselectbyindexvalue(WebElement element,int index)
{
	Select sel = new Select(element);
	sel.deselectByIndex(index);
}
public static void deselectbyattributevalue(WebElement element,String value)
{
	Select sel = new Select(element);
	sel.deselectByValue(value);
}
public static void deselectbyvisibletextvalue(WebElement element,String text)
{
	Select sel = new Select(element);
	sel.deselectByVisibleText(text);
	}

public static void clickonokbuttoninjavascriptpopup(WebDriver driver)
{
	driver.switchTo().alert().accept();
}
public static void clickoncancelbuttoninjavascriptpopup(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
}
public static void EntertextTojavascriptpopup(WebDriver driver,String text)
{
	Alert a = driver.switchTo().alert();
	a.sendKeys(text);
	a.accept();
}
public static String GetTextFromjavascriptpopup(WebDriver driver)
{
	String text = driver.switchTo().alert().getText();
	return text;
}
public static void clickonDatetoHiddenDivisionPopup(WebElement element)
{
	 (element).click();
}
public static void FileUploadPopup()
{
	
}
}