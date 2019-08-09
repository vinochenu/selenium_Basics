package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Edit.html");
		
		//Enter a text
		WebElement editbox=Object.findElement(By.id("email"));
		editbox.clear();
		editbox.click();
		editbox.sendKeys("Test");
		
		//append a text
		WebElement appendbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input"));
		appendbox.sendKeys("append Test");
		
		Thread.sleep(2000);
		
		//Get Text
		WebElement gettextbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input"));
		String gettextvalue=gettextbox.getAttribute("value");
		System.out.println("value of text box is"+" "+gettextvalue );
		
		Thread.sleep(2000);
		
		
		//clear Text
		WebElement clearbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/div/div/input"));
		clearbox.clear();
		
		Thread.sleep(2000);
		
		//to confirm disabled or not ?
		WebElement disabledbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		Boolean disablevalue=disabledbox.isEnabled();
		System.out.println("field is enabled ?"+" "+disablevalue);
		
		
		//close browser
		Object.close();
	}

}
