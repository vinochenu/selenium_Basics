package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/frame.html");
		
		
		//case 1:
		//switch to frame
		Object.switchTo().frame(0);
		//to click the frame
		WebElement frame1=Object.findElement(By.id("Click"));
		frame1.click();
		
		//to get the text
		String frame1text=Object.findElement(By.id("Click")).getText();
		System.out.println(frame1text);
		
		
		//to get back to parent page
		Object.switchTo().defaultContent();// to get back to parent page from frame
		
		//case 2: to click the nested frame
		//to switch to nested frame
		Object.switchTo().frame(1);
		Object.switchTo().frame("frame2");
		
		
		WebElement nestedframe=Object.findElement(By.id("Click1"));
		nestedframe.click();
		
		String nestedframetext=nestedframe.getText();
		System.out.println(nestedframetext);
		
		Object.switchTo().defaultContent();
		
		//case 3: no of frames
		int size=Object.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		Object.close();
		

	}

}
