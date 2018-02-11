package com.automation.UIAutomations.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import com.automation.UIAutomations.testbase.TestBase;
import com.automation.UIAutomations.uiActions.HomePage;

public class TC_01VerifyLoginWithInvalidCredentials extends TestBase {
	
	HomePage homepage;
	
	@BeforeTest
	public void setup(){
   init();
	}
	@Test
	public void verifyLoginWithInvalidCredentials(){
		homepage=new HomePage(driver);
		homepage.loginToApplication("test@gmail.com", "Password");
		Assert.assertEquals(homepage.getinvaildlogintext(),"Authentication failed.");
		
		
		
	}
	
	@AfterTest
	public void endTest(){
		driver.close();
		
		
	}
	
	
	
	
	

}
