package selenium_Handson;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCloseBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/");
		//TO get Title
		String Title=Object.getTitle();
		System.out.println("Title is :"+" "+Title);
		//To get the current URL
		String URL=Object.getCurrentUrl();
		System.out.println("URL is :"+" "+URL);
		//To get Pagesource
		String Pagesource=Object.getPageSource();
		System.out.println("Pagesource is :"+" "+Pagesource);
		//To get WindowHandle
		String WindowHandle=Object.getWindowHandle();
		System.out.println("WindowHandle is :"+" "+WindowHandle);
		Set<String> WindowHandles=Object.getWindowHandles();
		System.out.println("WindowHandles is :"+" "+WindowHandles);
		//Close Browser
		Object.close();
		
		

	}

}
