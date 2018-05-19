package com.qa.tests;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.*;

import com.qa.utils.*;

public class HomePageTest {

	final static Logger logger = Logger.getLogger(HomePageTest.class);
	FileUtils fileUtils = new FileUtils();
	
	@Test
	public void homepageTest() {
		logger.info("Calling from homepageTest");
		fileUtils.copyFileSuccess();
		Assert.assertTrue(true);
	}
}
