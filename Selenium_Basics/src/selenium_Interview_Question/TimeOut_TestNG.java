package selenium_Interview_Question;

import org.testng.annotations.Test;

public class TimeOut_TestNG {
	
	@Test(timeOut=2000)
	public void timeOut() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test");
	}

}
