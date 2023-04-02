import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Test05_DELETE 
{
	@Test
	public void testcase5()
	{
	
		
		given().delete("https://reqres.in/api/users/2").
		then().statusCode(204).log().all();
	}
}
