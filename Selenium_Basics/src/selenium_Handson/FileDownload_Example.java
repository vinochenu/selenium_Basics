package selenium_Handson;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownload_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/download.html");
		
		//to download the file
		Object.findElement(By.linkText("Download xls")).click();
		
		Thread.sleep(6000);//to wait 6 sec to download the file
		
		//to validate the download under location
		//to specify the file downloaded location
		File filelocation=new File("C:\\Users\\e3027405\\Downloads");
		// to store all the listed files under the specified location
		File[] totalfiles=filelocation.listFiles();
		
		//to iterate all the lsited files and find the download file
		for (File downloadfile : totalfiles) {
			
			if(downloadfile.getName().equals("download.xls")) {
				System.out.println("file downloaded successfully");
				break;// to stop the iteration once get the respective file
		}else
		{
			System.out.println("others files are:"+" "+downloadfile.getName());
		}
		}
		
		Object.close();
		
	}

}
