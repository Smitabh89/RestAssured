import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class Test01_GET 
{
	@Test
	public void testcase1()
	{
		Response response=get("https://reqres.in/api/users?page=2");
		System.out.println(response.getBody());
		System.out.println(response.getStatusCode());
		System.out.println(response.asString());
		System.out.println(response.getHeader("Content-Type"));
		System.out.println(response.getContentType());
		System.out.println(response.statusLine());
		System.out.println(response.getTime());
		int statuscode1=response.getStatusCode();
		Assert.assertEquals(statuscode1, 200);
		
	}
	public void testcase2()
	{
		given().get("https://reqres.in/api/users?page=2").then().statusCode(200);
	}

}
