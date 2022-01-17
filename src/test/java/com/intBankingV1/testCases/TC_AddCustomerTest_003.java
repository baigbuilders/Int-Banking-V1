package com.intBankingV1.testCases;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.intBankingV1.pageObject.AddCustomerPage;
import com.intBankingV1.pageObject.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass{
	
	Logger logger;
	WebDriver driver;
	@Test
	public void addNewCustomer() throws InterruptedException, IOException{
		
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is Provided");
		lp.setPassword(password);
		logger.info("Password is entered");
		lp.clickButton();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		logger.info("providing customer details.....");
		
		addcust.custName("XYZ");
		addcust.custGender("M");
		addcust.custDOB("07", "23", "1990");
		Thread.sleep(3000);
		addcust.custAddress("xyz");
		addcust.custCity("Xyz");
		addcust.custState("xyz");
		addcust.custPinNumber("267576");
		addcust.custTelephoneNo("536276125");
		String email = randomeString() + "@gmail.com ";
		addcust.custEmailID(email);
		addcust.custAddress("wkdkgjkn");
		addcust.custSubmit();
		
		Thread.sleep(3000);
		logger.info("Validation Started....");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");
		
		if(res==true) {
			Assert.assertTrue(true);
			logger.info("Test case is passed");
		} else {
			
			logger.info("Test case is Failed");
			captureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
		}
		
	}
	
	

}
