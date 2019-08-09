package selenium_Interview_Question;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Print_GoogleSuggestion_url {
	
	WebDriver driver;
	@Test
	public void printGoogleSuggestion() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("FIS");
		Thread.sleep(2000);
		
		//to print all suggested links 
		List<WebElement>allLinks=driver.findElements(By.xpath("//a"));
		for (WebElement webElement : allLinks) {
			
			System.out.println(webElement.getAttribute("href"));
		}
		
		//to print only main link under suggestion
		
		List<WebElement> mainlinks=driver.findElements(By.xpath("//*[@id='gsr']//following::h3//following::div/cite"));
		for (WebElement webElement : mainlinks) {
			//System.out.println(webElement.getAttribute("href")); //to get the links
			System.out.println(webElement.getText());
		
	}

}}
