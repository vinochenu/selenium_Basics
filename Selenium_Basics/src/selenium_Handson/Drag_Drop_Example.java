package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop_Example {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/drop.html");
		
		//to get the source web element( to drag)
		WebElement From=Object.findElement(By.id("draggable"));
		
		//to get the destination webelement(to drop)
		WebElement To=Object.findElement(By.id("droppable"));
		
		//Thread.sleep(3000);
		
		//to perfom drag & drop
		Actions action=new Actions(Object);// to create object for Actions class for mouse interaction
		
		//action.clickAndHold(From).moveToElement(To).release(To).build().perform();// to drag & drop
		
		action.dragAndDrop(From, To);
		
		Object.close();
		
		
	}

}
