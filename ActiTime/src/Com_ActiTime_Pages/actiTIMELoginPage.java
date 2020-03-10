package Com_ActiTime_Pages;

import org.apache.poi.Version;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com_ActiTime_Generic.BasePage;

public class actiTIMELoginPage extends BasePage
{
	@FindBy(id="username")
	private WebElement unTB;
	
	@FindBy(name="pwd")
	private WebElement pwTB;
	
	@FindBy(xpath="")
	private WebElement lgBT;
	
	@FindBy(xpath="")
	private WebElement error;
	
	@FindBy(xpath="")
	private WebElement version;
	
	WebDriver driver;
	public actiTIMELoginPage(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public void verifyTitle(String title)
	{
		verifyTitle(title);
	}
	public void EnterUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void EnterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClickonLogin() 
	{
		lgBT.click();
	}
	public String verifyErrorMSG()
	{
		verifyElement(error);
		String aerror=error.getText();
		return aerror;
	}
	public String verifyVersion()
	{
		verifyElement(version);
		String aversion=version.getText();
		return aversion;
		
		
	}

}
