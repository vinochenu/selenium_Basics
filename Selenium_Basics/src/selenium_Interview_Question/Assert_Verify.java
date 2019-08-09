package selenium_Interview_Question;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assert_Verify {
	
WebDriver driver;
	
	@BeforeMethod
	public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@AfterMethod
	public void afterMethod() {
		driver.close();
	}
	
	@Test
	public void assertion() { //Assert- Hard Assert- it wont go to next line if it gets failed
		System.out.println("Before Assertion");
		Assert.assertEquals(true, false);
		System.out.println("After Assertion");
	}

	@Test
	public void verfiy() {//verify -Soft Assert- it will execute next line even if gets failed
		
		SoftAssert verify=new SoftAssert();
		System.out.println("Before Assertion");
		verify.assertEquals(true, false);
		System.out.println("After Assertion");
		
		
	}
}
