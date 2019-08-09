package selenium_Interview_Question;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ActiveElements {
	
	WebDriver driver;
@Test
	public void activeElement() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\e3027405\\Downloads\\version 2.36\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		driver.switchTo().activeElement().sendKeys("FIS \n");//this will directly go to search box and type 

}
}
