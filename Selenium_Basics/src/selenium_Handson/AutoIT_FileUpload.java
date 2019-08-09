package selenium_Handson;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT_FileUpload {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/upload.html");
		
		Object.findElement(By.name("filename")).click();

		
		Runtime.getRuntime().exec("C:\\vinoth\\Selenium\\AutoIT\\FileUpload.exe");
		
		System.out.println("file uploaded successfully");
		
		Object.close();
	}

}
