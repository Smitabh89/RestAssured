import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test04_PUT 
{
	@Test
	public void testcase4()
	{
		JSONObject request=new JSONObject();
		request.put("name", "smita");
		request.put("job", "Teacher");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).
		when()
		.put("https://reqres.in/api/users/2").
		then().statusCode(200).log().all();
	}

}
