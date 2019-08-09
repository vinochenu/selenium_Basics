package selenium_Interview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sleep_Speed {
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
	public void threadSleep() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("FIS"+Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.linkText("FIS: Global Business Solutions | Financial Software")).click();
		Thread.sleep(2000);//we have to give each web element inspection to wait  
		
	}
	
	@Test
	public void seleniumSetSpeed() {
		driver.findElement(By.name("q")).sendKeys("FIS"+Keys.ENTER);
		selenium.setSpeed(2000); // one time declare is fine to wait for each web element inspection
		driver.findElement(By.linkText("FIS: Global Business Solutions | Financial Software")).click();
		
	}

}
