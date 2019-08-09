package selenium_Handson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTable_Example {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\e3027405\\Downloads\\chromedriver.exe");
		//Open Chrome Browser
		WebDriver Object=new ChromeDriver();
		//Get URL
		Object.get("http://www.leafground.com/pages/table.html");
		
		//case 1:to get the no of columns in Dynamic Table
		
		List<WebElement> column=Object.findElements(By.tagName("th"));
		int columncount=column.size();
		System.out.println("no of column is "+columncount);
		
		//Case 2:to get the no of rows in Dynamic Table
		
		List<WebElement> row=Object.findElements(By.tagName("tr"));
		int rowcount=row.size();
		System.out.println("no of row is "+rowcount);
		
		//case 3: Get the progress value of 'Learn to interact with Elements'  
		
		//NOTE: in this we have used 'Normalize-space()' method since the text having space and used 'following because we selected the cell next or following to the mentioned text and predicates td[1] here many cell are following from the text so we are giving td[1] - 1 -> predicates which denotes 1 cell
		
		WebElement progressvalue=Object.findElement(By.xpath("//td[normalize-space()='Learn to interact with Elements']//following::td[1]"));
		String progressvaluetext=progressvalue.getText();
		System.out.println("the progress value of 'Learn to interact with Elements' is "+progressvaluetext);
		
		
	
		// case 4: Check the vital task for the least completed progress
		
		//to store all  cell value
		List<WebElement> columnpercentage=Object.findElements(By.xpath("//td[2]"));
		
		//to store in integer with array list
		List<Integer> columnpercentage1=new ArrayList<>();
		
		//to iterate all cell value
		for (WebElement Individual_columnpercentage : columnpercentage) {
			
			String percentage_value=Individual_columnpercentage.getText().replace("%", "");//get the cell value & remove '%' from it
			System.out.println("column value in string "+percentage_value);
			columnpercentage1.add(Integer.parseInt(percentage_value));//to convert string into Integer(so that can compare & find the smaller one )
		}
		
		System.out.println("column value in int "+columnpercentage1);
		
		int smallvalue=Collections.min(columnpercentage1);// to find the smaller one from the array integer list
		
		System.out.println("Smaller percentage is "+smallvalue);
		
		
		String int_value=Integer.toString(smallvalue)+"%";// again to convert into string from integer & adding '%' which was removed
		
		//td[normalize-space()='20%']//following::td[1]
		
		String finalXpath="//td[normalize-space()="+"\""+ int_value + "\""+"]"+"//following::td[1]";// to get the variable with xpath 
		
		System.out.println(finalXpath);
		
			WebElement vitaltask=Object.findElement(By.xpath(finalXpath));
			vitaltask.click();//to check in the vital task who having least progress
			
			// case 5: Check the vital task for the high completed progress
			
			
			List<WebElement> progresslist=Object.findElements(By.xpath("//td[2]"));
			
			List<Integer> progress_int=new ArrayList<>();
			
			for (WebElement individual_list : progresslist) {
				
				String list_text=individual_list.getText().replace("%", "");
				
				progress_int.add(Integer.parseInt(list_text));
				
			}
			System.out.println(progress_int);
			
			
			int greater_value=Collections.max(progress_int);
			System.out.println("vital task for the high completed progress is "+greater_value);
			
			
		String vlaue_great=Integer.toString(greater_value)+"%";
		
		//td[normalize-space()='100%']//following::td[1]
		
		
		String finalXpath2="//td[normalize-space()=" +"\""+ vlaue_great +"\"" +  "]" +"//following::td[1]";
		
		System.out.println(finalXpath2);
				
				WebElement vital_higher=Object.findElement(By.xpath(finalXpath2));
				vital_higher.click();
				
				Thread.sleep(3000);
				
				Object.close();
		
		

	}

}
