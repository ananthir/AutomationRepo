package Com_ActiTime_Generic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WindowUtility 
{
 public  static void switchwindow(WebDriver driver,String etitle)
 {
	 Set<String> allwin = driver.getWindowHandles();
	 Iterator<String> itr = allwin.iterator();
	 while(itr.hasNext())
	 {
		 String wh = itr.next();
		 driver.switchTo().window(etitle);
		 if((driver.getTitle()).equals(etitle))
          {
	        break;
          }
	 }
 }

}
