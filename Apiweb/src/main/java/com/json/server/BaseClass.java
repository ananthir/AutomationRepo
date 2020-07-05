package com.json.server;

import org.testng.annotations.BeforeSuite;
import static io.restassured.RestAssured.*;
/**
 * 
 * @author Ananthi     9886662262
 * 
 * +
 * 
 * 
 */
public class BaseClass
{
	/**
	 * to initialize
	 */
	@BeforeSuite
	public void config()
	{
		baseURI = "http://localhost";
		port = 3000;
		
	}

}
