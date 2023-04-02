import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test03_POST 
{
	@Test
	public void Testcase3()
	{
		JSONObject request=new JSONObject();
		request.put("name", "smita");
		request.put("job", "Teacher");
		System.out.println(request);
		System.out.println(request.toJSONString());
		
		given().body(request.toJSONString()).
		when()
		.post("https://reqres.in/api/users").
		then().statusCode(201);
		
	}

}
