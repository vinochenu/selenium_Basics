package selenium_Handson;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/sortable.html");

		// to get all list
		List<WebElement> elementslist=Object.findElements(By.xpath("//*[@id=\'sortable\']/li"));
		int elementcount=elementslist.size();
		System.out.println(elementcount);
		
		//to sort footer to header
		
		WebElement toElement=elementslist.get(0);
		WebElement fromElement=elementslist.get(6);
	
		//to perform mouse/key board interaction- create object for Actions class
		Actions action=new Actions(Object);
		
		action.clickAndHold(fromElement);//drag from element
		action.moveToElement(toElement);//move to target(to element)
		action.release(toElement);//drop
		action.build().perform();//perform the action
	
	
		
		Thread.sleep(6000);
		
		Object.close();
		
		
	}

}
