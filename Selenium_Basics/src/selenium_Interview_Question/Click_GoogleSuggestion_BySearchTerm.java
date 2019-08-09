package selenium_Interview_Question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click_GoogleSuggestion_BySearchTerm {
	WebDriver driver;
	@Test
	public void printGoogleSuggestion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Test");
		Thread.sleep(2000);
		
		List<WebElement>allsuggestion=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		for (WebElement webElement : allsuggestion) {
			if(webElement.getText().contains("testing"))
			{
				webElement.click();
			}
		}

}
}
