package com.automation.UIAutomations.uiActions;

import org.testng.Assert;
import org.testng.annotations.*;

import com.automation.UIAutomations.testbase.TestBase;

public class TC_02Regestration extends TestBase {
	String FirstName="Saikumar";
	String LastName="Shaganti";
	String Password="Sai1234";
	String Email="SSK2@gmail.com";
	String rfirstname="Saikumar";
	String RLastname="Shaganti";
	String company="Sytel.pvt.ltd";
	String address="Hyderabad";
	String city="Secunderabad";
	String Postal="500003";
	String mobile="9542163083";
	//String Regpagetext="Welcome to your account. Here you can manage all of your personal information and orders.";
	
	HomePage homepage;

	@BeforeTest
	public void login(){
		init();
	}
	@Test
	public void regestration() throws Exception{
		homepage=new HomePage(driver);
		//homepage.regestration(FirstName, LastName, Password, Email, rfirstname, RLastname, company, address, city, Postal, mobile);
		homepage.signIn.click();
		if(homepage.regpagetext.isDisplayed()){
			System.out.println("User got registered and test case is passed");
		}else{
			Assert.fail("Test case is failed please check your code :(");
		}
		
		
	}
	@AfterTest
	public void close(){
		driver.quit();
	}
	
	
}
