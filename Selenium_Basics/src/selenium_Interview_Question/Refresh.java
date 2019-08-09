package selenium_Interview_Question;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Refresh {
	
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
	public void refresh_1() {
		driver.navigate().to("https://www.google.com/");
		driver.navigate().refresh();//refresh via navigate().to();
		
	}

	@Test(priority=1)
	public void refresh_2() {
		driver.get(driver.getCurrentUrl());//refresh via getCurrentUrl();
		
	}
	@Test(priority=2)
	public void refresh_3() {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("location.reload()");
		executor.executeScript("history.go(0)");
	}
		
		@Test(priority=3)
		public void refresh_4() {
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("location.reload()");//using javascriptexecutor- location.relaod();
			executor.executeScript("history.go(0)");//using javascriptexecutor- history.go(0);
		}
				@Test(priority=4)
				public void refresh_5() throws AWTException {
					Robot robot=new Robot();
					robot.keyPress(KeyEvent.VK_F5);
					robot.keyRelease(KeyEvent.VK_F5);
			}
		
	}

