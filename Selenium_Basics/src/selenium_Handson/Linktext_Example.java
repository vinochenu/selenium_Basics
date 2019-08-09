package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linktext_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Link.html");
		
		//Link Text
		WebElement linktext=Object.findElement(By.linkText("Go to Home Page"));
		linktext.click();
		
		Thread.sleep(2000);
		
		Object.navigate().to("http://www.leafground.com/pages/Link.html");
		
		//Partial link
		WebElement partiallink=Object.findElement(By.partialLinkText("Home Page"));
		partiallink.click();
		
		String Title1=Object.getTitle();
		System.out.println(Title1);
		
		Object.close();
	}

}
