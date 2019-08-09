package selenium_Interview_Question;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.omg.PortableServer.RequestProcessingPolicyOperations;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;





public class Extend_Report {
	
	WebDriver driver;
	
  @Test
  public void Login() throws IOException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\version 2.36\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	  
	  ExtentHtmlReporter htlmreporter=new ExtentHtmlReporter("Result.html");
	  
	 ExtentReports reports=new ExtentReports();
	 
	 reports.attachReporter(htlmreporter);
	 
	 ExtentTest Test=reports.createTest("Verfiy Google page");
	 
	 Test.log(Status.INFO, "Verify the Title");
	 
	String Title= driver.getTitle();
	
	Assert.assertEquals(Title, "Google");
	
	Test.log(Status.FAIL, "Title is not expected");
	
	TakesScreenshot screenshot=(TakesScreenshot) driver;
	
	File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
	
	File destinationfile=new File("error.jpg");
	
	org.openqa.selenium.io.FileHandler.copy(sourcefile, destinationfile);
	
	Test.addScreenCaptureFromPath("error.jpg");
	  
	driver.close();
	  
	
	reports.flush();
	
	
	  
  }
 
  

}
