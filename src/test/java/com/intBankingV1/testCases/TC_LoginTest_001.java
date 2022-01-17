package com.intBankingV1.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBankingV1.pageObject.LoginPage;



public class TC_LoginTest_001 extends BaseClass{
	
	@Test
	public void loginTest() throws IOException {
		
		driver.get(baseURL);
		logger.info("URL is open");
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Entered User Name");
		
		lp.setPassword(password);
		logger.info("Entered Password");
		
		lp.clickButton();
		logger.info("Submit button clicked");
		
		if(driver.getTitle().equals("Guru99 Bank Home Page123")) {
			
			Assert.assertTrue(true);
			logger.info("Logging Test Passesd");
			
		} else {
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Loggning Test Failed");
		}
	}

}
