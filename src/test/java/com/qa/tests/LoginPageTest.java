package com.qa.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.utils.*;

public class LoginPageTest {
	
	final static Logger logger = Logger.getLogger(LoginPageTest.class);
	FileUtils fileUtils = new FileUtils();
	
	@Test
	public void loginPageTest() {
		logger.info("Calling from loginPageTest");
		fileUtils.copyFileFailure();
		Assert.assertTrue(false);
	}

}
