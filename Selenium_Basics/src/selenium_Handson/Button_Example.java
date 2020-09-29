package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Button.html");
		
		//click button
		WebElement clickbutton=Object.findElement(By.id("home"));
		clickbutton.click();
		
		Thread.sleep(3000);
		//back 
		Object.navigate().back();
		
		
		//To Get Button Position
		WebElement positionbutton=Object.findElement(By.id("position"));
		int xvlaue=positionbutton.getLocation().getX();
		System.out.println("position of X is "+" "+xvlaue);
		int yvalue=positionbutton.getLocation().getY();
		System.out.println("position of Y is "+" "+yvalue);
		
		Thread.sleep(3000);
		
		
		//to get button color
		WebElement buttoncolor=Object.findElement(By.id("color"));
	String colorvalue=buttoncolor.getCssValue("background-color");
	System.out.println("color of button is "+" "+colorvalue);
	
	Thread.sleep(3000);
	
	
	//to get height & width
	WebElement size=Object.findElement(By.id("size"));
	int height=size.getSize().getHeight();
	System.out.println("Button height is "+" "+height);
	int width=size.getSize().getWidth();
	System.out.println("Button width is "+" "+width);
	
	Object.close();
	
	}

}
