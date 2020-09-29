package selenium_Handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/selectable.html");
		
		//to select multi option(control+select)
		
		List<WebElement> selectable=Object.findElements(By.xpath("//*[@id=\'selectable\']/li"));
		int listsize=selectable.size();
		System.out.println(listsize);
		
		Actions action=new Actions(Object);//to create object for Actions class for mouse/keyboard interaction
		
		//to multip select the list/option- by using keyboard
		/*action.keyDown(Keys.CONTROL)
		.click(selectable.get(0))
		.click(selectable.get(1))
        .click(selectable.get(2))
		.build().perform();*/
		
		//or second option : to multip select the list/option- by using mouse
		action.clickAndHold(selectable.get(0))
		.clickAndHold(selectable.get(1))
		.clickAndHold(selectable.get(2))
		.build().perform();
		
		Thread.sleep(3000);
		
		Object.close();
		
		
		

	}

}
