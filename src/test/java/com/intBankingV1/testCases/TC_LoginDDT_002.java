package com.intBankingV1.testCases;

import java.io.IOException;

import org.openqa.selenium.NoAlertPresentException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.intBankingV1.pageObject.LoginPage;
import com.intBankingV1.utilities.XLUtiles;

public class TC_LoginDDT_002 extends BaseClass {

	@Test(dataProvider = "LoginData")
	public void loginDDT(String user, String pwd) throws InterruptedException {

		LoginPage lp = new LoginPage(driver);
		lp.setUserName(user);
		logger.info("Username Provided");
		lp.setPassword(pwd);
		logger.info("Password is Provided");
		lp.clickButton();

		Thread.sleep(3000);

		if (isAlertPresent() == true) {

			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			Assert.assertTrue(false);
			logger.warn("Loginin Failed");

		} else {
			
			Assert.assertTrue(true);
			logger.info("Logging is Passed");
			lp.clickLogout();
			Thread.sleep(3000);
			driver.switchTo().alert().accept();
			driver.switchTo().defaultContent();
			
		}
	}

	// To Check alert is present or not.
	public boolean isAlertPresent() {
		try {
			
			driver.switchTo().alert().accept();
			return true;
			
		} catch (NoAlertPresentException e) {
			
			return false;
		}
	}

	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/intBankingV1/testData/LoginData.xlsx";
		int rowNum = XLUtiles.getRowCount(path, "Sheet1");
		int colNum = XLUtiles.getCellCount(path, "Sheet1", 1);

		String[][] loginData = new String[rowNum][colNum];

		for (int i = 0; i < rowNum; i++) {

			for (int j = 0; j < colNum; j++) {
				loginData[i - 1][j] = XLUtiles.getCellData(path, "Sheet1", i, j);
			}
		}
		return loginData;
	}
}
