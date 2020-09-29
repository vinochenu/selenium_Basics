package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Transaction {
	
	
	@Test
	public void transactionSearch() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://10.136.87.99:9464/dnacc3sit/checkLogonType.do");
		driver.findElement(By.name("userId")).click();
		driver.findElement(By.name("userId")).clear();
		driver.findElement(By.name("userId")).sendKeys("FISUSER1");
		
		driver.findElement(By.name("password")).click();
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Pass#123");
		
		driver.close();
	}

}
