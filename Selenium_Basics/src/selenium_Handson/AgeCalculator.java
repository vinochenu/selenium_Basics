package selenium_Handson;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class AgeCalculator {

	WebDriver driver;

	ExtentReports reports;

	ExtentTest test;

	@BeforeTest
	public void browserOpen() {
		System.setProperty("webdriver.chrome.driver","C:\\vinoth\\Software\\Browser Drivers\\ChromeDriver 79.0.3945.16\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://qa-engineer-exercise.azurewebsites.net/");

		reports=new ExtentReports("TestOutput.html");

	}


	@AfterTest
	public void browserClose() {
		driver.close();
		reports.flush();
	}


	//Test case 1:
	@Test(priority=1)
	public void verifyHomePage() throws IOException {
		test=reports.startTest("Test case 1: Verify the Home Page");

		test.log(LogStatus.INFO, "Test case 1:Verify the Title");
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="Age Calculator Demo";

		if(ActualTitle.equals(ExpectedTitle))
		{
			test.log(LogStatus.PASS, "Title is "+ActualTitle);
			test.log(LogStatus.INFO, "Test case 1: (Verify the Home Page)- passed");
			// Screen shot for Test case 1 pass status
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("Title_pass.jpg");
			FileHandler.copy(source,destination);
			test.addScreenCapture("Title_pass.jpg");
		}

		else {
			test.log(LogStatus.FAIL, "Test case 1: (Verify the Home Page)- failed");

			// Screen shot for Test case 1 fail status
			TakesScreenshot screenshot=(TakesScreenshot) driver;
			File source=screenshot.getScreenshotAs(OutputType.FILE);
			File destination=new File("Title_fail.jpg");
			FileHandler.copy(source,destination);
			test.addScreenCapture("Title_fail.jpg");
		}
	}


	//Test case 2:
	@Test(priority=2)
	public void validInput() throws IOException, InterruptedException {

		test=reports.startTest("Test case 2: Verify Age with valid input");

		test.log(LogStatus.INFO, "Test case 2: Verify Age with valid input");
		//Enter your age
		driver.findElement(By.id("Birthday")).clear();
		driver.findElement(By.id("Birthday")).click();
		driver.findElement(By.id("Birthday")).sendKeys("31/01/1990");

		Thread.sleep(3000);

		//Calculate your age
		WebElement calculate=driver.findElement(By.xpath("//*[@type='submit' and @value='Calculate']"));
		calculate.submit();


		List<WebElement> agedetails=driver.findElements(By.xpath("//h1[@class='display-4']"));
		for (WebElement agetext : agedetails) {
			if(agetext.getText().contains("You're")) 
			{
				test.log(LogStatus.PASS, "Hello, "+agetext.getText());
				test.log(LogStatus.PASS, "Test case 2: (Calculate Age with valid input)-passed");


				// Screen shot for Test case 2 pass status
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("Age calculation with valid input_pass.jpg");
				FileHandler.copy(source,destination);
				test.addScreenCapture("Age calculation with valid input_pass.jpg");
			}
			else 
			{
				test.log(LogStatus.FAIL, "Age is "+agetext.getText());
				test.log(LogStatus.FAIL, "Test case 2: (Calculate Age with valid input)-failed");

				// Screen shot for Test case 2 fail status
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("Age calculation with valid input_fail.jpg");
				FileHandler.copy(source,destination);
				test.addScreenCapture("Age calculation with valid input_fail.jpg");
			}

			Thread.sleep(3000);

			driver.findElement(By.partialLinkText("Try Again")).click();

		}
	}

	//Test case 3:
	@Test(priority=3)
	public void blankInput() throws IOException, InterruptedException {

		test=reports.startTest("Test case 3: Verify Age with blank input");

		test.log(LogStatus.INFO, "Test case 3: Verify Age with blank input");
		//Enter your age
		driver.findElement(By.id("Birthday")).clear();
		driver.findElement(By.id("Birthday")).click();
		driver.findElement(By.id("Birthday")).sendKeys(" ");

		Thread.sleep(3000);

		//Calculate your age
		WebElement calculate=driver.findElement(By.xpath("//*[@type='submit' and @value='Calculate']"));
		calculate.submit();


		List<WebElement> errordetails=driver.findElements(By.xpath("//h1[@class='display-4']"));
		for (WebElement errortext : errordetails) {
			if(errortext.getText().contains("Value cannot be null")) 
			{
				test.log(LogStatus.PASS, "Error Displayed as "+ errortext.getText());
				test.log(LogStatus.PASS, "Test case 3: (Verify Age with blank input)-passed");


				// Screen shot for Test case 2 pass status
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("Age with blank input_pass.jpg");
				FileHandler.copy(source,destination);
				test.addScreenCapture("Age with blank input_pass.jpg");
			}
			else 
			{
				test.log(LogStatus.FAIL, "Error Displayed as "+errortext.getText());
				test.log(LogStatus.FAIL, "Test case 3: (Age with blank input)-failed");

				// Screen shot for Test case 2 fail status
				TakesScreenshot screenshot=(TakesScreenshot) driver;
				File source=screenshot.getScreenshotAs(OutputType.FILE);
				File destination=new File("Age with blank input_fail.jpg");
				FileHandler.copy(source,destination);
				test.addScreenCapture("Age with blank input_fail.jpg");
			}

			Thread.sleep(3000);

			driver.findElement(By.partialLinkText("Try Again")).click();

		}


	}
	
	
	//Test case 4:
		@Test(priority=4)
		public void invalidInput() throws IOException, InterruptedException {

			test=reports.startTest("Test case 4: Verify Age with invalid input");

			test.log(LogStatus.INFO, "Test case 4: Verify Age with invalid input");
			//Enter your age
			driver.findElement(By.id("Birthday")).clear();
			driver.findElement(By.id("Birthday")).click();
			driver.findElement(By.id("Birthday")).sendKeys("jnnknknn");

			Thread.sleep(3000);

			//Calculate your age
			WebElement calculate=driver.findElement(By.xpath("//*[@type='submit' and @value='Calculate']"));
			calculate.submit();


			List<WebElement> errordetails1=driver.findElements(By.xpath("//h1[@class='display-4']"));
			for (WebElement errortext1 : errordetails1) {
				if(errortext1.getText().contains("not recognized as a valid DateTime")) 
				{
					test.log(LogStatus.PASS, "Error Displayed as "+errortext1.getText());
					test.log(LogStatus.PASS, "Test case 4: (Verify Age with invalid input)-passed");


					// Screen shot for Test case 2 pass status
					TakesScreenshot screenshot=(TakesScreenshot) driver;
					File source=screenshot.getScreenshotAs(OutputType.FILE);
					File destination=new File("Age with invalid input_pass.jpg");
					FileHandler.copy(source,destination);
					test.addScreenCapture("Age with invalid input_pass.jpg");
				}
				else 
				{
					test.log(LogStatus.FAIL, "Error Displayed as "+errortext1.getText());
					test.log(LogStatus.FAIL, "Test case 4: (Verify Age with invalid input)-failed");

					// Screen shot for Test case 2 fail status
					TakesScreenshot screenshot=(TakesScreenshot) driver;
					File source=screenshot.getScreenshotAs(OutputType.FILE);
					File destination=new File("Age with invalid input_fail.jpg");
					FileHandler.copy(source,destination);
					test.addScreenCapture("Age with invalid input_fail.jpg");
				}

				Thread.sleep(3000);

				driver.findElement(By.partialLinkText("Try Again")).click();

			}


		}

}










