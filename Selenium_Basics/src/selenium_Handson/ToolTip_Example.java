package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/tooltip.html");
		
		//how to get text of Tool tip
		
		WebElement tooltip=Object.findElement(By.id("age"));
		String tooltiptext=tooltip.getAttribute("title");// use always getattribute as 'title' inorder to get toop tip text

		System.out.println(tooltiptext);
		
		Object.close();
	}
	

}
