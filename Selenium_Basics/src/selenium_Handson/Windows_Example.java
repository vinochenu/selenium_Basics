package selenium_Handson;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Window.html");
		
		//to get current window/parent window details
		String oldWindowDetail=Object.getWindowHandle();
		System.out.println("parent window is"+" "+oldWindowDetail);
		
		//to get another window
		WebElement newWindow=Object.findElement(By.id("home"));
		newWindow.click();
		
		//to switch/control the newly opened window
		
		Set<String>NewlyOpnedWindows=Object.getWindowHandles();
		
		for (String freshWindow : NewlyOpnedWindows) {
			
			Object.switchTo().window(freshWindow);
			System.out.println("current window is "+" "+freshWindow);
			
		}
		
		
		//to edit  currently opened window
		WebElement editbox=Object.findElement(By.xpath("//*[@id=\'post-153\']/div[2]/div/ul/li[1]/a"));
		editbox.click();
		
		//to close currently controlled/switched window
		Object.close();
		
		//to switch back the Parent window
		Object.switchTo().window(oldWindowDetail);
		System.out.println("current window detail is "+" "+oldWindowDetail);
		
		
		//to find the no of opened windows
		WebElement multipleWindowOpen=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		multipleWindowOpen.click();
		
		int OpenWindowsCount=Object.getWindowHandles().size();
		System.out.println("No of windows opened is "+" "+OpenWindowsCount);
		
		
		//Object.close();
		
		//to close all window except parent window
		
		WebElement notCloseParentWindow=Object.findElement(By.id("color"));
		notCloseParentWindow.click();
		
		Set<String> OpenedWindowsnow= Object.getWindowHandles();
		
		for (String closeWindow : OpenedWindowsnow)
			{
			
			if(!closeWindow.equals(oldWindowDetail))
				Object.switchTo().window(closeWindow).close();
			System.out.println("child window closed successfully");
			
		}
		
		//to close all windows opened by this driver
		Object.quit();
		
		
		
		

	}

}
