package selenium_Interview_Question;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class Enter {
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
	public void Enter1()  {
	driver.findElement(By.name("q")).sendKeys("FIS"+Keys.ENTER);//
}   
	@Test
	public void Enter2()  {
	driver.findElement(By.name("q")).sendKeys("FIS \n");
}
	@Test
	public void Enter3()  {
	WebElement searchbox=driver.findElement(By.name("q"));
	searchbox.sendKeys("FIS");
	searchbox.submit();
	}
	
	@Test
	public void Enter4() throws AWTException  {
	WebElement searchbox=driver.findElement(By.name("q"));
			searchbox.sendKeys("FIS");
	Robot robot=new Robot();
	robot.keyPress(KeyEvent.VK_ENTER);
	robot.keyRelease(KeyEvent.VK_ENTER);
	
	
}
	
	
	
}