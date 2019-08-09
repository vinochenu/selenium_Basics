package selenium_Handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoComplete_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/autoComplete.html");
		
		//to enter 'e' for search the realted option
		WebElement autocompletebox=Object.findElement(By.id("tags"));
		autocompletebox.sendKeys("e");
		
		Thread.sleep(3000);//to wait in order to get all web elements
		
		//to store all the web element & print the total size
		List<WebElement> optionlist=Object.findElements(By.xpath("//*[@id=\'ui-id-1\']/li"));
		int optionlistsize=optionlist.size();
		System.out.println("optionlistsize is"+" "+optionlistsize);
		
		//to select the required option from list
		for (WebElement option : optionlist) {
			if(option.getText().equals("Selenium"))
					{	
				System.out.println("selected option is"+" "+option.getText());
				option.click();
				break;// to stop the iteration once required option is selected
					}else {
						System.out.println("un selected option is"+" "+option.getText());
					}
		}
		
		Object.close();
		}
		

	}

