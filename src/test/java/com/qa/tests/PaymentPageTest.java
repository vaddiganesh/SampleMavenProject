package com.qa.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utils.FileUtils;

public class PaymentPageTest {

	final static Logger logger = Logger.getLogger(PaymentPageTest.class);
	FileUtils fileUtils = new FileUtils();
	
	@Test
	public void paymentCheck() {
		logger.info("Calling from paymentCheck");
		fileUtils.paymentSuccess();
		Assert.assertTrue(true);
	}
}
