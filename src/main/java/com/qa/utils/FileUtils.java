package com.qa.utils;

import org.apache.log4j.Logger;

public class FileUtils {

	final static Logger logger = Logger.getLogger(FileUtils.class);
	
	public void copyFileSuccess() {
		//System.out.println("File copied successfully!");
		logger.info("File copied successfully!");
	}
	
	public void copyFileFailure() {
		//System.out.println("File copy failed!");
		logger.warn("File copy failed!");
	}

	public void paymentSuccess() {
		//System.out.println("Payment successful");
		logger.info("Payment successful");
	}
}
