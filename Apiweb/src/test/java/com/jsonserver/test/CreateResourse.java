package com.jsonserver.test;

import static org.testng.Assert.assertEquals;

import java.awt.FontFormatException;
import java.io.File;
import java.io.FileInputStream;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.json.server.BaseClass;
import com.json.server.Endpoints;
import com.json.server.parser.jsonParserclass;

import io.restassured.http.ContentType;
import io.restassured.internal.util.IOUtils;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class CreateResourse extends BaseClass
{
	@Test
	public void createResourceWithValidData()
	{
		try
		{
			FileInputStream fis=new FileInputStream(new File("./src/test/resources/json/createResource.json"));
			Response response = given().contentType(ContentType.JSON).and().body(IOUtils.toByteArray(fis)).when()
					.post(Endpoints.CREATE_RESOURCE);
			response.then().assertThat().contentType(ContentType.JSON).and().statusCode(201);
			Assert.assertEquals(jsonParserclass.getjsonstring(response,"author"),"Mathur");
		}
		catch (FontFormatException e) 
		{
			e.printStackTrace();
		}
		catch (Exception e) 
		{
		 e.printStackTrace();
		}
	}
}
