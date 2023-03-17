import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvide
{
      @Test(dataProvider="Datadrive")
	   public void testcase(String name,String Surname,int id)
       {
    	   System.out.println(name+Surname+id);
       }
	
		@DataProvider(name="Datadrive")
	    public Object[][] getdata()
		{
			Object [][] data= {{"smita","Bhosale",1},{"Ishanvi","Kedar",2},{"Santosh","Kedar",3}};
			return data;
		}

	

}
