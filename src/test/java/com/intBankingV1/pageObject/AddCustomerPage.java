package com.intBankingV1.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
	
	WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver){
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement txtCuomerName;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[3]/div/ul/li[2]/a")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using ="name")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.ID_OR_NAME, using = "dob")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.NAME, using = "addr")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how = How.NAME, using = "city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.NAME, using = "state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how = How.NAME, using = "pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how = How.NAME, using = "telephoneno")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how = How.NAME, using = "emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how = How.NAME, using = "password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how = How.NAME, using = "sub")
	@CacheLookup
	WebElement btnsubmit;
	
	@FindBy(how = How.NAME, using = "addcustom")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
	}
	
	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
	}
	
	public void custGender(String cgender) {
		rdGender.click();
	}
	
	public void custDOB(String mm, String dd, String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
	}
	
	public void custAddress(String caddress) {
		txtaddress.sendKeys(caddress);
	}
	
	public void custCity(String ccity) {
		txtcity.sendKeys(ccity);
	}
	
	public void custState(String cstate) {
		txtstate.sendKeys(cstate);
	}
	
	public void custPinNumber(String cpinno) {
		txtpinno.sendKeys(cpinno);
	}
	
	public void custTelephoneNo(String ctelphone) {
		txttelephoneno.sendKeys(ctelphone);
	}
	
	public void custEmailID(String cemailid) {
		txtemailid.sendKeys(String.valueOf(cemailid));
	}
	
	public void custPassword(String cpass) {
		txtpassword.sendKeys(cpass);
	}
	
	public void custSubmit() {
		btnsubmit.click();
	}

}
