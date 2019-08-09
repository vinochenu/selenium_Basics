package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("https://www.w3schools.com/sql/");
		
		//link text
		WebElement linktext=Object.findElement(By.xpath("//*[@id=\'leftmenuinnerinner\']/a[1]"));
		linktext.click();
		
		//back to current page
		Object.navigate().back();
		String Title=Object.getTitle();
		System.out.println(Title);
		
		Thread.sleep(3000);
		
		//forward to current page
		Object.navigate().forward();
		String title1=Object.getTitle();
		System.out.println(title1);
		
		Thread.sleep(3000);
		
		//refresh curent page
		Object.navigate().refresh();
		String Title2=Object.getTitle();
		System.out.println(Title2);
		
		//close browser
		Object.close();

	}

}
