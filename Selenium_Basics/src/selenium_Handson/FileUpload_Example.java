package selenium_Handson;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import javax.tools.Tool;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload_Example {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/upload.html");

		
		WebElement uploadbutton=Object.findElement(By.name("filename"));
		uploadbutton.click();
		
		Thread.sleep(3000);//let system wait for some time to perform copy operation
		
		//just to store the file location in string
		String Filelocation="C:\\Users\\e3027405\\Downloads\\download.xls";
		
		
		//to convert the string into plain text & to transfer it
		StringSelection transfer=new StringSelection(Filelocation);
		
		//to copy the specific file location & store in the system clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(transfer, null);
		
		//to paste the copied file location
		
		Robot robot=new Robot();//this class is used to handle keyboard/mouse interaction in window based application
		robot.keyPress(KeyEvent.VK_CONTROL);//to open online keyboard & press controll
		robot.keyPress(KeyEvent.VK_V);//to press v
		robot.keyRelease(KeyEvent.VK_V);//to release v
		robot.keyRelease(KeyEvent.VK_CONTROL);//to release control
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_ENTER);//to press enter
		robot.keyRelease(KeyEvent.VK_ENTER);//to release enter
		
		System.out.println("file uploaded successfully");
		
		Object.close();
		
		
		
		
	}

}
