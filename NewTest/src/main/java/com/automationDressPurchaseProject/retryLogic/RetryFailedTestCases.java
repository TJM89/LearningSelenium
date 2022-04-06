package com.automationDressPurchaseProject.retryLogic;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.automationDressPurchaseProject.BasePackage.TestBase;

public class RetryFailedTestCases extends TestBase implements IRetryAnalyzer {

	int counter = 1;
	int maxCount = 3;

	@Override
	public boolean retry(ITestResult result) {

		logger.info("Trying failed Test Case " + counter + " times");

		if (counter < maxCount) {
			counter++;
			return true;
		}

		return false;
	}

}
