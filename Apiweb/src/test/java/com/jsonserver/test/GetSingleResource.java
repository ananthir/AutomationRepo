package com.jsonserver.test;

import org.testng.annotations.Test;

import com.json.server.BaseClass;
import com.json.server.Endpoints;

import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.lessThan;
import static io.restassured.RestAssured.*;

public class GetSingleResource extends BaseClass
{
	@Test
	public void getsingleresourcewithvalidid()
	{
		given().pathParam("id",107).when().get(Endpoints.SINGLE_RESOURCE)
		.then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
		.and().body("title",equalto("DSP")).and()
		.body("author",equalto("Ganesh rao"))
		.and().time(lessthan(1000l));
	}
	@Test
	public void getsingleresourcewithinvaliddata()
	{
		given().pathParam("id",188).when().get(Endpoints.SINGLE_RESOURCE)
		.then().assertThat().statusCode(404).and().contentType(ContentType.JSON)
		.and().time(lessthan(1200l));
		
	}

}
