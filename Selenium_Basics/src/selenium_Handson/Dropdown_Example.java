package selenium_Handson;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Dropdown.html");
		
		
		//dropdown select by index
		
		WebElement selectbyindex=Object.findElement(By.id("dropdown1"));
		Select select=new Select(selectbyindex);//create select class
		select.selectByIndex(2);//dropdown selected by index
		
		System.out.println("program 1 executed");
		
		Thread.sleep(3000);
		
		//dropdown select by value
		
		select.selectByValue("1");;
		
		System.out.println("program 2 executed");
		
		Thread.sleep(3000);
		
		//dropdown select by Text
		
		WebElement selectbytext=Object.findElement(By.id("dropdown3"));
		Select select2=new Select(selectbytext);
		select2.selectByVisibleText("Selenium");
		
		System.out.println("program 3 executed");
		
		Thread.sleep(3000);
		
		//Get the no of dropdown option
		WebElement getdropdownnumber=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[4]/select"));
		Select select3=new Select(getdropdownnumber);
		List<WebElement> listofdropdown=select3.getOptions();
		/*for (int i=0;i<listofdropdown.size();i++) {
			System.out.println(listofdropdown);
		}*/
		
		int sixeofdropdown=listofdropdown.size();
		System.out.println(sixeofdropdown);
		System.out.println("program 4 executed");
		
		Thread.sleep(3000);
		
		//dropdown by sendkeys
		WebElement selectbysendkeys=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/select"));
		selectbysendkeys.sendKeys("Loadrunner");
		
		System.out.println("program 5 executed");
		
		Thread.sleep(3000);
		
		//dropdown_multipe select
		WebElement Multiselectdropdown=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[6]/select"));
		Select select4=new Select(Multiselectdropdown);
		select4.selectByIndex(0);
		select4.selectByIndex(1);
		select4.selectByIndex(2);
		
		Object.close();
		
	
		
	}

}
