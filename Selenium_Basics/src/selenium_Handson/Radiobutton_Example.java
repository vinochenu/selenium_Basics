package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/radio.html");
		
		//to find default selected radio button
		
		WebElement defaultRadioButton=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[1]"));
		
		boolean status1=defaultRadioButton.isSelected();
		System.out.println("is Radio button1 selected"+" "+status1);
		
		WebElement defaultRadioButton1=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/div/div/input[2]"));
		boolean status2=defaultRadioButton1.isSelected();
		System.out.println("is Radio button2 selected"+" "+status2);
		
		//to select one radio button option
		
		WebElement selectRadioButton=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/div/div/input[2]"));
		selectRadioButton.click();
		
		Object.close();
	}

}
