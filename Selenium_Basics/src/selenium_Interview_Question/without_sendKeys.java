package selenium_Interview_Question;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class without_sendKeys {
	
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
	public void usingJavaScriptExecutor_1() {
		
		WebElement search=driver.findElement(By.name("q"));
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("arguments[0].value='FIS'", search);
		}
	

	
	@Test
	public void usingJavascriptExecutor() {
		WebElement search=driver.findElement(By.name("q"));
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("document.getElementsByName('q')[0].value='FIS'", "");
	}
	
	@Test
	public void usingRobotClass() throws AWTException {
		WebElement search=driver.findElement(By.name("q"));//we can get by activeElement()-Ex: driver.switchTo().activeElement();
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_F);
		robot.keyRelease(KeyEvent.VK_F);
		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);
		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);
		
		
		
	}
	

}
