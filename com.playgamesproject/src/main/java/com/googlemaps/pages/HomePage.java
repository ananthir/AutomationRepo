package com.googlemaps.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.googlemaps.genericlib.BasePage;
import com.googlemaps.genericlib.BaseTest;



public class HomePage extends BasePage
{
	WebDriver driver;
	
	@FindBy(id="searchboxinput")
	private WebElement searchbox;
	
	@FindBy(xpath="//ol[@class='section-star-array']")
	private WebElement ratings;
	
	@FindBy(xpath="//button[text()='(29,480)']")
	private WebElement numberofreviews;
	
	
	public HomePage(WebDriver driver) 
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void EntertheData(String text)
	{
		searchbox.sendKeys(text);
	}
	public void verifyTitle(String title)
	{
		verifyTitle(title);
	}
	public void gettheratings()
	{
		ratings.getText();
	}
	public void getthereviews()
	{
		numberofreviews.getText();
	}
	
	
		

}
