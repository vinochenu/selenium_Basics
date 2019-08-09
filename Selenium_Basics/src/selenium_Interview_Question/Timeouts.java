package selenium_Interview_Question;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.NewSessionPayload;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeouts {
	
	public void timeouts() throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
	//Open Chrome Browser
	WebDriver driver=new ChromeDriver();
	//Get URL
	driver.get("http://newtours.demoaut.com/");
	
	//Thread.sleep(2000);
	//it will wait 2 seconds in all case even if web element is inspected
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//IMPLICIT WAIT
	//it will not wait if web element is inspected and polling will take place every 500 milliseconds
	//implicit wait- we cannot give any condition
	
	
	driver.findElement(By.name("userName")).sendKeys("vinoalphaq@gmail.com");
	driver.findElement(By.name("password")).sendKeys("Puspam@3118");
	driver.findElement(By.name("login")).click();
	
	//EXPLICIT WAIT
	
	/*WebDriverWait wait=new WebDriverWait(driver, 30);
	WebElement submit=wait.until(ExpectedConditions.elementToBeClickable(By.name("login")));
	submit.click();
	*/
	
	//FLUENT WAIT
	
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
			.withTimeout(30,TimeUnit.SECONDS)
			.pollingEvery(3,TimeUnit.SECONDS)
			.ignoring(org.openqa.selenium.NoSuchElementException.class);
	
	
	WebElement submit=wait.until(new Function<WebDriver, WebElement>() {

		
		public WebElement apply(WebDriver driver) {
			// TODO Auto-generated method stub
			return driver.findElement( By.name("login"));
		}
	});

	submit.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Timeouts object=new Timeouts();
		object.timeouts();

	}

}
