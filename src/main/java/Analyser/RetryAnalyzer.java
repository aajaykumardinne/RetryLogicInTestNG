package Analyser;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {

	// Revised 
	// To execute the failed test cases in Selenium at the Run time
	int counter = 0;
	int retryLimit = 3;

	public boolean retry(ITestResult result) {

		if (counter < retryLimit) {
			counter++;
			return true;
		}
		return false;

	}

}
