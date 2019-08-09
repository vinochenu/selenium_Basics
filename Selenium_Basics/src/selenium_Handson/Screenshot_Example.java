package selenium_Handson;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_Example {

	public static void main(String[] args) throws IOException, AWTException {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/Alert.html");
		
		Object.findElement(By.xpath("//*[@id=\"contentblock\"]/section/div[1]/div/div/button")).click();
		
		//Using TakeScreenshot
		/*TakesScreenshot screenshot=(TakesScreenshot) Object;
		File Sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		
		File destinationfile=new File("C:\\vinoth\\Selenium\\Selenium_Screenshot\\sample.png");
		FileHandler.copy(Sourcefile, destinationfile);*/
		
		//NOTE: TakeScreenshot wont handle alert pop up so it will throw "org.openqa.selenium.UnhandledAlertException" in this case we can use Robot class for taking screenshot.
		//Also we should use Robot class only for taking complete screen 
		
		Robot robot=new Robot();
	Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		BufferedImage sourcefile=robot.createScreenCapture(rectangle);
		
		File destinationfile=new File("C:\\vinoth\\Selenium\\Selenium_Screenshot\\sample1.png");
		
		ImageIO.write(sourcefile, "png", destinationfile);
		
		
		
	}

}
