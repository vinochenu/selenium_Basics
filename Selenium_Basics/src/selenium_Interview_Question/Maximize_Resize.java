package selenium_Interview_Question;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Maximize_Resize {
	WebDriver driver;
	
/*	@Test
	public void chromeOptions() {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}*/
	

	
	@Test
	public void maximize() throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.close();
	}
	
	/*@Test
	public void resize() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		Dimension dimension=new Dimension(500, 800);
		driver.manage().window().setSize(dimension);
		Thread.sleep(2000);
		driver.close();
	}*/
	
	

}
