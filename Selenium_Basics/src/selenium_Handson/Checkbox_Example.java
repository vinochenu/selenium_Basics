package selenium_Handson;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/checkbox.html");
		
		//checkbox selection-multiselect
		 WebElement checkbox1=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[1]"));
		 checkbox1.click();
		 WebElement checkbox2=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[1]/input[2]"));
		 checkbox2.click();
		 
		 //verify the checkbox is selected
		 
		 WebElement is_selected=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[2]/input"));
		 boolean status=is_selected.isSelected();
		 System.out.println(status);

        //deselect if select or vice versa
		 
		 WebElement firstcheckbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[1]"));
		 if(firstcheckbox.isSelected()) {
			 firstcheckbox.click();
		 }else {
			 firstcheckbox.click();
		 }
		 
		 WebElement secondcheckbox=Object.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[3]/input[2]"));
		 if(secondcheckbox.isSelected()) {
			 secondcheckbox.click(); 
		 }
		 else {
			 secondcheckbox.click(); 
		 
		 }
		 
		 Object.close();
		 
	}

}
