package selenium_Interview_Question;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Rerun_IRetryAnalyzer implements IRetryAnalyzer {

	int failedcount=0;
	int rerun_limit=3;
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(failedcount<rerun_limit)
		{
			failedcount++;
			return true;
		}
		return false;
	}

	
	
}
