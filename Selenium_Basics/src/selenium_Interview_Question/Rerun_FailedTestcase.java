package selenium_Interview_Question;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Rerun_FailedTestcase {
	@Test(retryAnalyzer=Rerun_IRetryAnalyzer.class)
	public void test1() {
		Assert.assertEquals(true, false);
	}
	@Test(retryAnalyzer=Rerun_IRetryAnalyzer.class)
	public void test2() {
		Assert.assertEquals(true, false);
	}

}
