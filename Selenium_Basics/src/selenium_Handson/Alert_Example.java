package selenium_Handson;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Alert.html");
		
		Thread.sleep(2000);

		//to accept alertbox display

		WebElement alertbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/div/div/button"));
		alertbox.click();

		Alert alert=Object.switchTo().alert();
		alert.accept();
		
		System.out.println("1 executed");
		
		Thread.sleep(2000);

		//to dismiss the confirm box

		WebElement confirmbox=Object.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[2]/div/div/button"));
		confirmbox.click();
		Alert alert1=Object.switchTo().alert();
		alert1.dismiss();
		
		System.out.println("2 executed");

		//to accept the confirm box
		
		Thread.sleep(2000);

		WebElement confirmbox1=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/button"));
		confirmbox1.click();
		Alert alert2=Object.switchTo().alert();
		alert2.accept();
		
		System.out.println("3 executed");
		
		//to handle Promptbox
		
		Thread.sleep(2000);
		
		WebElement promptbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/button"));
		promptbox.click();
		Alert alert3=Object.switchTo().alert();
		alert3.sendKeys("Vinod_Test");
		alert3.accept();
		
		System.out.println("4 executed");
		
		Object.close();

	}

}
