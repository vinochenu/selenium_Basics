package selenium_Interview_Question;

import org.testng.annotations.Test;

public class InvocationCount {
	@Test(invocationCount=3)// it will execute the below program in 3 times
	public void invocationCount() {
		System.out.println("Test");
	}

}
