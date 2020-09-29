package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Age_Calculator {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\ChromeDriver 79.0.3945.16\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://qa-engineer-exercise.azurewebsites.net/");
		
		
		driver.findElement(By.id("Birthday")).clear();
		driver.findElement(By.id("Birthday")).click();
		driver.findElement(By.id("Birthday")).sendKeys("31/01/1990");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='submit' and @value='Calculate']")).submit();
		
		Thread.sleep(4000);
		
		driver.close();
		
	    System.out.println("Age calculated successfully");
		
		
	
	}

}
