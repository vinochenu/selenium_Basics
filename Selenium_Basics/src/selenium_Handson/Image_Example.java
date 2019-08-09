package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Image_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Image.html");
		
		//to get the homepage by clicking image
		WebElement imageclick=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/img"));
		imageclick.click();
		
		//navigate to image page 
		Object.navigate().to("http://www.leafground.com/pages/Image.html");
		
		
		//to find the image is broken or not?
		
		WebElement brokenimage=Object.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/img"));
		if(brokenimage.getAttribute("naturalWidth").equals("0")) // if any image, its attribute-(naturalWidth) is '0' then its broken image
		{
			System.out.println("This image is broken");
		}else {
			System.out.println("This image is not broken");
		}
		
		Object.close();
		
	}

}
