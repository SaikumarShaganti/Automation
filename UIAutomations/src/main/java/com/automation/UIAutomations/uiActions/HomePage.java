package com.automation.UIAutomations.uiActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.automation.UIAutomations.testbase.TestBase;

public class HomePage  {
WebDriver driver;

@FindBy(xpath="//a[@class='login']")
WebElement signIn;

@FindBy(xpath="//input[@id='email']")
WebElement LoginEmail;

@FindBy(xpath="//input[@id='passwd']")
WebElement LoginPassword;


@FindBy(xpath="//button[@name='SubmitLogin']")
WebElement SubmitButton;


@FindBy(xpath="//*[text()='Authentication failed.']")
WebElement authenticationFailed;
/*
@FindBy(xpath="//input[@name='email_create']")
WebElement createEmail;

@FindBy(xpath="//i[@class='icon-user left']")
WebElement createebtn;

@FindBy(xpath="//input[@id='id_gender1']")
WebElement Mrcheck;


@FindBy(xpath="//input[@id='id_gender2']")
WebElement MrsCheck;


@FindBy(xpath="//input[@name='customer_firstname']")
WebElement FirstName;

@FindBy(xpath="//input[@name='customer_lastname']")
WebElement LatName;

@FindBy(xpath="//input[@id='email']")
WebElement Email;

@FindBy(xpath="//input[@type='password']")
WebElement Regpwd;

@FindBy(xpath="//select[@name='days']")
WebElement day;
Select bday=new Select(day);

@FindBy(xpath="//select[@name='months']")
WebElement month;

Select bmonth=new Select(month);

@FindBy(xpath="//select[@name='years']")
WebElement year;
Select byear=new Select(year);

@FindBy(xpath="//input[@name='newsletter']")
WebElement newslettercheck;

@FindBy(xpath="//input[@name='firstname']")
WebElement regfrstname;

@FindBy(xpath="//input[@name='lastname']")
WebElement reglastname;


@FindBy(xpath="//input[@name='company']")
WebElement regCompay;

@FindBy(xpath="//input[@name='address1']")
WebElement address1;

@FindBy(xpath="//input[@name='city']")
WebElement regcity;

@FindBy(xpath="//select[@name='id_state']")
WebElement state;
Select rstate=new Select(state);

@FindBy(xpath="//select[@name='id_country']")
WebElement country;
Select rcountry=new Select(country);

@FindBy(xpath="//input[@name='phone_mobile']")
WebElement phonenum;

@FindBy(xpath="//input[@name='postcode']")
WebElement postal;
@FindBy(xpath="//span[text()='Register']")
WebElement regbtn;*/

@FindBy(xpath="//p[text()='Welcome to your account. Here you can manage all of your personal information and orders.']")
WebElement regpagetext;

/*public void regestration(String FirstName,String LastName,String Password,String Email,
		String rfirstname,String RLastname,String company,String address,String city,String Postal, String mobile ) throws Exception{
	createEmail.sendKeys("SSK1@gmail.com");
	createebtn.click();
	Thread.sleep(3000);
	Mrcheck.click();
	
	this.FirstName.sendKeys(FirstName);
	LatName.sendKeys(LastName);
	this.Email.clear();
	this.Email.sendKeys(Email);
	Regpwd.sendKeys(Password);
	bday.selectByVisibleText("12");
	bmonth.selectByVisibleText("May");
	byear.selectByVisibleText("1994");
	newslettercheck.click();
	regfrstname.sendKeys(rfirstname);
	reglastname.sendKeys(RLastname);
	regCompay.sendKeys(company);
	address1.sendKeys(address);
	regcity.sendKeys(city);
	rstate.selectByVisibleText("Utah");
	postal.sendKeys(Postal);
	phonenum.sendKeys(mobile);
	regbtn.click();
	
	
	
}*/


/* this constructor is used to initialize all webelements  by supplying driver 
 * object using this key word this refers to current class objects in page factory approch*/
public HomePage(WebDriver driver){
	
	PageFactory.initElements(driver, this);
	
}

public void loginToApplication(String emailAddress, String Password){
	signIn.click();
	LoginEmail.sendKeys(emailAddress);
	LoginPassword.sendKeys(Password);
	SubmitButton.click();
	
}
public String getinvaildlogintext(){
	return authenticationFailed.getText();
}





}
