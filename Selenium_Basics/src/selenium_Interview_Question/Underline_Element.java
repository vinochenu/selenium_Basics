package selenium_Interview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Underline_Element {
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
	public void verifyUnderline() {
		
		WebElement elementPrivacy=driver.findElement(By.linkText("Privacy"));
		
		String beforehowering=elementPrivacy.getCssValue("text-decoration");
		System.out.println("Before mouse howering"+" "+beforehowering);
		
		Actions action=new Actions(driver);
		action.moveToElement(elementPrivacy);
		action.build().perform();
		
		String afterhowering=elementPrivacy.getCssValue("text-decoration");
		System.out.println("After mouse howering"+" "+afterhowering);
	}

}
