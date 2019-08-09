package selenium_Interview_Question;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadExecutionException;
import org.testng.internal.thread.ThreadTimeoutException;

public class ExceptionHandling_TestNG_timeOut {
	
	@Test(timeOut=2000,expectedExceptions=ThreadTimeoutException.class)// this will skip the test case failing since we give the expected exception
	public void exceptionHandling() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Test");
	}

}
