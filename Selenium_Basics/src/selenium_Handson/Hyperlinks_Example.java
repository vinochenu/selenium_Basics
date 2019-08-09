package selenium_Handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hyperlinks_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Navigate to  URL
		//this navigate function will store the current url cookies so that we can perform 'Back','forward' & 'refresh' action which cant do by get()
		Object.navigate().to("http://www.leafground.com/pages/Link.html");
		
		
		//case 1: Go to Home page by clicking given link
		WebElement Homepagelink=Object.findElement(By.linkText("Go to Home Page"));
		Homepagelink.click();
		
		//to go back to previous page
		Object.navigate().back();
		
		
		//case 2: Find where am supposed to go without clicking me?
		
		//Attribute 'href' defines where the target link
		
		WebElement whereamlink=Object.findElement(By.partialLinkText("Find where"));
		String where=whereamlink.getAttribute("href");
		System.out.println("where am supposed to go without clicking me :"+" "+where);
		
		//case 3: Verify am I broken?
		
		WebElement brokenlink=Object.findElement(By.partialLinkText("broken"));
				brokenlink.click();
        //to get the title
		String Title=Object.getTitle();
		if(Title.contains("404"))//404- error page
		{
			System.out.println("link is broken");
		}else
		{
			System.out.println("link is not broken");
		}
		
		Object.navigate().back();
		
		//case 4: Go to Home Page (Interact with same link name)  
		//which means using old or initial identified web element, go to home page

		
		//Homepagelink.click();// from case 1; this is already identified so use the same but we will get the below exception
		
		/*Exception: Interview question
		org.openqa.selenium.StaleElementReferenceException:  stale element reference: element is not attached to the page document
		
		Explanation: 
		when the page is redirecting or refreshing, then web driver will find the element from first step
		so we can not simply use the web element which is already inspected.
		we need to find the web element newly*/
		
		WebElement Homepagelink1=Object.findElement(By.linkText("Go to Home Page"));
		Homepagelink1.click();
		
		Object.navigate().back();
		
		//case 5: How many links are available in this page? tag 'a' defines 'link' 
		
		List<WebElement> totallink=Object.findElements(By.tagName("a"));
		int linkcount=totallink.size();
		System.out.println("Total no of links is"+" "+linkcount);
		
		
		Object.close();
		

	}

}
