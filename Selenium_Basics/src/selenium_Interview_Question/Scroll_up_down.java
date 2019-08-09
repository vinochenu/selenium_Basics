package selenium_Interview_Question;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scroll_up_down {

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
		
		@Test(priority=1)
		//to scroll down some particular measurement-450
		public void scrollSome() throws InterruptedException {
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("window.scroll(0,450)", "");// scroll down
			Thread.sleep(3000);
			executor.executeScript("window.scroll(0,-450)", "");// scroll up
		}
	
		
		@Test(priority=2)
		public void scrollfullbottom() throws InterruptedException {
			JavascriptExecutor executor=(JavascriptExecutor) driver;
			executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");//scroll till bottom
			Thread.sleep(3000);
			executor.executeScript("window.scrollTo(0,0)", "");
		}
			
			@Test(priority=3)
			public void scrollTillInspectElement() throws InterruptedException {
				
				WebElement element=driver.findElement(By.linkText("About"));
				JavascriptExecutor executor=(JavascriptExecutor) driver;
				executor.executeScript("arguments[0].scrollIntoView(true)", element);
				Thread.sleep(3000);
				
				
				
			}
			
		}
		
		
		
	

