package com.intBankingV1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver d){
		
		driver = d;
		PageFactory.initElements(d, this);
	}
	
	@FindBy(name = "uid")
	@CacheLookup
	WebElement RegUserName;
	
	@FindBy(name = "password")
	@CacheLookup
	WebElement RegPassword;
	
	@FindBy(name ="btnLogin")
	@CacheLookup
	WebElement RegLoginButton;
	
	@FindBy(xpath ="/html/body/div[3]/div/ul/li[15]/a")
	@CacheLookup
	WebElement linkLogout;
	
	public void setUserName(String user) {
		RegUserName.sendKeys(user);
	}
	
	public void setPassword(String pass) {
		RegPassword.sendKeys(pass);
	}
	
	public void clickButton() {
		RegLoginButton.click();
	}
	
	public void clickLogout() {
		linkLogout.click();
	}

}
