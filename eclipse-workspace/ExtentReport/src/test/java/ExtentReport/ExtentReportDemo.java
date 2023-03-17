package ExtentReport;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
//import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportDemo 
{
	ExtentReports extent;
	@BeforeTest
	public void config()
	{
		String path=System.getProperty("user.dir"+"\\reports\\result.html");
		ExtentSparkReporter report=new ExtentSparkReporter(path);
		report.config().setReportName("Web Aplication Report");
		report.config().setDocumentTitle("Extent Report");
		extent=new ExtentReports();
		extent.attachReporter(report);
		extent.setSystemInfo("Tester","Smita Bhoale");
	}
	
	
	
	@Test
	public void initialDemo()
	{
		ExtentTest test=extent.createTest("initial Demo");	
		System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.whiteboxqa.com/");
		System.out.println(driver.getTitle());
		driver.quit();
		//test.fail("Do not match");
		extent.flush();
		
	}

}
