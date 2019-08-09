package selenium_Handson;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.asm.Advice.Enter;

public class Calendar_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.navigate().to("http://www.leafground.com/pages/Calendar.html");
		
		
		//case 1: to enter the date by inputing values(uisng send keys) in jquery calendar
		/*WebElement date_month=Object.findElement(By.id("datepicker"));
		date_month.clear();
		date_month.click();
		date_month.sendKeys("01/10/2019"+Keys.ENTER);// after inputing, to press 'enter'
*/		
		
		//case 2: to select the date & month by clicking from calendar
		WebElement date_month=Object.findElement(By.id("datepicker"));
		date_month.clear();
		date_month.click();
		date_month.click();

		// to click next button to navigate to next month in jquery calendar(absolute xpath)
		//month
		/*WebElement month=Object.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[2]/span"));
		month.click();
		
		//date
		WebElement date=Object.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[6]/td[1]/a"));
		date.click();*/
		
		
		// to click next button to navigate to next month in jquery calendar(relative xpath)
		
		//month
		WebElement month=Object.findElement(By.xpath("//a[@title='Next']"));
		month.click();
		WebElement month1=Object.findElement(By.xpath("//a[@title='Next']"));
		month1.click();
		//date
		WebElement date=Object.findElement(By.xpath("//a[contains(text(),'30')]"));
		date.click();
		
		Thread.sleep(3000);
		
	Object.close();	
	
		
	}

}
